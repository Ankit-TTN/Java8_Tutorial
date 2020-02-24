package Assignment;

// Write the following a functional interface and implement it using lambda:
// (1) First number is greater than second number or not         Parameter (int ,int ) Return boolean
// (2) Increment the number by 1 and return incremented value    Parameter (int) Return int
// (3) Concatination of 2 string                                 Parameter (String , String ) Return (String)
// (4) Convert a string to uppercase and return .                Parameter (String) Return (String)

@FunctionalInterface
interface Greater{
    boolean greater(int x,int y);
}

@FunctionalInterface
interface Incrementer{
    int increment(int x);
}

@FunctionalInterface
interface Concatinator{
    String concatinate(String s1,String s2);
}

@FunctionalInterface
interface Uppercase{
    String toUpper(String x);
}

public class Ques1 {
    public static void main(String[] args) {
        Greater grObj = (x,y)->x>y;
        Incrementer incrementer = (x)->++x;
        Concatinator con = (x,y)->x+y;
        Uppercase upObj = (x)->x.toUpperCase();

        System.out.println(grObj.greater(5,6));
        System.out.println(incrementer.increment(20));
        System.out.println(con.concatinate("Hello ","World"));
        System.out.println(upObj.toUpper("hello"));


    }
}
