import java.util.Random;
import java.util.Scanner;

public class RngGuess {
    static Scanner sc = new Scanner(System.in);

    public static void rngGuess() {

        // importer java.util.random
        Random rand = new Random();

        //siger hvad nummer den skal være imellem i forhold til et til 10
        int Numbers = rand.nextInt(10);

        //fortæller tallet der skal gættes imellem. der kan gættes udenfor 1-20, men der er et rigtigt tal mellem 1-20.
        System.out.println("Guess the number from 1 to 10");

        // tjekker for tallet.
        String input = sc.nextLine();
        double RNG = Double.parseDouble(input);

        //ser om tallet er rigtigt eller forkert, og gir svar til givende tal.
        if (Numbers == RNG) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}
