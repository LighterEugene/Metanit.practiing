package study;

public class ContitionalExpression {
    int a = 10;
    int b = 4;
    boolean c = a == b;         // false
    boolean d = a == 10;       // true
    boolean f = a != b;         // true
    boolean z = a != 10;       // false
    boolean q = 10 >= 10;    // true
    boolean t = 10 >= 4;     // true
    boolean y = 10 >= 20;    // false
    boolean a1 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
    boolean a2 = (5 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false, поэтому возвращается false
    boolean a3 = (5 > 6) && (4 < 6); // 5 > 6 - false, поэтому возвращается false (4 < 6 - true, но не вычисляется)
    boolean a4 = (50 > 6) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается true
    boolean a5 = (5 > 6) ^ (4 < 6); // 5 > 6 - true, поэтому возвращается true (4 < 6 - false)
    boolean a6 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается false
}
