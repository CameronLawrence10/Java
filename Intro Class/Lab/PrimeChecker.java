import java.util.Scanner;

class PrimeChecker {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    int Prime;
    String factors = "";
    boolean isEven = true;
    

    System.out.print("Enter an integer between 1 and 1000 (inclusive): ");
    Prime = scnr.nextInt();
  
   if (Prime >= 1000 || Prime <= 1) {
     System.out.print("You must enter a number between 1 and 1000 (inclusive).");
     return;
   }
    
    if (Prime == 2|| Prime == 3||Prime == 5||Prime == 7||Prime == 11||Prime == 13||Prime == 17||Prime == 19||Prime == 23||Prime == 29||Prime == 31) {
      System.out.print(Prime + " is prime.");
      return;
  }
    if (Prime % 2 == 0) {
      isEven = false;
      factors = factors + "2, .";
    }
    if (Prime % 3 == 0) {
      isEven = false;
      factors = factors + "3, .";
    }
    if (Prime % 5 == 0) {
      isEven = false;
      factors = factors + "5, .";
    }
    if (Prime % 7 == 0) {
      isEven = false;
      factors = factors + "7, .";
    }
    if (Prime % 11 == 0) {
      isEven = false;
      factors = factors + "11, .";
    }
    if (Prime % 13 == 0) {
      isEven = false;
    factors = factors + "13, .";
    }
    if (Prime % 17 == 0) {
      isEven = false;
      factors = factors + "17, .";
    }
    if (Prime % 19 == 0) {
      isEven = false;
    factors = factors + "19, .";
    }
    if (Prime % 23 == 0) {
      isEven = false;
      factors = factors + "23, .";
    }
    if (Prime % 29 == 0) {
      isEven = false;
      factors = factors + "29, .";
    }
    if (Prime % 31 == 0) {
      isEven = false;
    factors = factors + "31, .";
    }
    if (isEven == false) {
      System.out.println(Prime + " is divisible by "+ factors);
      System.out.print(Prime +" is not prime.");

    }
    else {
      System.out.print(Prime + " is prime.");
    }

  }
}