package Lec_1_StringsInJavaPart1;

public class Strings_in_Java {
    public static void main(String[] args) {
        String n1 = "riya" ;
        String n2 = "riya" ;

        System.out.println(n2.hashCode());
        System.out.println(n2.hashCode());

        System.out.println(n1.charAt(0));



        // trying to append string
        n1 = n1+"reddy" ;
        System.out.println(n1);


        String x = new String("hello");
        String y = "hello" ;
        String z  = "hello" ;
        // since the addresses are different it will throw false
        System.out.println(x == y);
        System.out.println(y == z); // this is true because both points to same reference of the string
        System.out.println(x.equals("hello"));



    }
}
