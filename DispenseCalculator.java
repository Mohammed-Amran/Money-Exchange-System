
package uml;



public class DispenseCalculator {
  
    
//Methods
    
 
//=============================================================================
//=============================================================================
    
    
/* DISPENSATION FOR DOLLAR CURRENCY */
    
public double[] do$Dispense(int amount ){
       
         
         switch (amount) {
             case 1 -> {
                 double[] coins = {0.25, 0.25, 0.25, 0.25};
                 return coins;
             }
             case 2 -> {
                 double[] bill2 = {1,1};
                 return bill2;
             }
             case 5 -> {
                 double[] bill5 = {2, 2, 1};
                 return bill5;
             }
             case 10 -> {
                 double[] bill10 = {5,5};
                 
                 return bill10;
             }
             case 20 -> {
                 double[] bill20 = {10, 10};
                 return bill20;
             }
             case 50 -> {
                 double[] bill50 = {20, 20, 10};
                 return bill50;
             }
             case 100 -> {
                 double[] bill100 = {50, 50};
                 return bill100;
             }
             default -> {
                 double[] non = {-1};
                 return  non;
             }
         }
         
         
         
         
     }
    
    
//=============================================================================
//=============================================================================
     
    
/* DISPENSATION FOR EURO CURRENCY */

public double[] do€Dispense(int amount ){
       
         switch (amount) {
             case 5 -> {
                 double[] bill5 = {2, 2, 1};
                 return bill5;
             }
             case 10 -> {
                 double[] bill10 = {5,5};
                 return bill10;
             }
             case 20 -> {
                 double[] bill20 = {10, 10};
                 return bill20;
             }
             case 50 -> {
                 double[] bill50 = {20,20, 10};
                 
                 return bill50;
             }
             case 100 -> {
                 double[] bill100 = {50, 50};
                 return bill100;
             }
             case 200 -> {
                 double[] bill200 = {100, 100};
                 return bill200;
             }
             case 500 -> {
                 double[] bill500 = {200, 200, 100};
                 return bill500;
             }
             default -> {
                 double[] non = {-1};
                 return  non;
             }
         }
          
     }
    
    
     
//=============================================================================
//=============================================================================     
     

/* DISPENSATION FOR IQD CURRENCY */ 

public double[] doIQDDispense(int amount ){
       
         switch (amount) {
             case 500 -> {
                 double[] bill500 = {250, 250};
                 return bill500;
             }
             case 1000 -> {
                 double[] bill1K = {500,500};
                 return bill1K;
             }
             case 5000 -> {
                 double[] bill5K = {1000, 1000, 1000, 1000,1000};
                 return bill5K;
             }
             case 10000 -> {
                 double[] bill10K = {5000,5000};
                 
                 return bill10K;
             }
             case 25000 -> {
                 double[] bill25K = {10000, 10000, 5000};
                 return bill25K;
             }
             case 50000 -> {
                 double[] bill50K = {25000, 25000};
                 return bill50K;
             }
             
             default -> {
                 double[] non = {-1};
                 return  non;
             }
         }
         
         
         
         
     }
    
         

//=============================================================================
//=============================================================================

} // closing tag of the class