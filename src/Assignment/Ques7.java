package Assignment;

// Override the default method of the interface.
interface OverRideDefault{
    default void display(){
        System.out.println("From Interface");
    }
}

public class Ques7 implements OverRideDefault{

    @Override
    public void display() {
        System.out.println("From Class");
    }

    public static void main(String[] args) {
        Ques7 obj = new Ques7();
        obj.display();
    }
}
