
package uml;

import javax.swing.JOptionPane;


public class Bill {
  
        
    
/*------METHOD'S TO CHOSSE THE BILL OF THAT SPECIFIC CURRENCY--------*/
      
    public int dollarBill(){
        
          String[] option$ = {"$1", "$2", "$5", "$10", "$20", "$50", "$100"};
          
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How much money are you inputting", //message 
                    "Money Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    option$, //array of texts for the buttons
                    option$[0]);     //default button text
         
        //converting the choosed Index to real bill value.
        return switch (bill$Choice) {
            case 0 -> 1;
            case 1 -> 2;
            case 2 -> 5;
            case 3 -> 10;
            case 4 -> 20;
            case 5 -> 50;
            case 6 -> 100;
            default -> -1;
        };
      
    }
      
      
      
      public int euroBill(){
        
          String[] option€ = {"5€","10€","20€","50€","100€","200€","500€"};
          
          int bill€Choice = JOptionPane.showOptionDialog(null, //[arent component
                    "How much money are you inputting" , //message 
                    "Money Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    option€, //array of texts for the buttons
                    option€[0]); //default button text
       
           //converting the choosed Index to real bill value.
        return switch (bill€Choice) {
            case 0 -> 5;
            case 1 -> 10;
            case 2 -> 20;
            case 3 -> 50;
            case 4 -> 100;
            case 5 -> 200;
            case 6 -> 500;
            default -> -1;
        };
            
}
       
      
      
           
   public int IQDBill(){
        
          String[] optionIQD = {"500IQD","1,000IQD","5,000IQD","10,000IQD","25,000IQD", "50,000IQD"};
          
         int  billIQDChoice = JOptionPane.showOptionDialog(null, //[arent component
                    "How much money are you inputting" , //message 
                    "Money Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    optionIQD, //array of texts for the buttons
                    optionIQD[0]); //default button text
       
                    //converting the choosed Index to real bill value.
        return switch (billIQDChoice) {
            case 0 -> 500;
            case 1 -> 1000;
            case 2 -> 5000;
            case 3 -> 10000;
            case 4 -> 25000;
            case 5 -> 50000;
            default -> -1;
        };
         
            }  
      
    
} //closing tag of the class.