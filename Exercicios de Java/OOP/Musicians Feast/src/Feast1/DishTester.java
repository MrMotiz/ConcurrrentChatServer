package Feast1;

public class DishTester {

    public static void main(String[] args) {
        testDish("Bob Dylan", "beef wellington");
        testDish("Mick Jagger", "mushroom soup");

    }
    public static String testDish(String musicianName, String dish) {
        String musician = musicianName.toLowerCase();
        String disher = dish.toLowerCase();
        if (musician.toLowerCase().charAt(0) == disher.toLowerCase().charAt(0) &&
                musician.charAt(musicianName.length() - 1) == disher.charAt(dish.length() - 1)) {
            return "Well done";
        }
        return "No good";
    }
}
