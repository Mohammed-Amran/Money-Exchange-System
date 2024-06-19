
package uml;

import javax.swing.JOptionPane;



public class MoneyExchangeSystem {
    
   
//data fields.
    private int gettedbill;
    private int gettedCurrency;
    
    
  //methods.
    
 //=====================-- Dispensation part STARTS --==========================   
    
  public void dispensationChoice(){
      
      //choosing the currency.
      
       Currency dispenObj = new Currency();
           
        gettedCurrency = dispenObj.chooseCurrency();
      
      // based on the currency choose bill.  
        
        switch (gettedCurrency) {
            case JOptionPane.YES_OPTION -> {
              
                //if dollar currency has chossed
                   
               Bill doll = new Bill();
               
               gettedbill = doll.dollarBill();
               
               
               //instantiating an object from dispensation class,
               // to do calculations on the choosed currency & bill.
               
               DispenseCalculator disD = new DispenseCalculator();
               
               double[] Dresult =  disD.do$Dispense(gettedbill);
               
              //--------- output --------------
              double Sum = 0;
              //Counting total cashback
              for (double Scoin : Dresult) {
                   
                   Sum += Scoin;
                                     
               }
               System.out.println("Dispensed Amount: " + "$" + Sum );
               
              //giving back total bill's
                for (double coin : Dresult) {
                   
                   System.out.println(coin);
               }
            }
            
            case JOptionPane.NO_OPTION -> {
                
                //if euro currency has chossed
              
               Bill eu = new Bill();
               
               gettedbill = eu.euroBill();
               
                //instantiating an object from dispensation class,
                // to do calculations on the choosed currency & bill.
                
                 DispenseCalculator disE = new DispenseCalculator();
               
              double[] Eresult =  disE.do€Dispense(gettedbill);
              
               double Sum = 0;
               //Counting total cashback
              for (double Scoin : Eresult) {
                   
           
                   Sum += Scoin;
               
               }
              System.out.println("Dispensed Amount: " + Sum + "€");
              
               for (double coin : Eresult) {
                   
                   System.out.println(coin);
               }
                
            }
            
            case JOptionPane.CANCEL_OPTION -> {
                
                //if IQD currency has chosed
                
                               
                Bill IQD = new Bill();
                
                gettedbill = IQD.IQDBill();
                
               //instantiating an object from dispensation class,
               // to do calculations on the choosed currency & bill.
               
                DispenseCalculator disI = new DispenseCalculator();
               
               double[] iqdresult = disI.doIQDDispense(gettedbill);
               
               double Sum = 0;
                //Counting total cashback
              for (double Scoin : iqdresult) {
                   
                   
                   
                   Sum += Scoin;
                   
                  
               }
                System.out.println("Dispensed Amount: " + Sum + "IQD");
               
               
               for (double coin : iqdresult) {
                   
                   System.out.println(coin);
               }
                
            }
            
            default -> System.out.println("NO currency has chosed!");
        } 
      
   
  }  
   
 //=====================-- Dispensation part finished --========================
  
  
  
  //============================================================================
  //============================================================================
  
  
  //====================-- coalesce part STARTS --==============================
   
  public void coalesceChoice(){
      
    // choosing the Currency.    
      
       Currency dispenObj = new Currency();
           
        gettedCurrency =   dispenObj.chooseCurrency();
      
        
    // based on the choosed currency, choose bill.
        
        switch (gettedCurrency) {
            case JOptionPane.YES_OPTION -> {
              
                //if dollar currency has chossed
               
                
               Bill doll = new Bill();
               
               gettedbill = doll.dollarBill();
               
               
               CoalesceCalculator coD = new  CoalesceCalculator();
               
              int[] coDresult = coD.doCoalesce$(gettedbill);
              
              double Sum = 0;
               //Counting total cashback
              for (double Scoin : coDresult) {
                   
                   
                   
                   Sum += Scoin;
                   
                  
               }
               System.out.println("Sum of Coalescion: " + "$" + Sum);
              
              
              
              
               for (int coin : coDresult) {
                   
                   System.out.println(coin);
               }
          
            }
            
            case JOptionPane.NO_OPTION -> {
                
                //if euro currency has chossed
               
              
               Bill eu = new Bill();
               
               gettedbill = eu.euroBill();
               
               CoalesceCalculator coE = new CoalesceCalculator();
               
            int[] coEresult =   coE.doCoalesce€(gettedbill);
             
            
            double Sum = 0;
             //Counting total cashback
              for (double Scoin : coEresult) {
           
                   Sum += Scoin;
     
               }
             System.out.println("Sum of Coalescion: " + Sum + "€");
           
            for (int coin : coEresult) {
                   
                   System.out.println(coin);
               }
              
                
                
            }
            
            case JOptionPane.CANCEL_OPTION -> {
                
                //if IQD currency has chosed
                
        
                Bill IQD = new Bill();
                
                gettedbill = IQD.IQDBill();
                
               
                CoalesceCalculator coI = new CoalesceCalculator();
                
              int[] coIresult =  coI.doIQDCoalesce(gettedbill);
              
              double Sum = 0;
               //Counting total cashback
              for (double Scoin : coIresult) {
                   
                   
                   
                   Sum += Scoin;
                   
                   
               }
              System.out.println("Sum of Coalescion: " + Sum + "IQD");
              
              
              
              
               for (int coin : coIresult) {
                   
                   System.out.println(coin);
               }
                
                
            }
            
            default -> System.out.println("NO currency has chosed!");
        } 
      
          
  }

//===================-- coalesce part finished --==============================
  
  
//==============================================================================
//==============================================================================


//====================-- convertion part START'S --=============================    
 
   public void convertChoice(){
       
     // choosing the currency.  
       
       Currency dispenObj = new Currency();
           
        gettedCurrency =   dispenObj.chooseCurrency();
      
        
    // Based on the currecny, choose the bill. 
        
        switch (gettedCurrency) {
            case JOptionPane.YES_OPTION -> {
              
                //if dollar currency has chossed
                
               Bill doll = new Bill();
               
               gettedbill = doll.dollarBill();
         
               
               Converter conv$ = new Converter();
          
           double[] conDresult =    conv$.convert$(gettedbill);
              
         
           
           
            for (double coin : conDresult) {
                   
                   System.out.println(coin);
               }
                
               
            }
            
            
            
            case JOptionPane.NO_OPTION -> {
                
                //if euro currency has chossed
               
               Bill eu = new Bill();
               
               gettedbill = eu.euroBill();
               
               
               Converter conv€ = new Converter();
               
           double[] conEresult =   conv€.convert€(gettedbill);
              
           
           
           
            for (double coin : conEresult) {
                   
                   System.out.println(coin);
               }
                
            }
            
            case JOptionPane.CANCEL_OPTION -> {
                
                //if IQD currency has chosed
                 
                Bill IQD = new Bill();
                
                gettedbill = IQD.IQDBill();
                
               
                Converter convIQD = new Converter();
                
            double[] conIresult =   convIQD.convertIQD(gettedbill);
                
            
            
          
            
            
             for (double coin : conIresult) {
                   
                   System.out.println(coin);
               }
                
            }
            
            default -> System.out.println("NO currency has chosed!");
        }        
           
   } 
    
 //==================-- convertion part finished --=============================   
    
    
    
       
} // End of the class.
