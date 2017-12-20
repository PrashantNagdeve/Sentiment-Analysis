/**
 * This file is for POS tagging of the review given by the user.
 */
package OnePageGUIAANVPkg;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import java.io.IOException;
/**
 *The class uses Stanford POS Tagger's jar.
 * 
 */
public class POStagging {
    MaxentTagger tagger;    
    
    public POStagging()
    {
        OnePageGUIAANV.tagedReview=new String[1000];
    }
  
/**
 * This method creates an object of type MaxentTagger,library methods for tagging the review are called on this object. 
 */
    public void TagReview()
    {
          try{   
             tagger = new MaxentTagger("taggers/left3words-wsj-0-18.tagger");
             for(int line=0;line<OnePageGUIAANV.reviews.length;line++)
             {
                 OnePageGUIAANV.tagedReview[line]=tagger.tagString(OnePageGUIAANV.reviews[line]);
                 BackEndGUI.txtAreaTaggedReview.append(OnePageGUIAANV.tagedReview[line]);
                 System.out.println(OnePageGUIAANV.tagedReview[line]);
                 BackEndGUI.txtAreaTaggedReview.append("\n");
                 
             }
           }
           catch(IOException | ClassNotFoundException | NullPointerException e)
           {
               System.out.println("POS Tagging is done!");
           }       
    }
    
}
