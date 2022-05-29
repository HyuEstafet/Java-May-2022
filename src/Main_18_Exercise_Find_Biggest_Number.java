import java.util.Scanner;

public class Main_18_Exercise_Find_Biggest_Number {
    /*
    Find the biggest number out of the three numbers that a users provides
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Second number: ");
        int secondNumebr = scanner.nextInt();
        System.out.println("Third number: ");
        int thirdNumber = scanner.nextInt();

        int max = -1;
        if (firstNumber >= secondNumebr && firstNumber>=thirdNumber) {
            max = firstNumber;
        } else if (secondNumebr >= firstNumber && secondNumebr>=thirdNumber) {
            max = secondNumebr;
        } else {
            max = thirdNumber;
        }
        System.out.println("The maximum number is: " +max);
    }
}
