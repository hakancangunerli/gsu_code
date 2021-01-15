class QuartsToGallons {
      public static void main(String[] args) {
          int quartsNeeded= 18; // example 
          int QUARTS_IN_GALLON=4; // 4 qt= 1gal 
          int gallonsNeeded; 
          int extraQuartsNeeded;
          gallonsNeeded= quartsNeeded / QUARTS_IN_GALLON; //this will give a rough estimate, next line will get the modulus
      extraQuartsNeeded= quartsNeeded % QUARTS_IN_GALLON; //modulus 
          System.out.println("A job that needs "+ quartsNeeded + " quarts requires "+ gallonsNeeded + " gallons plus " + extraQuartsNeeded + " quarts");
  
      
      }
  }
  //written in vscode in case it looks like copy and paste.
  
  