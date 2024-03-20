package Lesson16_String;

public class Test3_String_metods {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        String s = "ok";

        System.out.println(a + b + s); //11ok
        System.out.println("" + a + b + s); // 56ok
        System.out.println("" + (a + b) + s);


        String s1 = "hello";
       // String s2 = a + 8;//стрингу нельзя присвоить инт

    }
}
