public class Main_06_Variables_String {

    public static void main(String[] args) {
        String a = "Hello";
        System.out.println(a + " to our home");

        String word1 = "Java ";
        String word2 = "is ";
        String word3 = "tricky ";

        String sum = word1 + word2 + word3;
        System.out.println("Today's quote: " + sum);

        String w = "Hi";
        int g = 35;
        String wg = w+g;
        System.out.println(wg);

        String str1 = "abc";
        double d1 = 4.33;
        byte b1 = 10;
        str1 = str1+d1+b1;

        System.out.println(str1);

        char q = '?';
        String h = "How are you" + q;
        System.out.println(h);

        String java = "Java "
                + "Programming "
                + "Language";

        System.out.println(java);

        String spaceTest = "Java\tProgramming\tLanguage";
        // usage of \t --> add one tab space in between the String
        System.out.println(spaceTest);

        String newLineTest = "Java\nProgramming\nLanguage";
        // usage of \n --> goes to the next line
        System.out.println(newLineTest);


    }
}

