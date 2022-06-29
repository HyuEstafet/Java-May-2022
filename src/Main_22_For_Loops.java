import java.util.Scanner;

public class Main_22_For_Loops {
    public static void main(String[] args) {
        /*
        for (start : condition : go up or go down) {
        As soon as the condition is true, this loop will continue to be executed.
        }
         */

       // Option 1: int Outside the loop
        int i;

        for (i=0;i<5;i++){
            System.out.println("i = "+i);
        }
        System.out.println("Finished");

        // Option 2: int Inside the loop

        for (int i1 = 0;i1<5;i1++){
            System.out.println("i1 = "+i1);
        }

        for (int i2 = 10; i2>=0; i2--){
            System.out.println("i2 = "+i2);
        }

        int i3 = 0;
        for (;i3<5; i3++) {
            System.out.println("I'm learning Java");
        }

        int i4 = 0;
        int j4 = 10;

        for (;i4<10 && j4 > 0;i4++,j4--){
            System.out.println("i4 = " + i4);
            System.out.println("j4 = " + j4);
        }

        for (int i5=2; i5<100;i5*=2) {
            System.out.println("i5 = "+i5);
        }

        // Factorial example: 5! = 5x4x3x2x1 --> result 120
        // do it with loop

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int factorial = 1;
        int number = scan.nextInt();
        for(int w=1; w <= number; w++) {
            factorial*=w;
            System.out.println("Factorial= " + factorial + " w= " + w);
        }
        System.out.println("Given number's factorial = " + factorial);
    }
}
