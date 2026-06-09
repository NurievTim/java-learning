package practice_9.part1;

import java.util.function.Consumer;

public class LambdaConsumer {
    public static void main(String[] args){
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Hello World");
    }
}
