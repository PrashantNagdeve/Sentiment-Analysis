/*
 * This file will help to extract the words from the sentences
 */
package OnePageGUIAANVPkg;

import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *This class provides the token extraction facility and methods
 * 
 */
public class ExtractTagText {
    /**
     * This method will find out required word and its category return by the POS tagger.
     * Take only adverb, adjective, noun and verb
     */
    public void ExtractTag()
    {
        Pattern NounPat=Pattern.compile("[A-Za-z]+/NNS|[A-Za-z]+/NN");
        Pattern AdvPat=Pattern.compile("[A-Za-z]+/RBS|[A-Za-z]+/RB");
        Pattern AdjPat=Pattern.compile("[A-Za-z]+/JJS|[A-Za-z]+/JJ");
        Pattern VerbPat=Pattern.compile("[A-Za-z]+/VB|[A-Za-z]+/VB.");
        String StrToken;
        Matcher mat;
        StringTokenizer PosToken;
        int indexofslash;
        String tempstr=new String();
        
        for(int line=0;line<OnePageGUIAANV.tagedReview.length;line++)
        {
            
            Sentence aux = new Sentence();
            try{
         
                    PosToken=new StringTokenizer(OnePageGUIAANV.tagedReview[line]);
                    while(PosToken.hasMoreTokens())
                    {
                        StrToken=PosToken.nextToken();
                        mat=NounPat.matcher(StrToken);
                        if(mat.matches())
                        {    
                            System.out.print("\tNoun=>"+StrToken);
                            //BackEndGUI.txtAreaExtractedTags.append("Noun=>"+StrToken);
                            tempstr=StrToken;
                            System.out.println(tempstr);
                            indexofslash = tempstr.indexOf("/");
                            tempstr=tempstr.substring(0, indexofslash);
                            aux.getPosWord().add(tempstr);
                            aux.getPosCat().add("n");                                
                        }

                       mat=VerbPat.matcher(StrToken);
                       if(mat.matches())
                       {
                            System.out.print("\tVerb=>"+StrToken); 
                            //BackEndGUI.txtAreaExtractedTags.append("\tVerb=>"+StrToken);
                            tempstr = StrToken;
                            System.out.println(tempstr);
                            indexofslash = tempstr.indexOf("/");
                            tempstr=tempstr.substring(0, indexofslash);
                            aux.getPosWord().add(tempstr);
                            aux.getPosCat().add("v");
                        }
               
                        mat=AdvPat.matcher(StrToken);
                        if(mat.matches())
                        {
                            System.out.print("\tadverb=>"+StrToken);
                            //BackEndGUI.txtAreaExtractedTags.append("\tAdverb=>"+StrToken);
                            tempstr = StrToken;
                            System.out.println(tempstr);
                            indexofslash = tempstr.indexOf("/");
                            tempstr=tempstr.substring(0, indexofslash);
                            aux.getPosWord().add(tempstr);
                            aux.getPosCat().add("r");
                            aux.PosAdverb.add(tempstr);
                          
                        }
               
                        mat=AdjPat.matcher(StrToken);
                        if(mat.matches())
                        {
                            System.out.print("\tadjective=>"+StrToken); 
                            //BackEndGUI.txtAreaExtractedTags.append("\tAdjective=>"+StrToken);
                            tempstr=StrToken;
                            System.out.println(tempstr);
                            indexofslash = tempstr.indexOf("/");
                            tempstr=tempstr.substring(0, indexofslash);
                            aux.getPosWord().add(tempstr);
                            aux.getPosCat().add("a");
                        }  
                }
            OnePageGUIAANV.sentenceList.add(aux);
            System.out.println();
            }catch(Exception e){}
        }
    }
    
    /**
     * This method is used to display the tuples of sentences stored in the data structure.
     * variables tempPosWord,tempPosCat are used to store the retrieved POS word and POS category from the data structure.
     */
    public void ShowTuple()
    {
        int linenumber;
        linenumber = 0;
        String tempPosWord;
        String tempPosCat;
        Enumeration eSentList=OnePageGUIAANV.sentenceList.elements();
        while(eSentList.hasMoreElements())
        {
            int sentenceLengthInDS;
            tempPosWord = new String();
            tempPosCat = new String();
            Sentence aux =OnePageGUIAANV.sentenceList.elementAt(linenumber);
            sentenceLengthInDS=aux.PosWord.size();
            int sentenceLengthCount = 0;
            while(sentenceLengthCount<sentenceLengthInDS)
            {   
                tempPosWord=aux.PosWord.elementAt(sentenceLengthCount);
                System.out.print("("+ tempPosWord+",");
                BackEndGUI.txtAreaAANV.append("("+ tempPosWord+",");
                tempPosCat = aux.PosCat.elementAt(sentenceLengthCount);
                System.out.print(tempPosCat+")");
                BackEndGUI.txtAreaAANV.append(tempPosCat+")");
                sentenceLengthCount++;
            }
            linenumber++;
            eSentList.nextElement();
            System.out.println("\n\n");
            BackEndGUI.txtAreaAANV.append("\n");
        }
    }
 
    
    
}
