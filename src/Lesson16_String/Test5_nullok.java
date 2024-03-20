package Lesson16_String;

public class Test5_nullok {
    public static void main(String[] args) {


        String s = null;
        s += "ok";
        System.out.println(s);


        //System.out.println(null + true); //ошибка компиляции

    }
}
