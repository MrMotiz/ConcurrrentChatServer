

public class Game {


    public static void main(String[] args) {

        Player player = new Player("Pedro");
        Player computer = new Player("Computer");

        startGame(player, computer);
    }


    public static String startGame(Player player, Player computer){
        printPicks(player, computer);
        Picks p1 = player.pick();
        Picks p2 = computer.pick();
        if(p1 != p2){
            if(p1== Picks.ROCK && p2 == Picks.PAPER || p1 == Picks.PAPER && p2== Picks.SCISSORS || p1 == Picks.SCISSORS && p2== Picks.ROCK){
                return computer.getName()+" won this round!";
            } else{
                return player.getName() + " won this round!";
        }

        }
        return "It's a draw";
    }

    public static void printPicks(Picks player, Picks computer){
        System.out.println(player.name()+" picked: " + player.toString());
        System.out.println(computer.name()+" picked: " + computer.toString());
    }

    public static Player determineWinner(Player player, Player computer){
        return player.getScore() == 3 ? player : computer;
    }
}


