

import java.util.Scanner;

 class Lab06 {
  public static void main(String[] args) {
    int n, k, rem;
    boolean has3, has7, divisibleBy3, divisibleBy7;

    System.out.println("Welcome to GoTigers.");
    System.out.print("Enter a number between 1 and 1337: ");
    n = STDIN_SCANNER.nextInt();

    for(int i = 1; i <= n; i++) {
      has3 = false;
      has7 = false;
      divisibleBy3 = false;
      divisibleBy7 = false;
      k = i;

      if(k % 3 == 0) {
        has3 = true;
      }
      if(k % 7 == 0) {
        has7 = true;
      }
      while(k > 0) {
        rem = k % 10;
        if(rem == 3) {
          divisibleBy3 = true;
        }
        if(rem == 7) {
          divisibleBy7 = true;
        }
        k = k / 10;
      }

      if(has3 || divisibleBy3) {
        System.out.print("Go");
      }
      if(has7 || divisibleBy7) {
        System.out.print("Tigers");
      }
      if(!(has3 || has7 || divisibleBy3 || divisibleBy7)) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
  
