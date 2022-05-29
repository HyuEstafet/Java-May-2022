import java.util.Scanner;

public class Main_13_Exercise_Triangle_Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.println("First value: ");
        a = scanner.nextInt();

        System.out.println("Second value: ");
        b = scanner.nextInt();

        double h = Math.sqrt(a*a + b*b);
        System.out.println("The value of h is: " + h);

    }
}
