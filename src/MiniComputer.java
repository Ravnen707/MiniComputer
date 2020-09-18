import java.util.*;

public class MiniComputer {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean gate = true;
        while(gate) {
            System.out.println("[programnavn]");
            System.out.println("[Konverter sekunder til timer]");
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
    public static void Konverter() {
        Scanner input = new Scanner(System.in);
        int Mimuter = input.nextInt();

        System.out.print("Skriv et intenger for Mimuter : ");

        int Timer = Mimuter / 60;
        int ResterendeSekunder = Mimuter % 60;
        System.out.println(Mimuter + " Mimuter er " + Timer +
                " Timer og " + ResterendeSekunder + " Mimuter");
    }
}