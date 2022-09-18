import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
       
        int x;

        int y;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("INPUT THE VALUE FOR X: ");

            x = scan.nextInt();

            System.out.print("INPUT THE VALUE FOR Y: ");
            
            y = scan.nextInt();
        }
        int sum = x + y;



        System.out.println("THE SUM IS: " + sum);
        // pogi talaga si philip hehehehehehe

    }
}
