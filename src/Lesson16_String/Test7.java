package Lesson16_String;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "Uraaaaaaaa!";
        String s3 = s1.concat(s2).trim().replace("Uraaaaaaaa", "УРА").substring(6, 10);
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}
