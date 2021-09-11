public class StringTesting {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String(); // пустая строка
        String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);//3 -начальный индекс, 4 -кол-во символов

        System.out.println(str1); // Java
        System.out.println(str2); //
        System.out.println(str3); // hello
        System.out.println(str4); // come
        String str5 = "Java";
        System.out.println(str5.length()); // 4
        String str6 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        char[] helloArray = str6.toCharArray();
        String s = "";   // строка не указывает на объект
        if(s.length() == 0) System.out.println("String is empty");
        if(s.isEmpty()) System.out.println("String is empty");
        String n = null;   // строка не указывает на объект
        if(n == null) System.out.println("String is null");
        String str7 = "Java";
        String str8 = "Hello";
        String str9 = str8 + " " + str1;

        System.out.println(str8.concat(str1)); // Hello Java
        System.out.println( String.join(" ", str8, str1)); // Hello Java
        String str = "Java";
        char c = str.charAt(2);
        System.out.println(c); // v
        String str10 = "Hello world!";
        int start = 6;
        int end = 11;
        char[] dst=new char[end - start];
        str10.getChars(start, end, dst, 0);
        System.out.println(dst); // world
        String str11 = "Hello";
        String str12 = "hello";

        System.out.println(str11.equals(str12)); // false
        System.out.println(str11.equalsIgnoreCase(str12)); // true
        //Сравнение подстрок
        String str13 = "Hello world";
        String str14 = "I work";
        boolean result = str1.regionMatches(6, str2, 2, 3);
        System.out.println(result); // true
    }
}
