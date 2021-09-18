package com.company;

public class methods {
    public static void main (String args[]){

        hello();
        welcome();
        welcome();
        display("Tom", 34);
        display("Bob", 28);
        display("Sam", 23);
        sum(1, 2, 3);           // 6
        sum(1, 2, 3, 4, 5);     // 15
        sum();                  // 0
    }

    static void hello(){

        System.out.println("Hello");
    }
    static void welcome(){

        System.out.println("Welcome to Java 10");
    }


    static void display(String name, int age){

        System.out.println(name);
        System.out.println(age);
    }
    static void sum(int ...nums){

        int result =0;
        for(int n: nums)
            result += n;
        System.out.println(result);
    }
    static int sum(int x, int y){

        return x + y;
    }
    static double sum(double x, double y){

        return x + y;
    }
    static int sum(int x, int y, int z){

        return x + y + z;
    }
}

