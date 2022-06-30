import java.util.Scanner;

public class Main_23_While_Loops {

    public static void main(String[] args) {
//
//        // Reminder of the for loop pattern
//        for (int y = 0; y <=10; y++) {
//            System.out.println("y = "+y);
//        }
//        System.out.println("Next example");
//
//        // While loop pattern and built
//        int i = 0;
//        while (i<=10){
//            System.out.println("i= "+i);
//            i++;
//        }
//        System.out.println("Next example");
//
//        int z = 10;
//        while (z<=100){
//            System.out.println("z= "+z);
//            z+=3;
//        }
//        System.out.println("Next example");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int number = scanner.nextInt();
//        int factorial = 1;
//
//        while (number>0){
//            factorial*=number;
//            number--;
//        }
//        System.out.println("Factorial: " + factorial);

        // Infinite loops

        int p = 0;
        while (p<10){
            System.out.println("p = "+p);
            // when we don't have the condition p-- or p++ - in this case, the p-- will also make an infinite loop
        }
    }
}
