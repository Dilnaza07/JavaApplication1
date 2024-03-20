package Lesson16_String;

public class Test2_String_metods {
    public static void main(String[] args) {
        String s1 = new String("   abcdefg  abcd  ");

        String s10 = s1.substring(3);//присвой сабстринг начиная с 3 индекса
        System.out.println(s10);
        System.out.println(s1);

        String s11 = s1.substring(3,7);
        System.out.println(s11);

        String s12 = s1.trim();
        System.out.println(s12);

        String s13 = s1.substring(3,10);
        System.out.println(s13);

        String s2 = new String("privet");

        String s14 = s2.replace('r','z');
        String s15 = s2.replace('o','z');//ничего не поменяется менять нечего буквы o нет
        String s16 = s2.replace("vet","vivka");
        System.out.println(s15);
        System.out.println(s16);

        String s3 = "poka";
        String s4 = s3.replace("k","k");
        System.out.println(s3==s4);

        String s5 = "privet, ";
        String s6 = "drug";
        System.out.println(s5.concat(s6));
    }
}
