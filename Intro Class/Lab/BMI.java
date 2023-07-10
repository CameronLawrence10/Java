import java.text.DecimalFormat;
import java.util.*;

public class BMI { 

 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  DecimalFormat df=new DecimalFormat("#.##");
  double bodyfat=0,bodyfatPercent=0,b=0,a1,a2,a3,a4,a5;
  
  System.out.println("This program determines the body fat of a person based on biological gender.");
  System.out.println("Enter a gender (f|F|m|M): ");
  String gender=sc.nextLine();
  
  if(gender.equalsIgnoreCase("M"))
  {
   double bodywt,waist;
   System.out.print("Enter body weight (in pounds): \n");
   bodywt=sc.nextDouble();
   System.out.print("Enter waist measurement at fullest point (in inches): ");
   
      waist=sc.nextDouble();
      a1=(bodywt*1.082)+94.42;
      a2=waist*4.15;
      b=a1-a2;
      bodyfat=bodywt-b;
      bodyfatPercent=(bodyfat*100)/bodywt;
  }
  if(gender.equalsIgnoreCase("F"))
  {
   double bodywt,waist,wrist,hip,forearm;
   
   System.out.print("Enter body weight (in pounds): \n");
   bodywt=sc.nextDouble();
   System.out.print("Enter wrist measurement at fullest point (in inches): \n");
   wrist=sc.nextDouble();
   System.out.print("Enter waist measurement at navel (in inches): \n");
   waist=sc.nextDouble();
   System.out.print("Enter hip measurement at fullest point (in inches): \n");
   hip=sc.nextDouble();
   System.out.print("Enter forearm measurement at fullest point (in inches): ");
   forearm=sc.nextDouble();
   
        a1=(bodywt*0.732)+8.987;
        a2=wrist/3.140;
        a3=waist*0.157;
        a4=hip*0.249;
        a5=forearm*0.434;
        b=a1+a2-a3-a4+a5;
        bodyfat=bodywt-b;
        bodyfatPercent=(bodyfat*100)/bodywt;
  
  }
  System.out.println("\nBody fat:  "+df.format(bodyfat));
  System.out.println("Body fat percentage:  "+df.format(bodyfatPercent));
 }
}