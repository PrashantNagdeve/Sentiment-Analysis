/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OnePageGUIAANVPkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Upload {
    static int linecnt;
    FileReader ReadReviewfr;
    
    public void UploadFile()
    {
    try{
           ReadReviewfr=new FileReader(Browse.filepath);
           BufferedReader ReviewBufferbr=new BufferedReader(ReadReviewfr);
           String Buffercontent;
           OnePageGUIAANV.reviews=new String[1000];          
           while((Buffercontent=ReviewBufferbr.readLine())!=null)
           {
               BackEndGUI.txtAreaInputReview.append(Buffercontent);             
               OnePageGUIAANV.reviews[linecnt]=Buffercontent;
               System.out.println(OnePageGUIAANV.reviews[linecnt]);
               BackEndGUI.txtAreaInputReview.append("\n");
               linecnt++;              
           } 
       }
       catch(IOException ex)
       {
           System.out.println("Error in reading file!!");
       }  
    }
}
