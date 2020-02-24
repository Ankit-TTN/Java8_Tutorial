package Assignment;

import java.util.*;

public class Ques12 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(rand.nextInt(100));
        }

        System.out.println(list);
        Optional<Integer> op = list.stream().filter(e->(e%2==0) && e>3 ).findFirst();
        System.out.println(op.isPresent()?op.get():"-1");
    }
}
