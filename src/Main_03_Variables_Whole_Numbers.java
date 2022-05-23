public class Main_03_Variables_Whole_Numbers {

    public static void main(String[] args) {

        // Whole numbers: byte --> short --> int --> long

        byte b = 100;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println("------");

        short c = 1220;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println("------");

        int a = 4;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("------");

        long d = 23456;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println("------");

        // auto-widening

        short j = 1000;
        int i = (j / 2);
        int k = j;
        System.out.println(j);
        System.out.println(i);
        System.out.println(k);
        System.out.println("------");

        // explicit narrowing
        byte a1 = 100;
        byte b1 = (byte)(a1/2);
        System.out.println(a1);
        System.out.println(b1);
        System.out.println("------");

        short p = 100;
        byte s = 2;
        int z = 4;

        // byte --> short --> int --> long
        long w = p + s + z;
        System.out.println(w);

    }
}
