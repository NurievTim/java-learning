package practice_9.part1;

import java.util.function.Function;

public class LambdaFunction {
    public static void main(String[] args){
        Function<String, Integer> stringLength = String::length;
        System.out.println(stringLength.apply("Hello"));
    }
}
