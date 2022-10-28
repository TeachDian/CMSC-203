import java.util.Scanner;

public class Exam {
    public static void name(String[] args) throws Exception{
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Number of Test Cases: ");
            int q = scan.nextInt();

            if (1 <= q && q <= 31){
                String inputs[] = new String[q];
                for (int i = 0; i < q; i++) {
                    System.out.print("Number of Holidays: ");
                    scan = new Scanner(System.in);
                    inputs[i] = scan.nextLine();
                }
            } else
            System.out.println("Enter 1 to 31 Day(s) only!");
            
        }
    }
}
