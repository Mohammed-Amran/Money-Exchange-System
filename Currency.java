
package uml;

import javax.swing.JOptionPane;


public class Currency {
  
    
  //Data field.
   private int chosedCurrency;
   
    
   //Method 
   public int chooseCurrency(){
        
   //and array that contain currency names on the buttons. 
   String[] optionsCurrency = {"$ DOLLAR", "€ Euro", "IQD"};
        
      
   return chosedCurrency = JOptionPane.showOptionDialog( null, //parent component
               "Currency Selection", //Message
               "Dispensation choosen!", //Title
               JOptionPane.YES_NO_CANCEL_OPTION, //The 3 buttons that have value of the above array.
              JOptionPane.QUESTION_MESSAGE, // Type of the showoptionPane.
              null, // Icon, null for icon
              optionsCurrency, // The array that has the text for the buttons.
              optionsCurrency[0]); // The default button text.
        
      
 
   }
      
              
} //closing tag of the class.
