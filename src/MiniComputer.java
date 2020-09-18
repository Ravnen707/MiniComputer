import java.util.*;


public class MiniComputer {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean gate = true;
        while (gate) {
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("[RNGguess]");
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("0 - Exit");
            System.out.println("What program do you want to run?");
            if (sc.hasNextLine()) {
                String input = sc.nextLine();

                if (input.equals("0")) gate = false;
                if (input.equals("5")) RNGguess();
            } else System.out.println("Input error!");


        }
        public static void RNGguess(){

                double RNG;

                // importer java.util.random
                Random rand = new Random();

                //siger hvad nummer den skal være imellem i forhold til et til 20
                int Numbers = rand.nextInt(10);

                //fortæller tallet der skal gættes imellem. der kan gættes udenfor 1-20, men der er et rigtigt tal mellem 1-20.
                System.out.println("Guess the number from 1 to 10");

                // tjekker for tallet.
                RNG = sc.nextDouble();

                //ser om tallet er rigtigt eller forkert, og gir svar til givende tal.
                if (Numbers == RNG) {
                    System.out.println("You got it right!");
                } else {
                    System.out.println("Better luck another time!");
                }
            }
        }
    }




