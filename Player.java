import java.util.Scanner ;
public class Player {
    private int cash ;

    public Player() {
        cash = 1000;
    }

    public int getCash() {
        return cash;
    }

   public void Guess(int r) {
       System.out.println("You got " + cash + "$ left");
       System.out.println("How much would you like to put in?");
       Scanner sv = new Scanner(System.in);
       int gamblingMoney;
       do {
            gamblingMoney = sv.nextInt();
            if (gamblingMoney <= 0 ) {
                System.out.println("What are you doing !!");
            }
            else if (gamblingMoney > cash) {
                System.out.println("You only got " + cash + "$ left !");
            }
       } while(gamblingMoney <= 0 || gamblingMoney > getCash());
       System.out.println("We picked a random number from 1 to 10, try to guess it!");
       int playerGuess = sv.nextInt();

       if (playerGuess == r) {
           cash += gamblingMoney * 10;
           System.out.println("Nice you got it! here is your money " + gamblingMoney * 10 + "$, now you have : " + cash + "$");
       } else {
           cash -= gamblingMoney;

           System.out.println("You guessed wrong and lost " + gamblingMoney
                   + "$, gimme your money hehe, now you only have " + cash + "$");
           System.out.println("The actual number is " + r);
       }
   }
public void Rules(){
           System.out.println("The Rules are:");
           System.out.println("1) Your Goal is to reach 10000$ to win!");
           System.out.println("2) if you guess right, you get x10 times the amount you bet with");
           System.out.println("3) If you guess wrong, you lose all the money you bet with");

       }
    };

