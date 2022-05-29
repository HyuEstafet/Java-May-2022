import java.util.Scanner;

public class Main_09_ScannerClass_02 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        scanner.nextLine(); // dummy --> we need to use this if the first code is not .nextLine()
//        String name = scanner.nextLine();
//        System.out.println("Age: " + age);
//        System.out.println("Name: " + name);

        // better solution - without the dummy line; just make sure to follow the order
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        int age = scanner.nextInt();
//        System.out.println("Age: " + age);
//        System.out.println("Name: " + name);

        //another example when we have multiple data
        Scanner scanner = new Scanner(System.in);

        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();
        int age3 = scanner.nextInt();

        System.out.println("First: " + age1 + " Second: " + age2 + " Third: " + age3);
    }
}
