import java.util.Scanner;

public class Main_16_If_Else {
    public static void main(String[] args) {

        // if - else

        Scanner scan = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = scan.nextInt();

        if (age < 18) {
            System.out.println("You can't enter this place");
        } else {
            System.out.println("Welcome!");
        }

        // if - else if - else

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Make a calculation");
        int calculation = scan2.nextInt();
        if (calculation==1) {
            System.out.println("initial test calculation");
        } else if (calculation==2) {
            System.out.println("first calculation");
        } else if (calculation==3) {
            System.out.println("second calculation");
        } else if (calculation==4) {
            System.out.println("third calculation");
        } else {
            System.out.println("invalid calculation");
        }

        Scanner degreescan = new Scanner(System.in);
        int degree = degreescan.nextInt();

        if (degree >= 90) {
            System.out.println("Excellent");
        } else if (degree >= 85) {
            System.out.println("Very good");
        } else {
            System.out.println("It's not enough - work harder");
        }

    }
}
