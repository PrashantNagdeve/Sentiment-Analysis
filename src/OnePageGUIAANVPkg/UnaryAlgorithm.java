/*
 * To poscatange this template, poscatoose Tools | Templates
 * and open the template in the editor.
 */
package OnePageGUIAANVPkg;

import java.util.Enumeration;

public class UnaryAlgorithm 
{
    void applyAlgo()
    {
        Enumeration eSentList=OnePageGUIAANV.sentenceList.elements();
        int linenumber = 0;
        int sentenceLengthInDS;
        int Wordnoinsen;//to traverse a single sentence
        Sentence aux;
        int NumberOfAdverb=0;
        int NumberOfAdjective=0;
        int NumberOfNoun=0;
        int NumberOfVerb=0;
        Double finalSumAdjective=0.0;
        Double finalSumNoun=0.0;
        Double adjective,adverb,verb,noun,StatementScore;//this variables to store the score of aanv belonging to statement
        String poscat;
        while(eSentList.hasMoreElements())
        { 
          aux = OnePageGUIAANV.sentenceList.elementAt(linenumber);
          sentenceLengthInDS=aux.PosWord.size();
          Wordnoinsen=0;
          adjective=0.0;adverb=0.0;verb=0.0;noun=0.0;
          StatementScore=0.0;
           finalSumAdjective=0.0;
           NumberOfAdjective=0;
           NumberOfNoun=0;
            while(Wordnoinsen<sentenceLengthInDS)
               {
                    poscat=aux.PosCat.elementAt(Wordnoinsen);
                    /**if the word is adjective its score into adjective*/
                         if(poscat.equals("a"))                            
                         {
                           finalSumAdjective=finalSumAdjective+ aux.PosScore.elementAt(Wordnoinsen);
                           adjective=aux.PosScore.elementAt(Wordnoinsen); 
                           NumberOfAdjective=NumberOfAdjective+1;
                         }
                         /**if the word is adverb its score into adverb*/
                         if(poscat.equals("r"))                         
                         {
                           adverb=aux.PosScore.elementAt(Wordnoinsen);  
                           aux.AdverbScore.add(adverb);
                         }
                          /**if the word is verb its score into verb*/
                         if(poscat.equals("v"))                            
                         {
                           verb=aux.PosScore.elementAt(Wordnoinsen);  
                         }
                           /**if the word is noun its score into noun*/
                            if(poscat.equals("n"))
                             
                         {
                            finalSumNoun=finalSumNoun+aux.PosScore.elementAt(Wordnoinsen);           
                            noun=aux.PosScore.elementAt(Wordnoinsen);  
                            NumberOfNoun=NumberOfNoun+1;                          
                         }
                         
                          Wordnoinsen++;
                          //increment wordcounter so that it will point to next word in the statement vector
               }    
                         
         
        /**find out how many adverbs are present then according to that apply unary or binary algorithm*/
             NumberOfAdverb=aux.AdverbCategory.size();
             
               /*if  statement contains more than one adjective*/
             if(NumberOfAdjective>1){
                 System.out.println("Number OF Adje="+NumberOfAdjective);
                 adjective = finalSumAdjective/NumberOfAdjective;
                 System.out.println("AdjectiveFinalAvgScore="+adjective);
             }
             
            /*if statement contains more than noun */
             if(NumberOfNoun>1) {
                 System.out.println("Number of Noun="+NumberOfNoun);
                 noun = finalSumNoun/NumberOfNoun;
                 System.out.println("AdjectiveFinalAvgScore="+noun);
             }
         
             //No Adverb            
             if(NumberOfAdverb==0)
             {
              
                StatementScore= SimpleAlgo(adjective,verb,noun);
                System.out.println("No Adverb");
             }
             
             //unary
             if(NumberOfAdverb==1)
             {
                 String Catadverb=aux.AdverbCategory.elementAt(0);
                 StatementScore=UnaryAlgo(adverb,Catadverb,adjective,noun,verb);
                 System.out.println("unary="+StatementScore);
             }
  
             //binary
             if(NumberOfAdverb==2)
             {
                 String Catadverb1,Catadverb2;
                 Double adverb1,adverb2;
                 Catadverb1=aux.AdverbCategory.elementAt(0);
                 Catadverb2=aux.AdverbCategory.elementAt(1);
                 adverb1=aux.AdverbScore.elementAt(0);
                 adverb2=aux.AdverbScore.elementAt(1);
               
                 StatementScore=binaryAlgo(adverb1,Catadverb1,adverb2,Catadverb2,adjective,noun,verb);
                 System.out.println("binary="+StatementScore);
             }
             if(NumberOfAdverb>2)
             {
                 String Catadverb1,Catadverb2;
                 Double adverb1,adverb2;
                 Catadverb1=aux.AdverbCategory.elementAt(0);
                 Catadverb2=aux.AdverbCategory.elementAt(1);
                 adverb1=aux.AdverbScore.elementAt(0);
                 adverb2=aux.AdverbScore.elementAt(1);
               
                 StatementScore=binaryAlgo(adverb1,Catadverb1,adverb2,Catadverb2,adjective,noun,verb);
                 System.out.println("binary="+StatementScore);
             }
             aux.TotalScoreofSentence.add(StatementScore);
             linenumber++;
             System.out.println();
             eSentList.nextElement();        
        }
    
    }

    double UnaryAlgo(double adverbScore,String AdverbDegree,double adjectiveScore,double nounScore,double verbScore)
    {
        double score=0.0;
        if((AdverbDegree.equals("AFF")||AdverbDegree.equals("STRONG")))
        {
               score= scoreAffUnionStrong(adverbScore,adjectiveScore,nounScore,verbScore);
               return score;
        }
        
        if((AdverbDegree.equals("WEAK")||AdverbDegree.equals("DOUBT")))
        {
               score= scoreWeakUnionDoubt(adverbScore,adjectiveScore,nounScore,verbScore);
               return score;
        }
          
        if(AdverbDegree.equals("MIN"))
        {
               score= scoreMinimizer(adverbScore,adjectiveScore,nounScore,verbScore);
               return score;
        }
            
        if(AdverbDegree.equals("OTHER"))  
        {
               score = scoreOther(adverbScore,adjectiveScore,nounScore,verbScore);
        }
        return score;
        
    }
     
    double binaryAlgo(double adverbScore1,String catAdverb1,double adverbScore2,String catAdverb2,double adjectiveScore,double nounScore,double verbScore)
    {
        double unaryscore,Finalscore;
        unaryscore= UnaryAlgo(adverbScore2, catAdverb2, adjectiveScore, nounScore, verbScore);
        Finalscore=UnaryAlgo(adverbScore1, catAdverb1, unaryscore, 1.0, 0.0);
        return(Finalscore);
    }
   
     
     
     
  public double scoreAffUnionStrong(Double AdverbScore,Double AdjectiveScore,Double NounScore,Double VerbScore)
 {
     Double TotalScore=0.0;
     if(NounScore==0.0)
       NounScore=1.0;
    
     if(AdjectiveScore<0)  
    {
        TotalScore=(VerbScore+AdjectiveScore-(1-AdjectiveScore)*(1-VerbScore)*AdverbScore)*NounScore;
    }
    else
    {
        TotalScore=(VerbScore+AdjectiveScore+(1-AdjectiveScore)*(1-VerbScore)*AdverbScore)*NounScore; 
    }
    
    System.out.println("affUStrong=="+TotalScore);
     return TotalScore;
 }
 public double scoreWeakUnionDoubt(Double AdverbScore,Double AdjectiveScore,Double NounScore,Double VerbScore)
 {
     Double TotalScore=0.0;
     if(NounScore==0.0)
     NounScore=1.0;
      if(AdjectiveScore<0)  
    {
        TotalScore=(VerbScore+AdjectiveScore+(1-AdjectiveScore)*(1-VerbScore)*AdverbScore)*NounScore;
    }
    else
    {
        TotalScore=(VerbScore+AdjectiveScore-(1-AdjectiveScore)*(1-VerbScore)*AdverbScore)*NounScore;
    }
     
    System.out.println("weakUDoubt="+TotalScore);
        return TotalScore;
        
 }
 
 
 
 
 public double scoreMinimizer(Double AdverbScore,Double AdjectiveScore,Double NounScore,Double VerbScore)
 {
     Double TotalScore ;
    if(NounScore == 0.0)
     NounScore = 1.0;
    if(VerbScore == 0.0)
        VerbScore = 1.0;
     TotalScore=-AdjectiveScore*VerbScore*NounScore;
     
     
    System.out.println("Minimizer="+TotalScore);
 
 return TotalScore;
 }

 public double scoreOther(Double AdverbScore,Double AdjectiveScore,Double NounScore,Double VerbScore)
 {
     Double TotalScore = 0.0;
     TotalScore = (AdverbScore + AdjectiveScore + NounScore + VerbScore)/4.0; 
     return TotalScore;
 }  
 //**method for the statement not containing the adverb*/
    
    double SimpleAlgo(double adjectiveScore,double verbScore,double nounScore)
    {
        System.out.println("this ststement does not contain adverb");
        double TotalScore;
        
        TotalScore=(adjectiveScore+verbScore+nounScore)/3;
        return(TotalScore);
    }
    /**method to display statement  score*/
    void StatementWiseSCore()
          {
             Enumeration eSentList=OnePageGUIAANV.sentenceList.elements();
             Sentence aux;
             int linenumber=0;
                while(eSentList.hasMoreElements())
                  {
                      aux=OnePageGUIAANV.sentenceList.elementAt(linenumber);  
                      System.out.println(linenumber+"="+aux.TotalScoreofSentence);
                      linenumber++;
                      eSentList.nextElement();            
                  }
            
          }
    void AdjectiveAdverb(double adverb,double adjective)
    {
        //it is similar to aanv only sc(adj)+(1-sc(adj))*sc(adv) formula is used
    }
 }     