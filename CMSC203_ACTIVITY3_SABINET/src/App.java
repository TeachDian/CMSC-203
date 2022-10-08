import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {        
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        do{
            System.out.print("\nNo. of Test Cases: ");
            int zx = scan.nextInt();
            System.out.println("Uber & Grab");
            if (1 <= zx && zx <= 10) {
                String inpts[] = new String [zx];
                for(int i = 0; i < zx; i++){
                    scan = new Scanner(System.in);
                    inpts[i] = scan.nextLine();
                }
                System.out.println("\nResults: ");
                System.lineSeparator();
                for(String inpt : inpts){
                    System.out.println(processInput(inpt));
                }
            }
        } while(done);
        System.out.println();
    }
    private static char[] processInput(String inpt) {
        return null;
    } 
}
