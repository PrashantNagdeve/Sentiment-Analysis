/*
 * This source file contains the code for taking manual user reviews 
*/
package OnePageGUIAANVPkg;

/**
 * Class facilitates taking manual reviews
 */
public class Manual {
    public void ManualMethod()
    {
        int NumberOfLine;
        int lineNumber=0;
        String inputtext[]=BackEndGUI.txtAreaManualInput.getText().split("\n");
        NumberOfLine=inputtext.length;
        System.out.println(NumberOfLine);
        OnePageGUIAANV.reviews=new String[30];
        while(lineNumber<NumberOfLine)
        {
           System.out.println(lineNumber+inputtext[lineNumber]);
           String str=inputtext[lineNumber];
           OnePageGUIAANV.reviews[lineNumber]=str;
           BackEndGUI.txtAreaInputReview.append(str);
           BackEndGUI.txtAreaInputReview.append("\n");
           lineNumber++; 
        }
        System.out.println("finish");         
    }
}
