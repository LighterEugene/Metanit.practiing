package ContinuingStudy;
import java.util.stream.*;
import java.util.*;
public class StreamAPIOne {
    public static void main(String[] args) {
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        System.out.println(count);
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");

        Stream<String> citiesStream = cities.stream(); // получаем поток
        citiesStream = citiesStream.filter(s->s.length()==6); // применяем фильтрацию по длине строки
        citiesStream.forEach(System.out::println); // выводим отфильтрованные строки на консоль
        Stream<String> citiesStream2 = Arrays.stream(new String[]{"Париж", "Лондон", "Мадрид"}) ;
        citiesStream2.forEach(s->System.out.println(s)); // выводим все элементы массива



        IntStream intStream = IntStream.of(1,2,4,5,7);
        intStream.forEach(i->System.out.println(i));

        LongStream longStream = LongStream.of(100,250,400,5843787,237);
        longStream.forEach(l->System.out.println(l));

        DoubleStream doubleStream = DoubleStream.of(3.4, 6.7, 9.5, 8.2345, 121);
        doubleStream.forEach(d->System.out.println(d));

    }

}
