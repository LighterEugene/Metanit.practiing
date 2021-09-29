package study;

public class interfaceTrying {

    public static void main(String[] args) {
        Calculatable c = new Calculation();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2, 4));
        Printable printable = new study.Book2("Java. Complete Reference", "H. Shildt");
        printable.print();//  Java. Complete Reference (H. Shildt)
        printable = new Journal("Foreign Policy");
        printable.print();      // Foreign Policy
        Printable p =new Journal("Foreign Affairs");
        p.print();
// Интерфейс не имеет метода getName, необходимо явное приведение
        String name = ((Journal)p).getName();
        System.out.println(name);
    }

}
class Calculation implements Calculatable{

}
interface Calculatable{

    default int sum(int a, int b){
        return sumAll(a, b);
    }
    default int sum(int a, int b, int c){
        return sumAll(a, b, c);
    }

    private int sumAll(int... values){
        int result = 0;
        for(int n : values){
            result += n;
        }
        return result;
    }
}
interface Printable{
    void print();
}
class Book2 implements Printable{

    String name;
    String author;

    Book2(String name, String author){

        this.name = name;
        this.author = author;
    }

    public void print() {

        System.out.printf("%s (%s) \n", name, author);
    }
}
class Journal implements Printable {

    private String name;

    String getName(){
        return name;
    }

    Journal(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }

}