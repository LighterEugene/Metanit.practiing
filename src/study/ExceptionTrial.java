package study;

public class ExceptionTrial {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        try{
            numbers[6]=45;
            numbers[6]=Integer.parseInt("gfd");
        }
        catch(ArrayIndexOutOfBoundsException ex){

            System.out.println("Выход за пределы массива");
        }
        catch(NumberFormatException ex){

            System.out.println("Ошибка преобразования из строки в число");
        }
        try{
            int[] numbers2 = new int[3];
            numbers2[4]=45;
            System.out.println(numbers2[4]);
        }
        catch(Exception ex){

            ex.printStackTrace();
        }
        System.out.println("Программа завершена");
    }
}//
class Factorial{
    public static void main(String[] args){

        try{
            int result = Factorial.getFactorial(5);
            System.out.println(result);
        }
        catch(FactorialException ex){

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
    public static int getFactorial(int num) throws FactorialException{

        int result=1;
        if(num<1) throw new FactorialException("The number is less than 1", num);

        for(int i=1; i<=num;i++){

            result*=i;
        }
        return result;
    }
}

class FactorialException extends Exception{

    private int number;
    public int getNumber(){return number;}
    public FactorialException(String message, int num){

        super(message);
        number=num;
    }
}