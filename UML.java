
package uml;

import javax.swing.JOptionPane;


public class UML {

    /**
     * @param args the command line arguments
     */
    
    
    
   public static void main(String[] args) {
       
       int choice;  //to store the input of the user.
         
       
       
    /*---------------------BEGINING THE PROGRAM---------------------------------*/    
      
    /*------------THE FIRST INTERFACE THAT THE USER WOULD SEE-------------------*/
    
      //and array containS texts for the buttons CONSEQUENTLY.  
      String[] options = {"Dispensation", "coalesce", "conversion"};
       
       choice = JOptionPane.showOptionDialog( null, //parent component
          "Mission Selection", //Message
          "welcome choose your mission", //Title
          JOptionPane.YES_NO_CANCEL_OPTION, //having 3 buttons which have the value of the above Array.
              JOptionPane.QUESTION_MESSAGE, //Type of the showOptionPane
              null, // Icon, null for icon.
              options, //The array that has the text for the buttons.
              options[0]); // Defualt button text
       
       
        /*-------------IDENTIFING NEXT EXECUTION BASED ON THE USER INPUT------------*/
        
        //-------DISPENSATION OPTION---------.
        switch (choice) {
            case JOptionPane.YES_OPTION -> {
                
                //here: if the user choosed the first option( DISPENSATION)! which the program reads it as YES_OPTION.
                
                /*instantiating an object from the MoneyExchangeSystem class that contains furthur
                calculations and processing for the DISPENSATION. */
                
                MoneyExchangeSystem dis = new  MoneyExchangeSystem();
                dis.dispensationChoice();
            }
            case JOptionPane.NO_OPTION -> {
                
                //here: if the user choosed the second option(coalesce)! which the program reads it as NO_OPTION.
                
                /* Instantiating an object from the MoneyExchangeSystem class that contains further calculation
                and processing for the COALESCEING.  */
                
                MoneyExchangeSystem coA = new  MoneyExchangeSystem();
                coA.coalesceChoice();
            }
            case JOptionPane.CANCEL_OPTION -> {
                //here: if the user choosed the third option(convertion)! which the program reads it as CANCEL_OPTION.
                
                /* Instantiating an object from the MoneyExchangeSystem class that contains further calculations
                and processing for the CONVERSION.  */
                
                MoneyExchangeSystem conV = new  MoneyExchangeSystem();
                conV.convertChoice();
            }
            default -> {
            }
        }
        
        
        
        
        
    }
    
}
