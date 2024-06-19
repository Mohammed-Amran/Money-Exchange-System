package uml;

import javax.swing.JOptionPane;



public class CoalesceCalculator {
   
//Methods
    
    
//=============================================================================
//=============================================================================    
      
    
/* COALESCION FOR DOLLAR CURRENCY */    

public int[] doCoalesce$(int amount){
        
      
    // x = $1 Bill.    
        
       if(amount == 1){

 String[] options$ = {"2× $1 Bills", "5× $1 Bills", "10× $1 Bills", "20× $1 Bills", "50× $1 Bills", "100× $1 Bills"};
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many $1 Bill are you inputting ?", //message 
                    "$1 Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
           
   
   switch(bill$Choice){
        
    case 0 -> {

    int[] coAarray = {2};

    return coAarray;
}
     
    case 1 -> {

    int[]  coAarray = {2,2,1};
    return coAarray;

}
                      
    case 2 -> {

    int[] coAarray = {5,5};
    return coAarray;
   
}

    case 3 -> {

    int[]  coAarray = {10, 10};
    return coAarray;
   
}

    case 4 -> {

    int[]  coAarray = {20, 20, 10};
    return coAarray;  
}

    case 5 -> {

    int[]  coAarray = {50, 50};
    return coAarray;  
}



} //closing tag of switch cas.


 } // if(amount==1) closing tag. 
       
 
  //-------------------------------------------------     
       
// if amount = $2 Bill.       
       
  if(amount == 2){

 String[] options$ = {"5× $2 Bills", "10× $2 Bills", "25× $2 Bills", "50× $2 Bills"};
          
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many $2 Bill are you inputting ?", //message 
                    "$2 Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
           
   
   switch(bill$Choice){
        
    case 0 -> {

    int[] coAarray = {5,5};

    return coAarray;
}
     
    case 1 -> {

    int[]  coAarray = {5,5,5,5};
    
    return coAarray;
}
                      
    case 2 -> {

    int[]  coAarray = {20,20,10};
    return coAarray;    
}

case 3 -> {

    int[]  coAarray = {50,50};
    return coAarray;   
}


} //closing tag of switch cas.


 } // if(amount==2) closing tag.       
       
  //-------------------------------------------
  
  
  if(amount == 5){

 String[] options$ = {"2× $5 Bills", "4× $5 Bills", "10× $5 Bills", "20× $5 Bills"};
          
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many $5 Bill are you inputting ?", //message 
                    "$5 Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
   switch(bill$Choice){
        
    case 0 -> {

    int[] coAarray = {10};

    return coAarray;
}
     
    case 1 -> {

    int[]  coAarray = {10,10};
    
    return coAarray;
}
                      
   case 2 -> {

   int[]  coAarray = {20,20,10};
   return coAarray;  
}

   case 3 -> {

   int[]  coAarray = {50,50};
   
   return coAarray; 
}


} //closing tag of switch cas.


 } // if(amount==5) closing tag.       
       

 //-----------------------------------------------


 if(amount == 10){

 String[] options$ = {"2× $10 Bills", "5× $10 Bills", "10× $10 Bills"};
          
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many $10 Bill are you inputting ?", //message 
                    "$10 Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
           
   
   switch(bill$Choice){
        
    case 0 -> {

    int[] coAarray = {20};

    return coAarray;
}
     
    case 1 -> {

    int[]  coAarray = {20,20,10};
    
    return coAarray;
}
                      
    case 2 -> {

    int[]  coAarray = {50,50};
    return coAarray;   
}


} //closing tag of switch case.


 } // if(amount==10) closing tag.  
       
       
//------------------------------------------------       
       
   if(amount == 20){

 String[] options$ = {"5× $20 Bills"};
          
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many $1 Bill are you inputting ?", //message 
                    "$1 Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
   switch(bill$Choice){
        
    case 0 -> {

  int[] coAarray = {50,50};

   return coAarray;
}
     
  
} //closing tag of switch cas.


 } // if(amount==20) closing tag.      
  
   
 //------------------------------
 
 
  if(amount == 50){

 String[] options$ = {"2× $50 Bills"};
          
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many $1 Bill are you inputting ?", //message 
                    "$1 Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
    
   switch(bill$Choice){
        
    case 0 -> {

  int[] coAarray = {100};

   return coAarray;
}
     
  
} //closing tag of switch cas.

  } //closing tag of if(amount == 50).
 //------------------------------
 
 
   return null;
             
} //doCoalesce$ closing tag

    
//=============================================================================
//=============================================================================     
    
    
/* COALESCION FOR EURO CURRENCY */   
    
public int[] doCoalesce€(int amount){
        
       
    // amount = 5€ Bill.    
        
    if(amount == 5){

 String[] options$ = {"2× 5€ Bills", "4× 5€ Bills", "10× 5€ Bills", "20× 5€ Bills", "40× 5€ Bills", "100× 5€ Bills"};
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many 5€ Bill are you inputting ?", //message 
                    "5€ Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
           
   
   switch(bill$Choice){
        
    case 0 -> {

    int[] coAarray = {10};

    return coAarray;
}
     
    case 1 -> {

    int[]  coAarray = {10,10};
    return coAarray;

}
                      
    case 2 -> {

    int[] coAarray = {20,20,10};
    return coAarray;
   
}

    case 3 -> {

    int[]  coAarray = {50, 50};
    return coAarray;
   
}

    case 4 -> {

    int[]  coAarray = {100,100};
    return coAarray;  
}

    case 5 -> {

    int[]  coAarray = {200,200,100};
    return coAarray;  
}



} //closing tag of switch cas.


 } // if(amount==5) closing tag. 
       
 
  //-------------------------------------------------     
       
// if amount = 10€ Bill.       
       
  if(amount == 10){

 String[] options$ = {"2× 10€ Bills", "5× 10€ Bills", "10× 10€ Bills", "20× 10€ Bills", "50× 10€ Bills"};
          
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many 10€ Bill are you inputting ?", //message 
                    "10€ Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
           
   
   switch(bill$Choice){
        
    case 0 -> {

    int[] coAarray = {20};

    return coAarray;
}
     
    case 1 -> {

    int[]  coAarray = {20,20,10};
    
    return coAarray;
}
                      
    case 2 -> {

    int[]  coAarray = {50,50};
    return coAarray;    
}

case 3 -> {

    int[]  coAarray = {100,100};
    return coAarray;   
}


case 4 -> {

    int[]  coAarray = {200,200,100};
    return coAarray;   
}

} //closing tag of switch cas.


 } // if(amount==10) closing tag.       
       
  //-------------------------------------------
  
  if(amount == 20){

 String[] options$ = {"5× 20€ Bills", "10× 20€ Bills", "50× 20€ Bills"};
          
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many 20€ Bill are you inputting ?", //message 
                    "20€ Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
   switch(bill$Choice){
        
    case 0 -> {

    int[] coAarray = {50,50};

    return coAarray;
}
     
    case 1 -> {

    int[]  coAarray = {100,100};
    
    return coAarray;
}
                      
   case 2 -> {

   int[]  coAarray = {200,200,100};
   return coAarray;  
}

   
} //closing tag of switch cas.


 } // if(amount==20) closing tag.       
       

 //-----------------------------------------------


 if(amount == 50){

 String[] options$ = {"2× 50€ Bills", "4× 50€ Bills", "10× 50€ Bills"};
          
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many 50€ Bill are you inputting ?", //message 
                    "50€ Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
   switch(bill$Choice){
        
    case 0 -> {

    int[] coAarray = {100};

    return coAarray;
}
     
    case 1 -> {

    int[]  coAarray = {100,100};
    
    return coAarray;
}
                      
    case 2 -> {

    int[]  coAarray = {200,200,100};
    return coAarray;   
}


} //closing tag of switch case.


 } // if(amount==50) closing tag.  
       
       
//------------------------------------------------       
       
   if(amount == 100){

 String[] options$ = {"2× 100€ Bills", "5× 100€ Bills"};
          
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many 100€ Bill are you inputting ?", //message 
                    "100€ Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
           
   
   switch(bill$Choice){
        
    case 0 -> {

  int[] coAarray = {200};

   return coAarray;
}

            
    case 1 -> {

  int[] coAarray = {500};

   return coAarray;
}
  
} //closing tag of switch cas.
   
 //------------------------------
 
} //closing tag of if( amount == 100 ).
   
   return null;
           
    }  //doCoalesce€ closing tag.
   
       
   
//=============================================================================
//=============================================================================  

       
/* COALESCION FOR IQD CURRENCY */    

public int[] doIQDCoalesce(int amount){
     
        
          // amount = 250 Bill.    
        
       if(amount == 250){

 String[] options$ = {"2× 250 Bills", "4× 250 Bills", "20× 250 Bills", "40× 250 Bills", "100× 250 Bills", "200× 250 Bills"};
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many $1 Bill are you inputting ?", //message 
                    "$1 Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
           
   
   switch(bill$Choice){
        
    case 0 -> {

    int[] coAarray = {500};

    return coAarray;
}
     
    case 1 -> {

    int[]  coAarray = {1000};
    return coAarray;

}
                      
    case 2 -> {

    int[] coAarray = {5000};
    return coAarray;
   
}

    case 3 -> {

    int[]  coAarray = {5000,5000};
    return coAarray;
   
}

    case 4 -> {

    int[]  coAarray = {10000,10000,5000};
    return coAarray;  
}

    case 5 -> {

    int[]  coAarray = {25000,25000};
    return coAarray;  
}



} //closing tag of switch cas.


 } // if(amount==250) closing tag. 
       
 
  //-------------------------------------------------     
       
// if amount = 500 Bill.       
       
  if(amount == 500){

 String[] options$ = {"2× 500 Bills", "10× 500 Bills", "20× 500 Bills", "50× 500 Bills", "100× 500 Bills"};
          
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many $2 Bill are you inputting ?", //message 
                    "$2 Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
           
   
   switch(bill$Choice){
        
    case 0 -> {

    int[] coAarray = {1000};

    return coAarray;
}
     
    case 1 -> {

    int[]  coAarray = {5000};
    
    return coAarray;
}
                      
    case 2 -> {

    int[]  coAarray = {5000,5000};
    return coAarray;    
}

case 3 -> {

    int[]  coAarray = {10000,10000,5000};
    return coAarray;   
}

case 4 -> {

    int[]  coAarray = {25000,25000};
    return coAarray;   
}


} //closing tag of switch cas.


 } // if(amount==500) closing tag.       
       
  //-------------------------------------------
  
  if(amount == 1000){

 String[] options$ = {"5× 1000 Bills", "10× 1000 Bills", "25× 1000 Bills", "50× 1000 Bills"};
          
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many $5 Bill are you inputting ?", //message 
                    "$5 Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
           
   
   switch(bill$Choice){
        
    case 0 -> {

    int[] coAarray = {5000};

    return coAarray;
}
     
    case 1 -> {

    int[]  coAarray = {5000,5000};
    
    return coAarray;
}
                      
   case 2 -> {

   int[]  coAarray = {10000,10000,5000};
   return coAarray;  
}

   case 3 -> {

   int[]  coAarray = {25000,25000};
   
   return coAarray; 
}


} //closing tag of switch cas.


 } // if(amount==1000) closing tag.       
       

 //-----------------------------------------------


 if(amount == 5000){

 String[] options$ = {"2× 5000 Bills", "5× 5000 Bills", "10× 5000 Bills"};
          
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many $10 Bill are you inputting ?", //message 
                    "$10 Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
           
   
   switch(bill$Choice){
        
    case 0 -> {

    int[] coAarray = {10000};

    return coAarray;
}
     
    case 1 -> {

    int[]  coAarray = {10000,10000,5000};
    
    return coAarray;
}
                      
    case 2 -> {

    int[]  coAarray = {25000,25000};
    return coAarray;   
}


} //closing tag of switch case.


 } // if(amount==5000) closing tag.  
       
       
//------------------------------------------------       
       
   if(amount == 10000){

 String[] options$ = {"5× 10000 Bills", };
          
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many $1 Bill are you inputting ?", //message 
                    "$1 Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
           
   
   switch(bill$Choice){
        
    case 0 -> {

  int[] coAarray = {25000,25000};

   return coAarray;
}
     
  
} //closing tag of switch cas.


 } // if(amount==10000) closing tag.      
       
 //------------------------------
 
 
  if(amount == 25000){

 String[] options$ = {"2× 25000 Bills"};
          
          
          
         int bill$Choice  = JOptionPane.showOptionDialog(null, //parent component
                    "How many $1 Bill are you inputting ?", //message 
                    "$1 Bill Input",  // Title
                     JOptionPane.DEFAULT_OPTION, //option type
                     JOptionPane.QUESTION_MESSAGE, // MESSAGE TYPE
                    null, //icon(null for no icon)
                    options$, //array of texts for the buttons
                    options$[0]);     //default button text
       
         
           
   
   switch(bill$Choice){
        
    case 0 -> {

  int[] coAarray = {50000};

   return coAarray;
}
     
  
   } //closing tag of switch cas.

  } // closing tag of if(amount == 25000).
  
  
 //------------------------------
 
        return null;
    } // clossing tag of doIQDCoalesce.
  

} //clossing tag of the class