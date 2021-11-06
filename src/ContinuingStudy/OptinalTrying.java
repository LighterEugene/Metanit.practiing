package ContinuingStudy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptinalTrying {
    public static void main(String[] args) {
        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = numbersStream.parallel().reduce((x,y)-> x*y);
        System.out.println(result.get()); // 720
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 8", 54000),
                new Phone("Nokia 9", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("LG G6", 32000));


        Map<String, Integer> phones = phoneStream
                .collect(Collectors.toMap(p->p.getName(), t->t.getPrice()));

        phones.forEach((k,v)->System.out.println(k + " " + v));
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        if(min.isPresent()){

            System.out.println(min.get());
        }
        System.out.println(min.orElse(-1)); // -1
        Random rnd = new Random();
        System.out.println(min.orElseGet(()-> {
            return rnd.nextInt(100);
        }));
    }

}


