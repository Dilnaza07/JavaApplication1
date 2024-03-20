package Lesson16_String;

public class Test4_String_metods {

}

class Employee {
    double salary;
    boolean isManagar;

    Employee(double salary, boolean isManagar) {
        this.salary = salary;
        this.isManagar = isManagar;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(100.5, true);
        System.out.println("Is he manager? " + emp.isManagar + ". His salary is " + emp.salary);
    }
}