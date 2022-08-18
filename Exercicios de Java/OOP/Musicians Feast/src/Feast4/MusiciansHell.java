package Feast4;

public class MusiciansHell {

    public static void main(String[] args) {
        String[] musicians = {"Steven Tyler", "Erykah Badu", "Mick Jagger", "Paul McCartney", "Brandon Flowers", "Alex Turner"};

        String musician = pickMusician(musicians); // should return the musician's name, or "No one will stay to help.
        System.out.println(musician);
    }

    public static String pickMusician(String[] musicians) {
        int randomNumber = (int) Math.floor(Math.random() * 6 + 10);
        for (int i = 0; i < musicians.length; i++) {
            if (musicians[i].length() == randomNumber) {
                return musicians[i];
            }

        }
        return "No one will stay to help.";
    }

//random number between 10 and 15 to give each artist.
// If the musician's name has more letters than the picked number, that musician gets chosen to help.

}
