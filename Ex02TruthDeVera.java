import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int minNum = 1;
    int maxNum = 10;
    int noOfTurns = 3;
    char response;


    
    System.out.println("\n\n\nWelcome to Higher or Lower!");
    
    System.out.print("What would you like us to call you?  ");
    String username = sc.nextLine();
      
    System.out.println("\n\nHello " + username + ".");


    
    do{
      System.out.println("\n\n\nWhat would you like to do?\n  A - Start Game\n  B - Change Settings\n  C - end application");

      response = sc.next().charAt(0);

      switch(response) {
        case 'A':
        case 'a':
          int turn = noOfTurns;
          int guess;
          int randomNum = (int)(Math.random() * (maxNum - minNum + 1) + minNum);  // 0 to 100
          System.out.print("I'm thinking of a number from "+minNum+" to "+maxNum+". \n What's the number?  ");
          while(turn>0) {
            guess = sc.nextInt();
            turn--;
            if (guess==randomNum){
              System.out.print("Congratulations " + username + " you have guessed the number!\n");
            break;
            }
            if (turn==0){
              System.out.println("Aww, you lost!");
              break;
            }
            if (guess<randomNum) {
              System.out.print("Guess higher! You have " + turn + " guess(es) left. What's your next guess?  ");
            }
            else {
              System.out.print("Guess lower! You have " + turn + " guess(es) left. What's your next guess?  ");
            }

          }

          
        case 'B':
        case 'b':
          System.out.println("What is the lowest number you want me to make you guess? (Current: "+minNum+")  ");
          minNum = sc.nextInt();
          System.out.println("What is the highest number you want me to make you guess? (Current: "+maxNum+")  ");
          maxNum = sc.nextInt();
          System.out.println("How many guesses would you like me to  give you?(Current: "+noOfTurns+")  ");
          noOfTurns = sc.nextInt();


        case 'c':
        case 'C':
          System.out.println("Ok then, goodbye!");
          break;

        default:
          System.out.println("That... is not one of the options.\n\n");
      }
        

      
    } while (response !='c' && response != 'C');



        
  } 
}

