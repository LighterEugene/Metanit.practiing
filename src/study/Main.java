package study;

/*
    многострочный комментарий
    Объявление нового класса,
    который содержит код программы
*/
public class Main{   // начало объявления класса Program

    // определение метода main
    public static void main (String args[]){    // объявление нового метода

        int x = 8, y = 15;
        System.out.println(x);  // 8
        System.out.println(y);  // 15
        x = 25;
        System.out.println(x);  // 25
        var z = 10;
        System.out.println(z);  // 10
        final int LIMIT = 5;
        System.out.println(LIMIT);  // 5
// LIMIT=57; // так мы уже не можем написать, так как LIMIT - константа
        boolean isActive = false;
        boolean isAlive = true;
        byte a = 3;
        byte b = 8;
        short aa = 3;
        short bb = 8;
        int aaa = 4;
        int bbb = 9;
        long aaaa = 5;
        long bbbb = 10;
        double xx = 8.5;
        double yy = 2.7;
        float xxx = 8.5F;
        float yyy = 2.7F;
        int num111 = 0x6F; // 16-тиричная система, число 111
        int num8 = 010; // 8-ричная система, число 8
        int num13 = 0b1101; // 2-ичная система, число 13
        int xxxx = 123_456;
        int yyyy = 234_567__789;
        float fl = 30.6f;
        double db = 30.6;
        char ch=102; // символ 'f'
        char br = 20000;
       char  chone ='\u0066';
        System.out.println(ch);
        System.out.println( chone);
        System.out.println(x);  // 123456
        System.out.println(y);  // 234567789
        System.out.println("Hello Java!");     // вывод строки на консоль

        int j = 7;
        for (int i = 0; i < 10; i++){
            if (i == 5)
                continue;
            System.out.println(i);
        }

        int[] nums2;
        int[] nums = new int[4];
// устанавливаем значения элементов массива
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 100;

// получаем значение третьего элемента массива
        System.out.println(nums[2]);    // 4
        int[][] nums3 = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        int[] num5 = new int[]{ 1,2,3,4,5};
        int[][] nums6 = new int[3][];
        nums6[0] = new int[2];
        nums6[1] = new int[3];
        nums6[2] = new int[5];
        for (int i = 0; i < nums6.length; i++){
            for(int zj=0; zj < nums6[i].length; zj++){

                System.out.printf("%d ", nums6[i][zj]);
            }
            System.out.print("\n");
        }
    }   // конец объявления нового метода
} // конец объявления класса Program