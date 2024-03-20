package Lesson16_String;

public class test6 {
    public static void main(String[] args) {
        String s = "privet";

        String s2 = s.toLowerCase();
        System.out.println(s2);

        String s3 = s.toUpperCase();
        System.out.println(s3);

        boolean b = s.contains(":2");
        System.out.println(b);
    }
}
