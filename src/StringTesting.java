import java.util.regex.*;

public class StringTesting {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String(); // пустая строка
        String str3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);//3 -начальный индекс, 4 -кол-во символов

        System.out.println(str1); // Java
        System.out.println(str2); //
        System.out.println(str3); // hello
        System.out.println(str4); // come
        String str5 = "Java";
        System.out.println(str5.length()); // 4
        String str6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        char[] helloArray = str6.toCharArray();
        String s = "";   // строка не указывает на объект
        if (s.length() == 0) System.out.println("String is empty");
        if (s.isEmpty()) System.out.println("String is empty");
        String n = null;   // строка не указывает на объект
        if (n == null) System.out.println("String is null");
        String str7 = "Java";
        String str8 = "Hello";
        String str9 = str8 + " " + str1;

        System.out.println(str8.concat(str1)); // Hello Java
        System.out.println(String.join(" ", str8, str1)); // Hello Java
        String str = "Java";
        char c = str.charAt(2);
        System.out.println(c); // v
        String str10 = "Hello world!";
        int start = 6;
        int end = 11;
        char[] dst = new char[end - start];
        str10.getChars(start, end, dst, 0);
        System.out.println(dst); // world
        String str11 = "Hello";
        String str12 = "hello";

        System.out.println(str11.equals(str12)); // false
        System.out.println(str11.equalsIgnoreCase(str12)); // true
        //Сравнение подстрок
        String str13 = "Hello world";
        String str14 = "I work";
        boolean result = str13.regionMatches(6, str14, 2, 3);
        System.out.println(result); // true
        String str15 = "hellv";
        String str16 = "helmq";
        String str17 = "hell";

        System.out.println(str15.compareTo(str16));
        System.out.println(str15.compareTo(str17)); // 15 - str1 больше чем str13
        String str18 = "Hello world";
        int index1 = str18.indexOf('l'); // 2
        int index2 = str18.indexOf("wo"); //6
        int index3 = str18.lastIndexOf('l'); //9
        String str19 = "Hello world";
        String replStr1 = str19.replace('l', 'd'); // Heddo wordd
        String replStr2 = str19.replace("Hello", "Bye"); // Bye world
        System.out.println(replStr2);
        String text = "FIFA will never regret it";
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        String str20 = "Java";
        StringBuffer strBuffer = new StringBuffer(str20);
        System.out.println("Емкость: " + strBuffer.capacity()); // 20
        strBuffer.ensureCapacity(32);
        System.out.println("Емкость: " + strBuffer.capacity()); // 42
        System.out.println("Длина: " + strBuffer.length()); // 4
        String input = "+12343454556";
        boolean resultNew = input.matches("(\\+*)\\d{11}");
        if (resultNew) {
            System.out.println("It is a phone number");
        } else {
            System.out.println("It is not a phone number!");
        }

        String input1 = "Hello";
        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher(input1);
        boolean found = matcher.matches();
        if (found)
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");


                String input2 = "Hello Java! Hello JavaScript! JavaSE 8.";
                Pattern pattern1 = Pattern.compile("Java(\\w*)");
                Matcher matcher1 = pattern1.matcher(input2);
                while(matcher1.find()) {
                    System.out.println(matcher1.group());

                }
        String newStr = matcher1.replaceAll("HTML");
        System.out.println(newStr); // Hello HTML! Hello HTML! HTML 8.

        String textik = "Вот мысль, которой весь я предан,\n"+
                "Итог всего, что ум скопил.\n"+
                "Лишь тот, кем бой за жизнь изведан,\n"+
                "Жизнь и свободу заслужил.";
        System.out.println(textik);
        String textik2 = """
                Вот мысль, которой весь я предан,
                Итог всего, что ум скопил.
                Лишь тот, кем бой за жизнь изведан,
                Жизнь и свободу заслужил.
                """;// the part is only for Java 15
        System.out.println(textik2);
        double d = 2.0 - 1.1;
        System.out.println(d);
    }
}
