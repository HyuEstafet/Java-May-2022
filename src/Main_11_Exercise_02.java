import java.util.Scanner;

public class Main_11_Exercise_02 {
    /*
    Calculations -
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The price per litre: ");
        double cents = scanner.nextDouble();

        System.out.println("Distance: ");
        int km = scanner.nextInt();

        System.out.println("The total amount to pay: " + (cents*km) + "dollars");
    }
}
