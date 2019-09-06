package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(20, "Carmen", "F");
        Person person2 = new Person(25, "Costel", "M");
        Predicate<Person> predicat1 = y -> y.getAge() == 20;   // (-> operator lambda)
        System.out.println(predicat1.test(person1));
        Predicate<Person> predicat2 = y -> y.getAge() == 20;
        System.out.println(predicat2.test(person2));

        Runnable myRunnable = () -> System.out.println("Running a runnable");
        myRunnable.run();
        Predicate<String> startsWithABCTest = s -> s.startsWith("ABC");
        System.out.println(startsWithABCTest.test("ABCDEF"));

        MyInt ddd = () -> System.out.println("ASDS");
        ddd.toto();

        Function<String, Integer> stringLengthFunction = s -> s.length();
        System.out.println(stringLengthFunction.apply("ABCDE"));

        Function<String, String> replaceC = a -> a.replace(",", ".");
        System.out.println(replaceC.apply("a,b,c"));

        Supplier<Integer> s = () -> new Random().nextInt();
        System.out.println(s.get());

        Consumer<Integer> c = i -> System.out.println("My " + i);
        c.accept(4);

        UnaryOperator<Integer> y = i -> i * i / 100;
        System.out.println(y.apply(10000));

        UnaryOperator<String> z = ee -> ee.concat(ee);
        System.out.println(z.apply("abba"));

        UnaryOperator<Integer> sumOperator = i -> {
            int result = i * i;
            System.out.println("Result:" + result);
            return result;
        };
        sumOperator.apply(4);

        Optional<String> myOp = Optional.ofNullable(null);
        if(myOp.isPresent()){
            System.out.println(myOp.get());
        }else {
            System.out.println("nu e");
        }
        System.out.println(myOp.orElse("OTHER"));
        myOp.ifPresent(System.out::println);

        List<String> aaa = Arrays.asList("aa", "ab", "ac", "bc", "cb");
        //Optional<String> a = aaa.stream().filter(i->i.startsWith("a")).findAny();
        Predicate<String> a1 = i->i.startsWith("a");
        List<String> a = aaa.stream().filter(a1).collect(Collectors.toList());
        //System.out.println(a.get());
        System.out.println(a);
            }
        }




