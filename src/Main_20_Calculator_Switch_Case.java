import java.util.Scanner;

public class Main_20_Calculator_Switch_Case {
    /*
    Create a calculator with 4 types of maths calculations
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***************");
        String calculationTypes = "1. Adding\n"+"2. Difference\n" + "3. Multiplication\n" + "4. Deletion";
        System.out.println(calculationTypes);
        System.out.println("***************");
        System.out.println("Choose calculation type: ");
        String calculation = scan.nextLine();
        int a;
        int b;

        switch (calculation) {
            case "1":
                System.out.println("First Number:");
                a = scan.nextInt();
                System.out.println("Second Number:");
                b = scan.nextInt();
                System.out.println("Result: " + a + b);
                break;
            case "2":
                System.out.println("First Number:");
                a = scan.nextInt();
                System.out.println("Second Number:");
                b = scan.nextInt();
                System.out.println("Result: " + (a-b));
                break;
            case "3":
                System.out.println("First Number:");
                a = scan.nextInt();
                System.out.println("Second Number:");
                b = scan.nextInt();
                System.out.println("Result: " + (a*b));
                break;
            case "4":
                System.out.println("First Number:");
                a = scan.nextInt();
                System.out.println("Second Number:");
                b = scan.nextInt();
                System.out.println("Result: " + ((double)a/b));
                break;
            default:
                System.out.println("Invalid calculation type!");
        }
    }
}
