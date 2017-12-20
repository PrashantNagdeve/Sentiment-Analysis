/*
 * It will import the charting lib to generate the graphical representation of the result.
 */
package OnePageGUIAANVPkg;

import java.util.Enumeration;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *This class generate the BarChart of the result.
 */
public class BarChart {
    
    
   private static CategoryDataset createDataset() {
       
       DefaultCategoryDataset objDataset = new DefaultCategoryDataset();
       
       
       Enumeration eSentList=OnePageGUIAANV.sentenceList.elements();
         Sentence aux;
         Double TotalPositiveScore=0.0,TotalNegativeScore=0.0,TotalNeutralScore=0.0,Percentagepositive=0.0,PercentageNegative=0.0,PercentageNeutral=0.0;
         int linenumber=0;
         Double PositiveCount=0.0,NegativeCount=0.0,NeutralCount=0.0;
         while(eSentList.hasMoreElements())
         {
                      Double TempScore=0.0;
                      aux=OnePageGUIAANV.sentenceList.elementAt(linenumber); 
                     
                     TempScore= aux.TotalScoreofSentence.elementAt(0);
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
                     
                      //System.out.println("TempScore="+TempScore);
                      //System.out.println(linenumber+"="+aux.TotalScoreofSentence);
                      linenumber++;
                      eSentList.nextElement();            
         }
         
         
         Percentagepositive=(TotalPositiveScore/PositiveCount)*100;
         PercentageNegative=(TotalNegativeScore/NegativeCount)*100*-1;
        
         PercentageNeutral=(TotalNeutralScore/NeutralCount)*100;
         objDataset.setValue(PositiveCount,"","Positive");
         objDataset.setValue(NegativeCount,"","Negative");
       //  objDataset.setValue(PercentageNeutral,"","Neutral");
         
         return objDataset; 
   }
   
   /**
    * Return the instance of chart
    * @return chart object
    */
    private static JFreeChart createChart() {
        //Get the sample dataset
        CategoryDataset chartData = createDataset();

        //Create the chart
        JFreeChart objChart = ChartFactory.createBarChart(
                "Sentiment Analysis Bar Chart", //Chart title
                "Sentiment Polarity", //Domain axis label
                "Percentage Score", //Range axis label
                chartData, //Chart Data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend?
                true, // include tooltips?
                false // include URLs?
                );
        return objChart;
    }
    /**
     * It will show theBarchart of result.
     */
    public void displayBarChart()
    {
        JFreeChart objChart = createChart();

        // create and display a frame...
        ChartFrame frame = new ChartFrame("Sentiment Analysis BAR CHART", objChart);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(350, 300);
        frame.setResizable(false);
        frame.setLocation(900,400);
    }
    
}


