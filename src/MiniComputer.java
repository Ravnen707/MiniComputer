import java.util.*;
import java.time.LocalDateTime;

public class MiniComputer {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean gate = true;
        while(gate) {
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("[programnavn]");
            System.out.println("4 - getTime");
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
                if(input.equals("4")) getTime();
                System.out.println("Press enter when ready");
                input = sc.nextLine();
            } else System.out.println("Input error!");
        }
    }
    public static void getTime() {
        System.out.println(LocalDateTime.now());
    }
}