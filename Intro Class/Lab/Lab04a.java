import java.util.Scanner;

class Lab04a {
  public static void main(String[] args) {
    
    int Num1;
    int Num2;
    int Num3;
    int Num4;
    int Num5;
    int Num6;
    int Num7;
    int Num8;
    int Num9;
    int SumRow0;
    int SumRow1;
    int SumRow2;
    int SumColumn0;
    int SumColumn1;
    int SumColumn2;
    int SumDiagonal0;
    int SumDiagonal1;

  Scanner scnr = new Scanner(System.in);
  

    System.out.println("Enter 9 values: ");
  Num1 = scnr.nextInt();
  Num2 = scnr.nextInt();
  Num3 = scnr.nextInt();
  Num4 = scnr.nextInt();
  Num5 = scnr.nextInt();
  Num6 = scnr.nextInt();
  Num7 = scnr.nextInt();
  Num8 = scnr.nextInt();
  Num9 = scnr.nextInt();
    System.out.println("You entered:");
    System.out.println(Num1 + " " + Num2 + " " + Num3);
    System.out.println(Num4 + " " + Num5 + " " + Num6);
    System.out.println(Num7 + " " + Num8 + " " + Num9);

    SumRow0 = Num1 + Num2 + Num3;
    SumRow1 = Num4 + Num5 + Num6;
    SumRow2 = Num7 + Num8 + Num9;
    SumColumn0 = Num1 + Num4 + Num7;
    SumColumn1 = Num2 + Num5 + Num8;
    SumColumn2 = Num3 + Num6 + Num9;
    SumDiagonal0 = Num1 + Num5 + Num9;
    SumDiagonal1 = Num3 + Num5 + Num7;
  System.out.println("");
  System.out.println("Analyzing...");

  if (SumRow0 != 15) {
    System.out.print("Row 0 [");
    System.out.print(Num1);
    System.out.print(", ");
    System.out.print(Num2);
    System.out.print(", ");
    System.out.print(Num3);
    System.out.println("] does not work!");
  }
if (SumRow1 != 15) {
    System.out.print("Row 1 [");
    System.out.print(Num4);
    System.out.print(", ");
    System.out.print(Num5);
    System.out.print(", ");
    System.out.print(Num6);
    System.out.println("] does not work!");
  }
if (SumRow2 != 15) {
    System.out.print("Row 2 [");
    System.out.print(Num7);
    System.out.print(", ");
    System.out.print(Num8);
    System.out.print(", ");
    System.out.print(Num9);
    System.out.println("] does not work!");
  }
if (SumColumn0 != 15) {
    System.out.print("Column 0 [");
    System.out.print(Num1);
    System.out.print(", ");
    System.out.print(Num4);
    System.out.print(", ");
    System.out.print(Num7);
    System.out.println("] does not work!");
  }
  if (SumColumn1 != 15) {
    System.out.print("Column 1 [");
    System.out.print(Num2);
    System.out.print(", ");
    System.out.print(Num5);
    System.out.print(", ");
    System.out.print(Num8);
    System.out.println("] does not work!");
  }
  if (SumColumn2 != 15) {
    System.out.print("Column 2 [");
    System.out.print(Num3);
    System.out.print(", ");
    System.out.print(Num6);
    System.out.print(", ");
    System.out.print(Num9);
    System.out.println("] does not work!");
  }
  if (SumDiagonal0 != 15) {
    System.out.print("Diagonal 0 does not work!");
  }
if (SumDiagonal1 != 15) {
    System.out.print("Diagonal 1 does not work!");
  }
    System.out.println("");
if ((SumRow0 == 15) && (SumRow1 == 15) && (SumRow2 == 15) && (SumColumn0 == 15) && (SumColumn1 == 15) && (SumColumn2 ==15) && (SumDiagonal0 == 15) && (SumDiagonal1 == 15)) 
{
    System.out.print("You have a magic square!");
}

else {
  System.out.print("This is not a magic square!");
}
  }
}