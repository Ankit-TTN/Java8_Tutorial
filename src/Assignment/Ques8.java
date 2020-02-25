package Assignment;

// Collect all the even numbers from an integer list.
interface Ione{
    default void display(){
        System.out.println("Hello");
    }
}

interface ITwo{
    default void display2(){
        System.out.println("World");
    }
}

public class Ques8 implements Ione,ITwo{
    public static void main(String[] args) {
        Ques8 obj = new Ques8();
        obj.display();
        obj.display2();
    }
}
