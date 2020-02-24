package Assignment;

// Create and access default and static method of an interface.
interface StaticDefault{
    default void display(){
        System.out.println("From Interface");
    }

    static void newStatic(){
        System.out.println("From Interface Static");
    }
}
public class Ques6 implements StaticDefault{
    public static void main(String[] args) {
        Ques6 obj = new Ques6();
        obj.display();
        StaticDefault.newStatic();
    }
}
