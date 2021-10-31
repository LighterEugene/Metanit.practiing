package study;

public class Lambda {
    static int x = 10;
    static int y = 20;
    int z = 60;
    public static void main(String[] args) {

        Operation2 op2 = ()->{
            x=30;
            return x+y;

        };

        System.out.println(op2.calculate()); // 50
        System.out.println(x); // 30 - значение x изменилось

        PrintableTwo printer = s->System.out.println(s);
        printer.print("Hello Java!");
        Operationable operation;
        Operationable operation1 = (int x, int y)-> x / y;
        Operationable operation2 = (int x, int y)-> x - y;
        Operationable operation3 = (int x, int y)-> x * y;

        System.out.println(operation1.calculate(20, 10)); //30
        System.out.println(operation2.calculate(20, 10)); //10
        System.out.println(operation3.calculate(20, 10)); //200
        operation = (a,y)->a+y;

        int result = operation.calculate(10, 20);
        System.out.println(result); //30
        Operationable op = new Operationable(){

            public int calculate(int x, int y){

                return x + y;
            }
        };
        int z = op.calculate(20, 10);
        System.out.println(z); // 30

    }
}
interface Operationable{
    int calculate(int x, int y);
}
interface PrintableTwo{
    void print(String s);
}
interface Operation2{
    int calculate();
}

