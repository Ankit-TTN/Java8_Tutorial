package Assignment;

// Create a functional interface whose method takes 2 integers and return one integer.

@FunctionalInterface
interface OneInteger{
    int oneValue(int x,int y);
}
public class Ques2 {
    public static void main(String[] args) {
        OneInteger oI = (x,y)->x*y;
        System.out.println(oI.oneValue(2,4));
    }
}
