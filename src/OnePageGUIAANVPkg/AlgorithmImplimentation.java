/*
 This is the Source file Containing the aanv algorithm implementation. 
 */
package OnePageGUIAANVPkg;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import java.io.*;
 /**
  * This class contains the methods for calculating the score of the statement according to the combination of AANV i.e.Adjective, Adverb, Noun, Verb. 
  *
  */

public class AlgorithmImplimentation {
    
   /**
    * It will show score of sentence
    * @throws IOException 
    */
   
    public void showScore()throws IOException
    {
       
        Enumeration eSentList=OnePageGUIAANV.sentenceList.elements();
        int linenumber = 0;
        int sentenceLengthInDS;
        int wordNumberInSentence;//to traverse a single sentence
        Sentence aux;
        while(eSentList.hasMoreElements())
        { 
                
          aux = OnePageGUIAANV.sentenceList.elementAt(linenumber);
          sentenceLengthInDS=aux.PosCat.size();
          wordNumberInSentence=0;
            while(wordNumberInSentence<sentenceLengthInDS)
            {
                 System.out.print(" ( "+aux.PosWord.elementAt(wordNumberInSentence)+", "+aux.PosCat.elementAt(wordNumberInSentence)+", "+aux.PosScore.elementAt(wordNumberInSentence) +" )"); 
                
                 if(aux.PosCat.elementAt(wordNumberInSentence).equals("r"))
                 {
                     String tempAdverb=aux.PosWord.elementAt(wordNumberInSentence);
                     char ch=searchAFF(tempAdverb);
                     
                     if(ch=='A')
                     {
                          System.out.print(" AFF");
                          aux.AdverbCategory.add("AFF");
                          
                     }
                     else                          
                     {
                           ch=searchDoubt(tempAdverb);
                          
                         if(ch=='D')
                         {
                             System.out.print("DOUBT");
                             aux.AdverbCategory.add("DOUBT");
                         }
                         else
                         {
                             ch=searchStrongIntensifying(tempAdverb);
                             if(ch=='S')
                             {
                                 System.out.print("STRONG");
                                aux.AdverbCategory.add("STRONG");
                             }
                             else
                             {
                                 ch=searchWeakIntensyfying(tempAdverb);
                                 if(ch=='W')
                                 {
                                     System.out.print("WEAK");
                                     aux.AdverbCategory.add("WEAK");
                                 }
                                 else
                                 {
                                     ch=searchNeagation(tempAdverb);
                                     if(ch=='N')
                                     {
                                         System.out.print("MIN");
                                         aux.AdverbCategory.add("MIN");
                                     }
                                     else
                                     {
                                         System.out.print("OTHER");
                                         aux.AdverbCategory.add("OTHER");
                                     }
                                 }
                                 
                              }
                         }
                         
                     }
                     
                 }
                  wordNumberInSentence++;
            }
            linenumber++;
            System.out.println();
            eSentList.nextElement();
        }
        System.out.println("show all tuples");
        showtuple();
   }
    /**
     * This method will show the tuple as word its category and sentiwordnet score
     * ex:(good, a,0.625)
     * a->adjective
     * r->adverb
     * n->noun
     * v->verb
     */
    
    public void showtuple()
    {
        Enumeration eSentList=OnePageGUIAANV.sentenceList.elements();
        int linenumber = 0;
        int sentenceLengthInDS;
        int AdverbsInSentence;
        int Wordnoinsen;//to traverse a single sentence
        Sentence aux;
        while(eSentList.hasMoreElements())
        { 
          aux =OnePageGUIAANV.sentenceList.elementAt(linenumber);
          sentenceLengthInDS=aux.PosCat.size();
          AdverbsInSentence=aux.AdverbCategory.size();
          System.out.println(AdverbsInSentence);
          Wordnoinsen=0;
            while(Wordnoinsen<sentenceLengthInDS)
            {
                  System.out.print(" ( "+aux.PosWord.elementAt(Wordnoinsen)+", "+aux.PosCat.elementAt(Wordnoinsen)+", "+aux.PosScore.elementAt(Wordnoinsen) +" )");
                  BackEndGUI.txtAreaScores.append(" ( "+aux.PosWord.elementAt(Wordnoinsen)+", "+aux.PosCat.elementAt(Wordnoinsen)+", "+aux.PosScore.elementAt(Wordnoinsen) +" )");
                  Wordnoinsen++;
                               
            }
            
            int adverbCount=0;
            while(adverbCount<AdverbsInSentence)
            {
                System.out.println(aux.AdverbCategory.elementAt(adverbCount));
                BackEndGUI.txtAreaScores.append(aux.AdverbCategory.elementAt(adverbCount));
                adverbCount++;
            }
            linenumber++;
            BackEndGUI.txtAreaScores.append("\n");
            System.out.println("\n");
            eSentList.nextElement();        
        }
    
    }
    /**
     * 
     * @param AdverbSearchKey
     * @return it will return the character a if the adverb belongs to affirmation 
     * A->Affirmation
     * X->Other
     * @throws IOException 
     */
    public char searchAFF(String AdverbSearchKey)throws IOException
    {
           FileReader frAFF=new FileReader("AdverbCategory/Affirmation.txt");
           BufferedReader AFF_buffer=new BufferedReader(frAFF);
           String TempFileReadStr;
           while((TempFileReadStr=AFF_buffer.readLine())!=null)
           {
              if(AdverbSearchKey.equals(TempFileReadStr))
               {
                     return 'A';                 
               }                           
           } 
           return 'X';  
    }
    /**
     * 
     * @param AdverbSearchKey
     * @return it will return the character a if the adverb belongs to doubt
     * D->Doubt
     * X->Other
     * @throws IOException 
     */
    public char searchDoubt(String AdverbSearchKey)throws IOException
    {
           FileReader frAFF=new FileReader("AdverbCategory/Doubt.txt");
           BufferedReader AFF_buffer=new BufferedReader(frAFF);
           String TempFileReadStr;
           while((TempFileReadStr=AFF_buffer.readLine())!=null)
           {
              if(AdverbSearchKey.equals(TempFileReadStr))
               {
                     return 'D';                 
               }                           
           } 
           return 'X';
    }
    /**
     * 
     * @param AdverbSearchKey
     * @return it will return the character a if the adverb belongs to strong intensifying 
     *S->Strong Intensifying 
     *X->Other
     * @throws IOException 
     */
    public char searchStrongIntensifying(String AdverbSearchKey)throws IOException
    {
           FileReader frAFF=new FileReader("AdverbCategory/StrongIntensifying.txt");
           BufferedReader AFF_buffer=new BufferedReader(frAFF);
           String TempFileReadStr;
           while((TempFileReadStr=AFF_buffer.readLine())!=null)
           {
              if(AdverbSearchKey.equals(TempFileReadStr))
               {
                     return 'S';                 
               }                           
           } 
           return 'X';
    }
    /**
     * 
     * @param AdverbSearchKey
     * @return it will return the character a if the adverb belongs to weak Intensifier 
     * W->Weak Intensifying
     * X->Other
     * @throws IOException 
     */
    public char searchWeakIntensyfying(String AdverbSearchKey)throws IOException
    {
           FileReader frAFF=new FileReader("AdverbCategory/WeakIntensifying.txt");
           BufferedReader AFF_buffer=new BufferedReader(frAFF);
           String TempFileReadStr;
           while((TempFileReadStr=AFF_buffer.readLine())!=null)
           {
              if(AdverbSearchKey.equals(TempFileReadStr))
               {
                     return 'W';                 
               }                           
           } 
           return 'X';
    }
    /**
     * 
     * @param AdverbSearchKey
     *  @return it will return the character a if the adverb belongs to Negation 
     * N->Negation
     * X->Other
     * @throws IOException 
     */
    public char searchNeagation(String AdverbSearchKey)throws IOException
    {
           FileReader frAFF=new FileReader("AdverbCategory/Negation.txt");
           BufferedReader AFF_buffer=new BufferedReader(frAFF);
           String TempFileReadStr;
           while((TempFileReadStr=AFF_buffer.readLine())!=null)
           {
              if(AdverbSearchKey.equals(TempFileReadStr))
               {
                     return 'N';                 
               }                           
           } 
           return 'X';
    }
    
}
