import java.util.Scanner;


 class PhoneWords
{

    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
     
            System.out.print("Enter a telephone number using letters (EXIT to quit): ");
            String str = input.nextLine();
            int len = str.length();
            if (len > 8)
            {
                str = str.substring(0,8);
                len = 8;
            }
            System.out.println("The corresponding telephone number is: ");
            String small = "";
            
              int dash = 0;
              
              for (int j = 0; j < len; j++)
              {
                if(str.equals("EXIT"))
                     break;
                small = str.substring(j, j+1);
                if(small.equals("_") || small.equals(".") || small.equals("@"))
                {
                      System.out.print("1");
                      dash++;
                }
                if(small.toUpperCase().equals("A") || small.toUpperCase().equals("B") 
                          || small.toUpperCase().equals("C"))
                {
                      System.out.print("2");
                      dash++;
                }
                if(small.toUpperCase().equals("D") || small.toUpperCase().equals("E") 
                          || small.toUpperCase().equals("F"))
                {
                      System.out.print("3");
                      dash++;
                }
                if(small.toUpperCase().equals("G") || small.toUpperCase().equals("H") 
                          || small.toUpperCase().equals("I"))
                {
                      System.out.print("4");
                      dash++;
                }
                if(small.toUpperCase().equals("J") || small.toUpperCase().equals("K")
                          || small.toUpperCase().equals("L"))
                {
                      System.out.print("5");                        
                      dash++;
                }
                if(small.toUpperCase().equals("M") || small.toUpperCase().equals("N")
                          || small.toUpperCase().equals("O"))
                {
                      System.out.print("6");
                      dash++;
                }
                if(small.toUpperCase().equals("P") || small.toUpperCase().equals("Q")
                          || small.toUpperCase().equals("R")
                          || small.toUpperCase().equals("S"))
                {
                      System.out.print("7");
                      dash++;
                }
                if(small.toUpperCase().equals("T") || small.toUpperCase().equals("U") 
                          || small.toUpperCase().equals("V"))
                {
                      System.out.print("8");
                      dash++;
                }
                if(small.toUpperCase().equals("W") || small.toUpperCase().equals("X") 
                          || small.toUpperCase().equals("Y")
                         ||  small.toUpperCase().equals("Z"))
                {
                      System.out.print("9");
                      dash++;
                }
                if(small.equals("0"))
                {
                      System.out.print("0");
                      dash++;
                }
                if(small.equals(" "))
                  {
                  }
                if (dash == 3)
                {
                    System.out.print("-");
                    dash++;
                
                }
              }
                                          
            
            System.out.println();
            

                
              
            
             

              } 

    
}
