public class Main {

    public static void main(String[] args) {
        int r ;

        Player player = new Player();
        player.Rules();
        do {
            r =(int) (Math.random()*10) + 1;

            player.Guess(r);
            if (player.getCash() <= 0) {
                System.out.println( "Sorry, you lost the game, now I am gonna send you to the shadow realm!");
            }
            else if (player.getCash() >= 10000) {
                System.out.println( "\nCongratulations, you reached 10000$ and won the game!");
            }
        } while(player.getCash() >0 && player.getCash() < 10000);
    }
}
