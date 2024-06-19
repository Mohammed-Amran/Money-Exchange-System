
package uml;

import javax.swing.JOptionPane;



public class Converter {
   
  
//Methods    
       

/* CONVERTION FOR DOLLAR CURRENCY*/
    
public double[] convert$(int amount){
        
     
  String[] options$ = {"Euro Currency", "Dinar Currency"};
          
          
         int tobeConver$10Currency  = JOptionPane.showOptionDialog(null, //parent component
                    "Which Bill are you converting to?", //message 
                    "Choose Currency",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
  
  
   switch(tobeConver$10Currency){
   
 // if Euro currency has choosen.           
       case 0:
          
           switch(amount){
           
               case 1 -> {
                   double[] coins = {0.50,0.20,0.20};
                   
              double Sum = 0;
            //Counting total cashback
              for (double Scoin : coins) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + "$" + Sum);
           
             
                   return coins;
          } 
               case 2 -> {
                   double[] coins$2 = {1, 0.50, 0.2, 0.1};
                   
                     double Sum = 0;
            //Counting total cashback
              for (double Scoin : coins$2) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: "  + Sum + "€");
                   
                   return coins$2;
          }
           
            case 5 -> {
                double[] coins$5 = {1,1,1,1, 0.5, 0.1};
                
                  double Sum = 0;
            //Counting total cashback
              for (double Scoin : coins$5) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum + "€");
                
                
                return coins$5;
          }
                   
                    case 10 -> {
                        double[] bill$10 = {5, 1, 1, 1, 1, 0.2};
                        
                            double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill$10) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum + "€");
                        
                        return bill$10;
          }
           
            case 20 -> {
                double[] bill$20 = {10, 5, 1, 1, 1, 0.5};
                
                    double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill$20) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum + "€");
                
                return bill$20;
          }
           
            case 50 -> {
                double[] bill$50 = {20, 20, 5, 1, 0.20, 0.10};
                
                 double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill$50) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum + "€");
                
                return bill$50;
          }
           
            case 100 -> {
                double[] bill$100 = {50, 20, 20, 1, 1, 0.5, 0.1};
                
                 double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill$100) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum + "€");
                
                return bill$100;
          }
           
           }

   
           
  //if IQD currency has choosen.         
           
       case 1:
              
            switch(amount){
           
               case 1 -> {
                   double[] bill$1 = {1000, 250};
                   
                    double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill$1) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum + "IQD");
                   
                   return bill$1;
          } 
               case 2 -> {
                   double[] bill$2 = {1000, 1000, 500};
                   
                         double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill$2) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum + "IQD");
                   
                   return bill$2;
          }
           
            case 5 -> {
                double[] coins$5 = {5000, 1000, 500};
                
                      double Sum = 0;
            //Counting total cashback
              for (double Scoin : coins$5) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum + "IQD");
                
                return coins$5;
          }
                   
                    case 10 -> {
                        double[] bill$10 = {10000, 1000, 1000, 1000};
                        
                              double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill$10) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum + "IQD");
                        
                        return bill$10;
          }
           
            case 20 -> {
                double[] bill$20 = {25000, 1000};
                
                      double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill$20) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum + "IQD");
                
                return bill$20;
          }
           
            case 50 -> {
                double[] bill$50 = {25000, 25000, 10000, 5000, 250};
                
                      double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill$50) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum + "IQD");
                
                return bill$50;
          }
           
            case 100 -> {
                double[] bill$100 = {50000, 50000, 25000, 5000};
                
                      double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill$100) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum + "IQD");
                
                return bill$100;
          }
           
           }

   
   
   }
        return null;
        
    } //closing tag of the method convert$ method.
    
    
//==============================================================================
//==============================================================================
    

/* CONVERTION FOR EURO CURRENCY*/

public double[] convert€(int amount){
       
       
      String[] options$ = {"Dollar Currency", "Dinar Currency"};
          
          
         int tobeConver$10Currency  = JOptionPane.showOptionDialog(null, //parent component
                    "Which Bill are you converting to?", //message 
                    "Choose Currency",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
  
  
   switch(tobeConver$10Currency){
   
 // if Dollar currency has choosen.           
       case 0:
          
           switch(amount){
           
               case 5 -> {
                   double[] bill€5 = {5,0.25, 0.10, 0.01, 0.01, 0.01, 0.01};
                   
                   
                         double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill€5) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + "$" + Sum );
                   
                   return bill€5;
          } 
               case 10 -> {
                   double[] bill€10 = {10, 0.50, 0.25, 0.01, 0.01, 0.01};
                   
                    double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill€10) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + "$" + Sum );
                   
                   return bill€10;
          }
           
            case 20 -> {
                double[] bill€20 = {20,1, 0.25, 0.25, 0.01, 0.01, 0.01, 0.01, 0.01, 0.01, };
                
                 double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill€20) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + "$" + Sum );
                
                return bill€20;
          }
                   
          case 50 -> {
             double[] bill€50 = {50, 2, 1, 0.25, 0.25, 0.25, 0.1, 0.05};
             
              double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill€50) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + "$" + Sum );
             
             return bill€50;
          }
           
            case 100 -> {
                double[] bill€100 = {100, 5, 2, 0.25, 0.25, 0.25, 0.05};
                
                 double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill€100) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + "$" + Sum );
                
                return bill€100;
          }
           
            case 200 -> {
                double[] bill€200 = {100, 100, 10, 5, 0.5, 0.1};
                
                 double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill€200) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + "$" + Sum );
                
                
                return bill€200;
          }
           
            case 500 -> {
                double[] bill€500 = {100, 100, 100, 100, 100, 20, 10, 5, 2, 2};
                
                 double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill€500) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + "$" + Sum );
                
                return bill€500;
          }
           
           }

   
           
  //if IQD currency has choosen.         
           
       case 1:
              
            switch(amount){
           
               case 5 -> {
                   double[] bill15IQD = {5000, 1000, 1000};
                   
                    double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill15IQD) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum  + "IQD" );
                   
                   return bill15IQD;
          } 
               case 10 -> {
                   double[] bill10IQD = {10000, 1000, 1000, 1000, 1000};
                   
                   double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill10IQD) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum  + "IQD" );
                   
                   return bill10IQD;
          }
           
            case 20 -> {
                double[] coins20IQD = {25000, 1000, 1000, 1000};
                
                double Sum = 0;
            //Counting total cashback
              for (double Scoin : coins20IQD) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum  + "IQD" );
                
                return coins20IQD;
          }
                   
           case 50 -> {
             double[] bill50IQD = {50000, 10000, 10000, 500};
             
             double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill50IQD) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum  + "IQD" );
             
             return bill50IQD;
          }
           
            case 100 -> {
                double[] bill100IQD = {50000, 50000, 25000, 10000, 5000, 1000};
                
                double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill100IQD) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum  + "IQD" );
                
                return bill100IQD;
          }
           
            case 200 -> {
                double[] bill200IQD = {50000, 50000, 50000, 50000, 50000, 25000, 5000, 250};
                
                double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill200IQD) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum  + "IQD" );
                
                
                return bill200IQD;
          }
           
            case 500 -> {
                double[] bill500IQD = {50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 5000, 500, 250};
                
                double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill500IQD) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + Sum  + "IQD" );
                
                return bill500IQD;
          }
           
            
           }

   
   
   }  
       
       
    return null;   
       
   } //closing tag of convert€ method.
           
    
//==============================================================================
//==============================================================================
   

/* CONVERTION FOR IQD CURRENCY*/

public double[] convertIQD(int amount){
        
        
      String[] options$ = {"Dollar Currency", "Euro Currency"};
          
          
         int tobeConver$10Currency  = JOptionPane.showOptionDialog(null, //parent component
                    "Which Bill are you converting to?", //message 
                    "Choose Currency",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
  
  
   switch(tobeConver$10Currency){
   
 // if Dollar currency has choosen.           
       case 0:
          
           switch(amount){
           
               case 500 -> {
                   double[] bill05 = {0.25, 0.05};
                   
                   double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill05) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + "$" + Sum   );
                   
                   return bill05;
          } 
               case 1000 -> {
                   double[] bill1 = {0.25, 0.25, 0.25, 0.01};
                   
                   double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill1) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + "$" + Sum   );
                   
                   return bill1;
          }
           
            case 5000 -> {
                double[] bill5 = {2, 1, 0.25, 0.25, 0.25, 0.05, 0.01, 0.01 };
                
                double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill5) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + "$" + Sum   );
                
                return bill5;
          }
                   
          case 10000 -> {
             double[] bill10 = {5, 2, 0.25, 0.25, 0.1};
             
             double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill10) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + "$" + Sum   );
             
             return bill10;
          }
           
            case 25000 -> {
                double[] bill25 = {10, 5, 2, 2, 0.05, 0.01, 0.01, 0.01, 0.01};
                
                double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill25) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + "$" + Sum   );
                
                
                return bill25;
          }
           
            case 50000 -> {
                double[] bill50 = {20, 10, 5, 2, 1, 0.1, 0.05, 0.01, 0.01, 0.01, 0.01};
                
                double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill50) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: " + "$" + Sum   );
                
                return bill50;
          }
           
           
           
           } //closing tag of the switch for case 0:

   
           
  //if Euro currency has choosen.         
           
       case 1:
              
            switch(amount){
           
               case 500 -> {
                   double[] bill05IQD = {0.2, 0.1, 0.05};
                   
                   double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill05IQD) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: "  + Sum + "€"  );
                   
                   return bill05IQD;
          } 
               case 1000 -> {
                   double[] bill1IQD = {0.5,0.2,0.01};
                   
                    double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill1IQD) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: "  + Sum + "€"  );
                   
                   
                   
                   return bill1IQD;
          }
           
            case 5000 -> {
                double[] bills5IQD = {0.5,0.5,0.5,0.5,0.5,0.5, 0.5,0.05};
                
                 double Sum = 0;
            //Counting total cashback
              for (double Scoin : bills5IQD) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: "  + Sum + "€"  );
                
                return bills5IQD;
          }
                   
           case 10000 -> {
             double[] bill10IQD = {5, 0.5, 0.5, 0.5, 0.5, 0.1};
             
              double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill10IQD) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: "  + Sum + "€"  );
             
             return bill10IQD;
          }
           
            case 25000 -> {
                double[] bill25IQD = {10, 5, 0.5, 0.5, 0.5, 0.5, 0.02, 0.02};
                
                 double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill25IQD) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: "  + Sum + "€"  );
                
                return bill25IQD;
          }
           
            case 50000 -> {
                double[] bill50IQD = {20, 10, 5, 0.2, 0.2, 0.05, 0.01, 0.01, 0.01};
                
                 double Sum = 0;
            //Counting total cashback
              for (double Scoin : bill50IQD) {
               Sum += Scoin;    
               }
           System.out.println("Total Conversion would be: "  + Sum + "€"  );
                
                return bill50IQD;
          }
           
           
            
           } //closing tag for cas 1:.

   
   
   }  
       
       
    return null;      
        
       
    } //closing tag of convertIQD method.
    
    
//==============================================================================
//==============================================================================
        

} // closing tag of the class.