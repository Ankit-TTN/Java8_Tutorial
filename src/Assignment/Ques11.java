package Assignment;

import java.util.*;
import java.util.stream.Collectors;

// Find average of the number inside integer list after doubling it.
public class Ques11 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }

        System.out.println(list);
        OptionalDouble op = list.stream().mapToInt(e->e*2).average();
        System.out.println(op.isPresent()?op.getAsDouble():"-1");
    }
}
