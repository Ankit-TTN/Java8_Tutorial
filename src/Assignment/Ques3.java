package Assignment;

// Using (instance) Method reference create and apply add and subtract method
// and using (Static) Method reference create and apply multiplication method for the functional interface created.

@FunctionalInterface
interface MethodRef{
    void myMethod(int i,int j);
}

public class Ques3 {

    public void sub(int i,int j){
        System.out.println(i-j);
    }

    public void add(int i,int j){
        System.out.println(i+j);
    }

    static public void mul(int i,int j){
        System.out.println(i*j);
    }

    public static void main(String[] args) {
        MethodRef mRef = new Ques3()::add;
        MethodRef mRef2 = new Ques3()::sub;
        MethodRef mRef3 = Ques3::mul;


        mRef.myMethod(2,3);
        mRef2.myMethod(4,5);
        mRef3.myMethod(5,8);



    }
}
