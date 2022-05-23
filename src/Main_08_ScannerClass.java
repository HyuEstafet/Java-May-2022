import java.util.Scanner;

public class Main_08_ScannerClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // example 1
//        System.out.println("Please enter your age:");
//        int age = scanner.nextInt();
//        System.out.println("Age: " + age);

        // example 2
//        System.out.println("Put the price please:");
//        double price = scanner.nextDouble();
//        System.out.println("The price is " + price + " dollars");

        //example 3
//        System.out.println("Enter your hometown");
//        String town = scanner.nextLine();
//        System.out.println("Hometown: " +town);

        if (scanner.hasNextInt()){
            int number = scanner.nextInt();
            System.out.println("Number: " + number);
        }
        else {
            System.out.println("Please enter a number!");
        }
    }
}
