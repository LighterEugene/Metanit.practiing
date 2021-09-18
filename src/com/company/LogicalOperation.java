package com.company;

public class LogicalOperation {
    public static void main(String[] args) {
        byte b = 7;     // 0000 0111
        short s = 7;    // 0000 0000 0000 0111
        int a1 = 2; //010
        int b1 = 5;//101
        System.out.println(a1&b1); // результат 0
        System.out.println(a1|b1); // результат 7 - 111

        int a2 = 4; //100
        int b2 = 5; //101
        System.out.println(a2 & b2); // результат 4
        System.out.println(a2 | b2); // результат 5 - 101
        int number = 45; // 1001 Значение, которое надо зашифровать - в двоичной форме  101101
        int key = 102; //Ключ шифрования - в двоичной системе 1100110 100101           1100110
        int encrypt = number ^ key; //Результатом будет число 1001011 или 75           1001011
        System.out.println("Зашифрованное число: " +encrypt);

        int decrypt = encrypt ^ key; // Результатом будет исходное число 45
        System.out.println("Расшифрованное число: " + decrypt);
        String nir=  Integer.toBinaryString(encrypt);
        System.out.println(nir);
        byte a = 12;                 // 0000 1100
        System.out.println(~a);     //  1111 0011   или -13
    }

}
