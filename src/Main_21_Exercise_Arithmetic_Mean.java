import java.util.Scanner;

public class Main_21_Exercise_Arithmetic_Mean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First Term score: ");
        int firstTerm = scan.nextInt();
        System.out.println("Second Term score: ");
        int secondTerm = scan.nextInt();
        System.out.println("Final score: ");
        int finalScore = scan.nextInt();
        System.out.println("Your Arithmetic Mean: ");
        double arithmeticMean = scan.nextDouble();
        double resultScore = (firstTerm * 3 / 10.0) + (secondTerm * 3 / 10.0) + (finalScore * 4 / 10.0);

        if (resultScore >= 90) {
            System.out.println("Your result is AA");
        } else if (resultScore >= 85) {
            System.out.println("Your result is AB");
        } else if (resultScore >= 80) {
            System.out.println("Your result is BB");
        } else if (resultScore >= 75) {
            System.out.println("Your result is CB");
        } else if (resultScore >= 70) {
            System.out.println("Your result is CC");
        } else if (resultScore >= 65) {
            System.out.println("Your result is DC");
        } else if (resultScore >= 60) {
            System.out.println("Your result is DD");
            if (arithmeticMean < 2.50) {
                System.out.println("You need to study more!!!");
            }
        } else if (resultScore >= 55) {
            System.out.println("Your result is FD and you couldn't pass");
        } else {
            System.out.println("Exam failed!");
        }
    }
}
