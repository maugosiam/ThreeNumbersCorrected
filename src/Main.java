import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ThreeThings<String> objectFirst = new ThreeThings("Ala", "Ma", "Kota");
        ThreeThings<String> objectSecond = new ThreeThings<>("Kot", "Ma", "Alę");
        ThreeThings<Integer> objectThird = new ThreeThings<>(1,2,3);
        ThreeThings<Integer> objectFourth = new ThreeThings<>(2,1,3);
        ThreeThings<String> objectFifth = new ThreeThings<>("Ala", "Kota", "Ma");
        ThreeThings<Integer> objectSixth = new ThreeThings<>(55,66,77);

        if (objectFirst.equals(objectSecond)){
            System.out.println("objectFirst is the same as objectSecond");
        }

        if (objectFirst.equals(objectThird)){
            System.out.println("objectFirst is the same as objectThird");
        }

        if (objectFirst.equals(objectFourth)){
            System.out.println("objectFirst is the same as objectFourth");
        }

        if (objectFirst.equals(objectFifth)){
            System.out.println("objectFirst is the same as objectFifth");
        }

        if (objectFirst.equals(objectSixth)){
            System.out.println("objectFirst is the same as objectSixth");
        }







    }
}
