package Assignment;

// Implement following functional interfaces from java.util.function using lambdas:
// (1) Consumer
// (2) Supplier
// (3) Predicate
// (4) Function

import java.util.function.*;

public class Ques5 {
    public static void main(String[] args) {
        Consumer consumer = (e) -> {
            System.out.println(e);
        };
        consumer.accept(2);


        Supplier supplier = () -> {
            int ret = 2;
            return ret;
        };

        System.out.println(supplier.get());

        Function<Integer,Integer> fun = (a) -> 2 + a;
        System.out.println(fun.apply(2));


        Predicate<Integer> predicate = (e) -> e%2==0;
        System.out.println(predicate.test(11));

    }
}
