public class Main_15_Comparison {

/*
Comparison

== --> Is it equal?
!= --> Is it not equal?
> --> Is it bigger/greater?
>= --> Is it bigger or eual?
< --> Is it smaller?
<= --> Is it smaller or equal?

/*
	 && means "and": If you use "&&" between two things it means you want both.
	                 For example; "tea && coffee" means I want both, just one will not be enough.

	                 To get 'true' && operation all must be true.
	                 true && true ==> true
	                 true && false ==> false
	                 false && trues ==> false
	                 false && false ==> false


	       & means "and" as well --> If you use "&" between two things it means you want both.
	                 For example; "tea && coffee" means I want both, just one will not be enough.

	                 To get 'true' && operation all must be true.
	                 true & true ==> true
	                 true & false ==> false
	                 false & trues ==> false
	                 false & false ==> false

	    Note "&" and "&&" do the same but:
	     "&&" doesn't check the second condition if the first condition is false.
	     "&" checks both conditions every time.


	 */

	/*
	 || means "or": If you use "||" between 2 things it means at least one of them is enough for you
	                For example; "tea || coffee" means just tea, or coffee, or both

	                To get false from "||" operation all must be false
	                true || true ==> true
	                true || false ==> true
	                false || true ==> true
	                false || false ==> false
	 */



    public static void main(String[] args) {
        System.out.println(3==3);// true (boolean)
        System.out.println(4<3);// false
        System.out.println(3 != 4); // true
        System.out.println("Jane" == "Jane");
        System.out.println("Jane" != "Rain");

        // using && and ||
        System.out.println(3 ==3 && 2 < 3);//true as bith are true
        System.out.println(3==1 && 2 <3);//false as one of them is false
        System.out.println(3==1 || 2>3 || 1==1); //true as one of them is true
        System.out.println(!true);//false
        System.out.println(!((3<4 && "Hi"=="Hi") || 3.4 > 2.1)); // false
    }
}
