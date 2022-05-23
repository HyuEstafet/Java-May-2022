public class Main_07_Simple_Operations {
    public static void main(String[] args) {
        /*
        + --> sum
        - --> difference
        / --> delete
        * --> multiply
        % --> modulus
         */

        System.out.println(3+4);
        System.out.println(3-5f);
        System.out.println(10/4); // we get 2 because it int deletion
        System.out.println(10d/4); // we get 2.5 due to the double
        System.out.println(10/4.0); // we get 2.5 due to teh double
        System.out.println(3*4);
        System.out.println(4*4.5);
        System.out.println(10%4);

        int a = 4;
//        a = a +2;
//        System.out.println(a);

        int b = 6;
        b = b*3;
        System.out.println(b);

        //to shorten

        a+=2; // a = a+2;
        System.out.println(a); // 6

        a*=4;
        System.out.println(a); // 24

        int c = 7;
        int d = 6;
//        c+=1;
//        d-=1;
//        c++; // postfix
//        d--; // postfix
//        System.out.println(c);
//        System.out.println(d);
//
//        ++c; //prefix
//        --d; //prefix

        // difference between prefix and postfix when printing
        System.out.println(c++); // doesn't update the value
        System.out.println(++c); // updates the value
        System.out.println(d--);
        System.out.println(--d);

        // the rule for execution
        System.out.println(3f / 3+4*5); // just like the maths operations
        // use () to make sure

    }
}
