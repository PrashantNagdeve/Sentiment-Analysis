/*
 * This file contains the code for retrieving the score from the sentiwordnet dictionary.
 */
package OnePageGUIAANVPkg;
import java.util.Enumeration;

public class ScoreRetrival {       
   public void getScore()throws Exception 
   {
        Enumeration eSentList=OnePageGUIAANV.sentenceList.elements();
        int linenumber = 0;
        int lenword;
        int Wordnoinsen;//to traverse a single sentence
        Sentence aux;
        String pathToSWN = "SentiWordnet/SentiWordNet_3.0.0.txt";
        SentiWordNetCode sentiwordnet=new SentiWordNetCode(pathToSWN);
        while(eSentList.hasMoreElements())
        { 
         
           aux = OnePageGUIAANV.sentenceList.elementAt(linenumber);
           lenword=aux.PosCat.size();
           Wordnoinsen=0;
            while(Wordnoinsen<lenword)
            {
                 
                 aux.PosScore.add(sentiwordnet.extract(aux.PosWord.elementAt(Wordnoinsen), aux.PosCat.elementAt(Wordnoinsen)));               
             
             
                 System.out.print(" ( "+aux.PosWord.elementAt(Wordnoinsen)+", "+aux.PosCat.elementAt(Wordnoinsen)+", "+aux.PosScore.elementAt(Wordnoinsen) +" )"); 
                 Wordnoinsen++;
            }
            linenumber++;
            System.out.println();
            eSentList.nextElement();
        }
   }

   }
