public class Player {
    private int score;
    private String name;
    public Player(String name){
        score =0;
        this.name = name;
    }
    public Picks pick(){
        int pick = randomNumber();
        switch (pick){
            case 0:
              return Picks.ROCK;
            case 1:
                return Picks.PAPER;
            default:
                return Picks.SCISSORS;
        }
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public int randomNumber(){
        return (int) (Math.random() * 3);
    }
}
