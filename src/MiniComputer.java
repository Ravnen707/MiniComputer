import java.util.*;
import java.time.LocalDateTime;

public class MiniComputer {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean gate = true;
        while (gate) {
            System.out.println("1 - GetLottoTal");
            System.out.println("2 - Konverter sekunder til timer");
            System.out.println("3 - getTime");
            System.out.println("4 - RNGguess");
            System.out.println("0 - Exit");
          
            System.out.println("What program do you want to run?");
            if (sc.hasNextLine()) {
                String input = sc.nextLine();
                if(input.equals("0")) gate = false;
                if(input.equals("1")) GetLottoTal();
                if(input.equals("2")) converter();
                if(input.equals("3")) getTime();
                if(input.equals("4")) RNGguess();
                System.out.println("Press enter when ready to continue...");
                sc.nextLine();
            } else System.out.println("Input error!");
        }
    }
    public static void RNGguess() {

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
    public static void getTime() {
        System.out.println(LocalDateTime.now());
    }
    public static void converter() {
        System.out.println("Skriv et intenger for minutter : ");
        String number = sc.nextLine();
        int minutter = Integer.parseInt(number);

        int Timer = minutter / 60;
        int ResterendeSekunder = minutter % 60;
        System.out.println(minutter + " minutter er " + Timer +
                " Timer og " + ResterendeSekunder + " minutter");
    }
    public static void GetLottoTal() {
        int[] tal =  new int[7];
        for (int i = 0; i < 6; i++) {
            int a = (int)(Math.random() * 101);
            tal[i] =  a ;
        }
        System.out.println( "Lotta tallene er " + tal[0] + " + " + tal[1] + " +  "+ tal[2] +" + "+ tal[3] + " + "+ tal[4] + " + "+ tal[5] + " + "+ tal[6]);
    }
}