public class Game {

    private static boolean isGameOver;

    public static void main(String[] args) {
        Player player = new Player("Miguel");
        Player dealer = new Player("Dealer");
        playGame(player, dealer);

    }

    public static void playGame(Player player, Player dealer) {
        while (!isGameOver) {
            if (!doTurn(player)) {
                System.out.println(dealer.getName() + " WON!");
                return;
            }
            if (!doTurn(dealer)) {
                System.out.println(player.getName() + " WON!");
                return;
            }
            Player winner = determineWinner(player, dealer);
            if (winner != null) {
                System.out.println(winner);
                return;
            }
        }
    }

    public static Player determineWinner(Player player, Player dealer) {
        if (player.getScore() == 21 && dealer.getScore() == 21) {
            return dealer;
        }
        return player.getScore() == 21 ? player : dealer.getScore() == 21 ? dealer : null;
    }

    public static boolean doTurn(Player player) {
        int cardScore = drawCard();
        player.addScore(cardScore);
        System.out.println(player.getName() + " draw: " + cardScore + " and now had " + player.getScore() + " points");
        if (isBurst(player)) {
            System.out.println(player.getName() + " burst!");
            isGameOver = true;
            return false;
        }
        return true;
    }

    public static int drawCard() {
        return (int) Math.ceil(Math.random() * 13);
    }

    public static boolean isBurst(Player player) {
        if (player.getScore() > 21) {
            return true;
        }
        return false;
    }
}