package Day7;

import java.util.Optional;

public class NullValueDemo {
    public static void main(String[] args) {
        // creating optional
        Optional<String> optionaltring = Optional.ofNullable("java");
        System.out.println(optionaltring); // false


        // creating optiona null
        Optional<String> empty =  Optional.empty();
        System.out.println(empty); // true


        // for value of to pass the value
        Optional<String> str = Optional.of("Hello World");
        System.out.println("Value: " + str.get()); // Hello World


        //chcecking the value is present or not
        Optional<Object> mayBe = Optional.of("Hi");
        System.out.println(mayBe.isPresent()); // true
    }
}
