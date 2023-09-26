import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.*;

public class Main {
    private static final Logger log = Logger.getLogger("Main");

    private static int get_int() {
        System.out.print("Please enter an integer: ");
        Scanner in = new Scanner(System.in);
        int res;
        try {
            res = in.nextInt();
        } catch (InputMismatchException e) {
            log.log(Level.WARNING, "Input an integer please, e.x. '10'");
            System.out.println("- - - -");
            return get_int();
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("In this program you will enter two numbers...");
        Integer num_one = get_int();
        Integer num_two = get_int();
        switch (num_one.compareTo(num_two)) {
            case -1: System.out.println(num_one + " < " + num_two); break;
            case 0: System.out.println(num_one + " = " + num_two); break;
            case 1: System.out.println(num_one + " > " + num_two); break;
        }
    }
}