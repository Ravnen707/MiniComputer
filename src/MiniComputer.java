import java.util.*;

public class MiniComputer {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean gate = true;
        while(gate) {
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("0 - Exit");
            System.out.println("What program do you want to run?");
            if(sc.hasNextLine()) {
                String input = sc.nextLine();

                if(input.equals("0")) gate = false;
            } else System.out.println("Input error!");
        }
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