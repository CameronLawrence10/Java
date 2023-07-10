
 import java.util.Scanner;

 import java.util.Random;

 class Lab05a
{

    
    public static void main(String[] args)
    {
       

 int compScore = 0;
 int userScore = 0;
 int tieScore = 0;
 int numMatch = 0;
 int randSeed = 0;
    Random randGen = new Random();
    Scanner scnr = new Scanner(System.in);

    System.out.println("Starting the CPSC 1061 Rock, Paper, Scissors Game!\n");
    System.out.print("Enter a random seed between 0 - 100: ");
    randSeed = scnr.nextInt();
    System.out.println("");
    System.out.print("Enter the number of matches to play: ");
    numMatch = scnr.nextInt();
    System.out.println("");
    int countMatch = 0;
    int computerNum;
    String computer = "", comStr = "";
    countMatch = 1;
    while(countMatch <= numMatch)
    {
          computerNum = (int)(3*Math.random());
          if (computerNum ==1)
          {
                  computer = "R";
                  comStr = "rock";
          }
          else if (computerNum == 2)
          {
              computer = "P";
              comStr = "paper";
          }
          else if (computerNum == 3)
          {
              computer = "S";
              comStr = "scissors";
          }
         
          System.out.print("\tMatch " + countMatch + ":  Enter R for rock, P for Paper, or S for scissors: ");
          String userType;
          userType = scnr.next();
          if(!(userType.equals("R") || userType.equals("S") || userType.equals("P")))
          {
              System.out.println("Not a legal move! You Lose.");
              countMatch = numMatch;
              break;
          }
          if (userType.equals(computer))
          {
              System.out.println("\tThe computer chose " + comStr +". You tied.");
              tieScore = tieScore + 1;
              System.out.println("\tScore: You-" + userScore + "  Computer-" + compScore + "  Ties-" + tieScore);
              System.out.println();
          }
          else if (userType.equals("P"))    
          {
              if (computer.equals("R"))
             {
               System.out.println("\tThe computer chose " + comStr + ". You win!");
               userScore++;
               System.out.println("\tScore: You-" + userScore + "  Computer-" + compScore + "  Ties-" + tieScore);
               System.out.println();
             }
             if(computer.equals("S"))
             {
               System.out.println("\tThe computer chose " +comStr + ". You lose.");
               compScore++;
               System.out.println("\tScore: You-" + userScore + "  Computer-" + compScore + "  Ties-" + tieScore);
               System.out.println();
             }
          }
         else if(userType.equals("R"))
         {
              if (computer.equals("P"))
             {
               System.out.println("\tThe computer chose " + comStr + ". You lose.");
               compScore++;
               System.out.println("\tScore: You-" + userScore + "  Computer-" + compScore + "  Ties-" + tieScore);
               System.out.println();
             }
             if(computer.equals("S"))
             {
               System.out.println("\tThe computer chose " +comStr + ". You win!");
               userScore++;
               System.out.println("\tScore: You-" + userScore + "  Computer-" + compScore + "  Ties-" + tieScore);
             }
         }
         else if(userType.equals("S"))
         {
              if (computer.equals("P"))
             {
               System.out.println("\tThe computer chose " + comStr + ". You win!");
               userScore++;
               System.out.println("\tScore:   You-" + userScore + "  Computer-" + compScore + "  Ties-" + tieScore);
               System.out.println();
             }
             if(computer.equals("R"))
             {
               System.out.println("\tThe computer chose " +comStr + ". You lose.");
               compScore++;
               System.out.println("\tScore:   You-" + userScore + "  Computer-" + compScore + "  Ties-" + tieScore);
               System.out.println();
             }
         }
       countMatch++;
    }
    System.out.println("\n");
   
    System.out.println("The game of " + numMatch + " matches is complete. The final scores are: ");
    System.out.println("You:      " + userScore);
    System.out.println("Computer: " + compScore);
    System.out.println("Ties:     " + tieScore);
  }
}