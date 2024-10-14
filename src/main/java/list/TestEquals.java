package list;

public class TestEquals {
    public static void main(String[] args) {
        Ville ville1 = new Ville("Ville-City", 100_000_000);
        Ville ville2 = new Ville("Ville-City", 100_000_000);

        System.out.println(ville1.equals((ville2)));

        ville2.setNbHabitant(99_999_999);
        System.out.println(ville1.equals((ville2)));

        ville2.setNbHabitant(100_000_000);
        System.out.println((ville1 == ville2));
        ville2.setNbHabitant(99_999_999);
        System.out.println((ville1 == ville2));


        ville2 = ville1;
        System.out.println(ville1 == ville2);
    }
}
