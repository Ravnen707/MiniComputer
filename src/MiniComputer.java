package mini_computer;

public class MiniComputer {

    static Scanner sc = new Scanner(system.in);

    public static main(String[] args) {
        boolean gate = true;
        while(gate) {
            println("[programnavn]");
            println("[programnavn]");
            println("[programnavn]");
            println("[programnavn]");
            println("[programnavn]");
            println("[programnavn]");
            println("[programnavn]");
            println("[programnavn]");
            println("[programnavn]");
            println("[programnavn]");
            println("0 - Exit");
            println("What program do you want to run?");
            if(sc.hasNextLine()) {
                String input = sc.nextLine();

                if(input.equals("0")) gate = false;
            } else println("Input error!");
        }
    }
}