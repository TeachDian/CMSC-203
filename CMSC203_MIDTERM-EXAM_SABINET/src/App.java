import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner scan = new Scanner(System.in);
            do {
                System.out.print("Number of Test Cases: ");
                int q = scan.nextInt();

                if (1 <= q && q <= 31) {
                    String inputs[] = new String[q];

                    for (int i = 0; i < q; i++) {
                        int ints;
                        System.out.print("Number of Holidays: ");
                        scan = new Scanner(System.in);
                        inputs[i] = scan.nextLine();
                        System.out.print("Day of Holidays: ");
                        scan = new Scanner(System.in);
                        String hdays = scan.nextLine();
                        
                        //
                        // scan = new Scanner(System.in);
                        // holy[]
                    }

                } else
                    System.out.println("Enter 1 to 31 Day(s) only!");

            } while (true);

        }
    }

    // private static String processInput(String input) {
    // String[] inputs = input.split("\\s+");

    // if (inputs.length != 2)
    // return "Invalid Input";

    // try {
    // int uber = Integer.parseInt(inputs[0]);
    // int grab = Integer.parseInt(inputs[1]);

    // if (uber < 1 || uber > 1000
    // || grab < 1 || grab > 1000)
    // return "Invalid Input";

    // if (uber < grab)
    // return "First";

    // else if (uber > grab)
    // return "Second";

    // else
    // return "Any";
    // } catch (Exception e) {
    // return "Invalid Input";
    // }
    // }
}
