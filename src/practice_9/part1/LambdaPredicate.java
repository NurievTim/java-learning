package practice_9.part1;

import java.util.function.Predicate;

public class LambdaPredicate {
    public static void main(String[] args){
        Predicate<Integer> isEven = n -> n % 2 ==0;
        System.out.println(isEven.test(6));
    }


}
