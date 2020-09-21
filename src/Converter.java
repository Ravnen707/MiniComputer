import java.util.*;
public class Converter {

    static Scanner sc = new Scanner(System.in);

    public static void converter () {

        System.out.println("Skriv et intenger for minutter : ");
        String number = sc.nextLine();
        int minutter = Integer.parseInt(number);

        int Timer = minutter / 60;
        int ResterendeSekunder = minutter % 60;
        System.out.println(minutter + " minutter er " + Timer +
                " Timer og " + ResterendeSekunder + " minutter");
    }
}
