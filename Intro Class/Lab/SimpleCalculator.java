import java.util.Scanner;
class SimpleCalculator {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
      
    int Num1;
    int Num2;
    char Operations;

System.out.print("Enter integer +|-|*|/ integer: ");

      Num1 = scnr.nextInt();
      Operations = scnr.next().charAt(0);
      Num2 = scnr.nextInt();

    if (Operations == '/' && Num2 == 0) {
      System.out.printf("%d / %d = ERROR!\nCannot divide by zero.", Num1, Num2);
    }

    else {
      switch (Operations) {
        case '+':
        System.out.printf("%d + %d = %d",Num1 , Num2, Num1 + Num2);
        break;

      case '-':
        System.out.printf("%d - %d = %d",Num1 , Num2, Num1 - Num2);
        break;

      case '*':
        System.out.printf("%d * %d = %d",Num1 , Num2, Num1 * Num2);
        break;

      case '/':
        System.out.printf("%d / %d = %d",Num1 , Num2, Num1 / Num2);
        break;
      }
    }
  }
}