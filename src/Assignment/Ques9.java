package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

// Collect all the even numbers from an integer list.
public class Ques9 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(10));
        }

        System.out.println(list);
        System.out.println(list.stream().filter(e->e%2==0).collect(Collectors.toList()));
    }
}
