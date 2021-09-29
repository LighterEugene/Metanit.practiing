package study;

public class ExceptionStudies  {
    public static void main(String[] args) throws Exception {
        System.out.println(getFactorial(0));
    }
    public static int getFactorial(int num) throws Exception{

        if(num<1) throw new Exception("The number is less than 1");
        int result=1;
        for(int i=1; i<=num;i++){

            result*=i;
        }
        return result;
    }
}
