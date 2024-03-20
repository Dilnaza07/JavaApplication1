package Lesson16_String;

public class Test1_String_metods {
    public static void main(String[] args) {


        String s1 = new String("privet");
        String s2 = new String("abcdifjabcd");

        int a = s1.length(); //длинна массива стринг
        System.out.println(a);

        char c1 = s1.charAt(3); //какой char находиться на нужном индексе
       // char c2 = s1.charAt(10); //ошибка, неккоректный индекс вызывает ошибку
        System.out.println(c1);

        int i1 = s1.lastIndexOf('t'); //на каком индексе находится char
        int i2 = s1.lastIndexOf("t"); //на каком индексе находится char
        int i3 = s1.lastIndexOf("vet"); //на каком индексе находится char
        int i4 = s1.lastIndexOf("z"); //-1
        System.out.println(i3);
        System.out.println(i4);

        int i5 = s2.indexOf("a",5);//начиная с 5 индекса на каком индексе находиться char
        System.out.println(i5);

        boolean b1 = s1.startsWith("abc");
        boolean b2 = s2.startsWith("abc");
        boolean b3 = s2.startsWith("abc",7);
        System.out.println(b3);

        boolean b4 = s2.endsWith("d");
        System.out.println(b4);


    }
}
