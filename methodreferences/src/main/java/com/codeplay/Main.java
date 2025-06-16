package com.codeplay;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> max = Integer::max;
        System.out.println(max.apply(30, 40));

        BiFunction<Integer, Integer, Integer> maxlamda = (x, y) -> Integer.max(x, y);
        System.out.println(maxlamda.apply(50, 60));

        // ClassName :: staticMethodName
        Function<Double, Double> sqrt = Math::sqrt;
        System.out.println(sqrt.apply(100.0d));
        // Function<Double, Double> sqrt = x -> Math.sqrt(x);

        // objectName :: instanceMethodName
        String someText = "Hello, World Welcome to JAVA";
        Function<String, Integer> indexValue = someText::indexOf;
        System.out.println(indexValue.apply("World"));
        // Function<String, Integer> indexValue = string -> someText.indexOf(string);

        // ClassName :: instanceMethodName
        // hear, the object is the "100L" itself upon which instance method is called
        Function<Long, Double> converter = Long::doubleValue;
        System.out.println(converter.apply(100L));
        // Function<Long, Double> converter = val -> val.doubleValue();

        // ClassName :: new
        Function<String, Person> personGenerator = Person::new;
        Person person = personGenerator.apply("John Carter");
        System.out.println(person.name);
        // Function<String, Person> personGeneratorLambda = name -> new Person(name);

    }
}