/**
 * The file is used for graphical representation of the calculated result.
 *
 */
package OnePageGUIAANVPkg;
/**
 * The class is used for displaying the result in the form of bar chart and pie chart.
 */
public class ResultDisplay {
    
 /**
 * The method is used for displaying both the bar chart and pie chart.
 *
 */
    public void Display()
    {
        UnaryAlgorithm unaryAlgorithmObj=new UnaryAlgorithm();
        unaryAlgorithmObj.StatementWiseSCore();
        
        PieChart pieChartObj = new PieChart();
        pieChartObj.displayPieChart();
       
       
        BarChart barChartObj = new BarChart();
        barChartObj.displayBarChart();
            
        
        
    }

    public void Decision()
    {
        
    }

}
