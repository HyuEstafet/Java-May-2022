import java.util.Scanner;

   /*
    Find the Mass Body Index of a user
    BMI: Weight / Height * Height
     */

public class Main_10_Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Please enter your height: ");
        double height = scanner.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("Your BMI is: " + BMI);

    }
}
