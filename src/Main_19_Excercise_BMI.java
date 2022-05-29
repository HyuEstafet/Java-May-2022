import java.util.Scanner;

public class Main_19_Excercise_BMI {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input your weight: ");
        int weight = scan.nextInt();
        System.out.println("Input your height: ");
        double height = scan.nextDouble();
        double BMI = weight/(height* height);

        if (BMI < 0 && BMI <= 18.5) {
            System.out.println("Your BMI is: "  + BMI + " and you're skinny");
        } else if (BMI > 18.5 && BMI < 25) {
            System.out.println("Your BMI is: "  + BMI + " and your weight is fine");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Your BMI is: "  + BMI + " and your weight is excess");
        } else {
            System.out.println("Your BMI is: "  + BMI + " and you're obese");
        }

    }
}
