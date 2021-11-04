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
        citiesStream.forEach(s->System.out.println(s)); // выводим отфильтрованные строки на консоль
        Stream<String> citiesStream2 = Arrays.stream(new String[]{"Париж", "Лондон", "Мадрид"}) ;
        citiesStream2.forEach(s->System.out.println(s)); // выводим все элементы массива
    }

}
