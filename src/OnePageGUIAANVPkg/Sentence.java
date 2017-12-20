/**
 * This file contains the code for declaration of the static data structure used in the project.
 */
package OnePageGUIAANVPkg;

import java.util.Vector;
/**
 * The class defines the Sentence data structure which is static.
 * The class also contains the getter methods for accessing the PosWord,PosCat and PosScore.
 */
public class Sentence {
     Vector<String> PosWord=new Vector<>();
     Vector<String> PosCat=new Vector<>();
     Vector<Double> PosScore=new Vector<>();
     Vector<String> AdverbCategory=new Vector<>();
     Vector<String> PosAdverb=new Vector<>();
     Vector<Double> AdverbScore=new Vector<>();
     //Getter for PosWord Vector
     public Vector<String>getPosWord(){return PosWord;};
     Vector<Double>TotalScoreofSentence=new Vector<>();
     //Gette for PosCat Vector0
     public Vector<String>getPosCat(){return PosCat;};
     public Vector<Double>getPosScore(){return PosScore;};
}
