package Day6;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static BiFunction<Integer, Integer, Integer> add = Integer::sum;
    public static BiFunction<Integer, Integer, Integer> sub = (a, b) -> a - b;
    public static Integer multiply(int a, int b) {
        return a * b;
    }


    public static void main(String[] args) {
        System.out.println("the result of addition is :" + add.apply(5, 10) );
        System.out.println("the result of subtraction is :" + sub.apply(10, 5) );
        System.out.println("the result of multiplication is :" + multiply(5, 10) );
        }
    }

