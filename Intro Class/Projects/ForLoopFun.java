import java.util.Scanner;

class ForLoopFun{
  public static void main(String[] args) {
    System.out.println();
  var input = new Scanner(System.in);
    System.out.println("You will be entering two numbers.");
    System.out.println("The first number must be less than the second number.");
    System.out.print("Enter 2 integers: ");
  var firstNum = input.nextInt();
  var secondNum = input.nextInt();
    
  if (firstNum>=secondNum){
    System.out.println("The first number must be LESS THAN the second number.");
  }
  else {
  System.out.println("");
  int odd_square_sum = 0,i=firstNum;
  while(i<secondNum){
    if(i%2!=0){
      odd_square_sum+=(i*i);
    }
    i++;
  }

    System.out.println("Sum of the squares of odd integers between "+firstNum+" and "+secondNum+" = "+odd_square_sum);
    System.out.println("Odd integers between "+firstNum+" and "+secondNum+" are:");
    i=firstNum;
    while(i<=secondNum){
      if(i%2 != 0){
        System.out.print(i+" ");
      }
      i++;
    }
    i=firstNum;
   int sum_of_even = 0;
    while(i<=secondNum){
      if(i%2==0){
        sum_of_even+=i;
      }
      i++;
    }
    System.out.println("\nSum of even integers between "+firstNum+" and "+secondNum+" = "+sum_of_even);
    int squares=0;
    i=secondNum;
    System.out.println("Number    Square of Number");
    while(i>=firstNum){
      System.out.println(i+" "+(i*i));
      i--;
    }
    System.out.print("Upper case letters are: ");
    char ch='A';
    while(ch<='Z'){
      System.out.print(ch+" ");
      ch++;
    }
    System.out.println("");
 
  }
  }
}