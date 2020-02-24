package Assignment;

import java.util.*;

// Sum all the numbers greater than 5 in the integer list.
public class Ques10 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(10));
        }

        System.out.println(list);
        System.out.println(list.stream().filter(e->e>5).mapToInt(e->e).sum());
    }
}
