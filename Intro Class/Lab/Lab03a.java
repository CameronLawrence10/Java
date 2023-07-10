/*
   @file <Lab03>
   @author <Cameron Lawrence>
   @date <09/08/21>
*/

import java.util.Scanner;

 class Lab03a {  
  public static void main(String args[]) { 
    Scanner scnr = new Scanner(System.in);
	  
System.out.print("How many hours per week: ");

	  
int HoursPerWeek = 30;
final double HOURLY_RATE = 7.25;
double GrossPay;
double NetPay;
double FederalTax;
double StateTax;
double FICA;
double Medicare;

	HoursPerWeek = scnr.nextInt();
	
System.out.print("Income\n");
System.out.println("Hours per Week: " + HoursPerWeek);


	  
	GrossPay = HoursPerWeek*HOURLY_RATE;
	
	  FederalTax = 0.10*GrossPay;
      StateTax = 0.03*GrossPay;
      FICA = 0.062*GrossPay;
	  Medicare = 0.0145*GrossPay;
	
	  NetPay = (GrossPay - Medicare) - (FederalTax + StateTax + FICA);
	System.out.printf("%-15s $%.2f\n", "Hourly Rate: ", HOURLY_RATE);
	System.out.printf("%-15s $%.2f\n","Gross Pay: ", GrossPay);
	System.out.printf("%-15s $%.2f\n\n","Net Pay: ", NetPay);

	System.out.println("Deductions");
	System.out.printf("%-15s $%.2f\n","Federal: ", FederalTax);
	System.out.printf("%-15s $%.2f\n","State: ", StateTax);
	System.out.printf("%-15s $%.2f\n","FICA: ", FICA);
	System.out.printf("%-15s $%.2f\n","Medicare: ", Medicare);
	
	

	  }
 }