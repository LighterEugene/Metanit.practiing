package com.company;

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