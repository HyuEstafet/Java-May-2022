public class Main_04_Variables_Decimal_Numbers {

    public static void main(String[] args) {
        double a = 5.25;
        double b = 4.0;
        double c = 4d;
        double d = 4.23d;

        float a1 = (float) 5.0;
        float b1 = 5f;
        float c1 = 5.2f;

        int i = 22/7;
        float f = 22f/7f;
        double w = 22d/7d;

        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("w = " + w);
        System.out.println("-----");

        // auto-widening

        int r = 5;
        float j = r;
        System.out.println(j);
        System.out.println("-----");

        int r1 = 5;
        double j1 = r;
        System.out.println(j1);
        System.out.println("-----");

        // explicit narrowing

        double d1 = 3.52;
        float f1 = (float) d1;
        System.out.println(f1);
        System.out.println("-----");

        double num1 = 70.25;
        double num2 = 60d;
        double num3 = 80.2;

        System.out.println("Average for double: " + (num1 + num2 + num3)/3);

        float float1 = 70.25f;
        float float2 = 60f;
        float float3 = 80.2f;

        System.out.println("Average for float: " + (float1 + float2 + float3)/3);

    }
}
