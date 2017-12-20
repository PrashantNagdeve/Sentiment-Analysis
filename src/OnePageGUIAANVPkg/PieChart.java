/*
 * This class is used for PieChart representation of the calculated result.
 */
package OnePageGUIAANVPkg;

import java.util.Enumeration;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 * This class contains methods for dataset for Pie-chart,Creating the Pie-Chart and  display Pie-Chart.
 */
public class PieChart {
    /**
     * The method creates the dataset for Pie chart.
     *  
     */
     private static PieDataset createDataset() {
         
         Enumeration eSentList=OnePageGUIAANV.sentenceList.elements();
         Sentence aux;
         Double TotalPositiveScore=0.0,TotalNegativeScore=0.0,TotalNeutralScore=0.0,Percentagepositive=0.0,PercentageNegative=0.0,PercentageNeutral=0.0;
         int linenumber=0;
         Double PositiveCount=0.0,NegativeCount=0.0,NeutralCount=0.0,NofSent=0.0;
         while(eSentList.hasMoreElements())
         {
                     Double TempScore=0.0;
                     aux=OnePageGUIAANV.sentenceList.elementAt(linenumber); 
                     
                     TempScore= aux.TotalScoreofSentence.elementAt(0);
                     
                     NofSent=NofSent+1.0;
                     if(TempScore==0.0)
                     {
                         NeutralCount++;
                         TotalNeutralScore+=TotalNeutralScore;
                     }
                     if(TempScore>0.0)
                     {  
                         PositiveCount++;
                         TotalPositiveScore+=TempScore;
                     }
                     if(TempScore<0.0)                        
                     {
                         NegativeCount++;
                         TotalNegativeScore+=TempScore;
                     }
                     linenumber++;
                     eSentList.nextElement();            
         }
         
         DefaultPieDataset objDataset = new DefaultPieDataset();
         objDataset.setValue("positive", PositiveCount);
         objDataset.setValue("Negative",NegativeCount);
                 
         System.out.println("# +v sentence ="+PositiveCount);
         System.out.println("# -v Sentence ="+NegativeCount);
         
         System.out.println("+v %="+(Percentagepositive=(PositiveCount/NofSent)*100));
                
         return objDataset;
    }
     
     /**
      * The method creates an object for the Pie chart.
      *  
      */
    private static JFreeChart createChart() {
        //Get the sample dataset
        PieDataset objDataset = createDataset();

        //Create the chart
        JFreeChart objChart = ChartFactory.createPieChart(
                "Sentiment Pie Chart", //Chart title
                objDataset, //Chart Data
                true, // include legend?
                true, // include tooltips?
                false // include URLs?
                );

        return objChart;
    }
    
    /**
     * The method displays the created Pie chart.
     */
    public void displayPieChart()
    {
         //Get the chart created
        JFreeChart objChart = createChart();

        // create and display a frame...
        ChartFrame frame = new ChartFrame("Sentiment Analysis PieChart", objChart);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(350, 300);
        frame.setResizable(false);
        frame.setLocation(900,75);
    }
}
