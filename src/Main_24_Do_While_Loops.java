import java.util.Scanner;

public class Main_24_Do_While_Loops {
    public static void main(String[] args) {
        // Do while loop - it works at least once. Used less than for loop and for-while loop
//        int i = 0;
//        do {
//            System.out.println("i = "+i);
//            i++;
//        } while (i<5);

    // Task - find the sum of all digits in a number
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=scan.nextInt();
        int sum = 0;
        do {
            sum += number%10;
            number /= 10;
            System.out.println("Curreny number: " +number);
        } while (number>0);
        System.out.println("Sum: "+sum);



    }
}
