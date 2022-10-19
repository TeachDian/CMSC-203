import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        while(true){
            Scanner s = new Scanner(System.in);
            System.out.print("\n\nMonth: ");
            int mon = s.nextInt();
            String Mon = null;
            switch(mon){
                case 1: Mon = "January"; break;
                case 2: Mon = "February"; break;
                case 3: Mon = "March"; break;
                case 4: Mon = "April"; break;
                case 5: Mon = "May"; break;
                case 6: Mon = "June"; break;
                case 7: Mon = "July"; break;
                case 8: Mon = "August"; break;
                case 9: Mon = "September"; break;
                case 10: Mon = "October"; break;
                case 11: Mon = "November"; break;
                case 12: Mon = "December"; break;
                default: System.out.println("Invalid Input");break;
            }
            System.out.print("Date: ");
            int dat = s.nextInt();
            if (dat > 31) {System.out.println("Invalid Date Input");}   
            else   
            System.out.print("Year: ");
            int yea = s.nextInt();      
            System.out.println("\n"+Mon+" "+dat+" "+yea);
        }
    }
}
