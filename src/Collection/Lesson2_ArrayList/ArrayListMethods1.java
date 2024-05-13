package Collection.Lesson2_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zayr");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add(1,"Misha");
        for (String s: arrayList1) {
            System.out.println(s + " ");
        }

        System.out.println();
        ArrayList <Integer> arrayList2 = new ArrayList();
        arrayList2.add(3);
    }
}
