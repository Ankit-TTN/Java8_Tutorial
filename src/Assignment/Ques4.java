package Assignment;

// Create an Employee Class with instance variables (String) name, (Integer)age,
// (String)city and get the instance of the Class using constructor reference

class Employee{
    String name;
    Integer age;
    String city;

    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", city='" + city + '\'' + '}';
    }
}

@FunctionalInterface
interface ConstRef{
    Employee employee(String s,Integer i, String c);
}

public class Ques4 {
    public static void main(String[] args) {
        ConstRef constRef = Employee::new;
        Employee e = constRef.employee("NameX",23,"Delhi");
        System.out.println(e);
    }
}
