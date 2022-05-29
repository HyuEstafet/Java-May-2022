import java.util.Scanner;

public class Main_12_Exercise_Swap_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum;
        int secondNum;

        System.out.println("First number: ");
        firstNum = scanner.nextInt();

        System.out.println("Second number: ");
        secondNum = scanner.nextInt();

        System.out.println("Before the swap the first number is: " +firstNum + " and the second number is: " + secondNum);

        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;

        System.out.println("After the swap the first number is: " + firstNum + " and the second number is: " + secondNum);

    }
}
