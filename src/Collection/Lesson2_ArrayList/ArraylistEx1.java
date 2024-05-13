package Collection.Lesson2_ArrayList;

import Lesson16_String.Car;

import java.awt.*;
import java.util.ArrayList;

public class ArraylistEx1 {
    public static void main(String[] args) {
        ArrayList <String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zayr");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
      //  arrayList.add(50);  нельзя
        System.out.println(arrayList1);

        ArrayList <String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Zayr");
        arrayList2.add("Ivan");
       // List <String> arraylist3 = new ArrayList<>();

        ArrayList <String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);
        System.out.println(arrayList1==arrayList4);

        ArrayList arrayList5 = new ArrayList(); //можем добавть все что угодно, компилятор не проверяет, не используется дженерик, так не стоит писать
        arrayList5.add(7);
        arrayList5.add(new Car());


    }
}
