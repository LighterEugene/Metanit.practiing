package ContinuingStudy;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamsFourth {
    public static void main(String[] args) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "Hello World!";
        byte[] buffer = text.getBytes();
        try{
            baos.write(buffer);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        // превращаем массив байтов в строку
        System.out.println(baos.toString());

        // получаем массив байтов и выводим по символьно
        byte[] array = baos.toByteArray();
        for(byte b: array){

            System.out.print((char)b);
        }
        System.out.println();
        try(FileOutputStream fos = new FileOutputStream("hello.txt")){

            baos.writeTo(fos);
        }
        catch( IOException e){

            System.out.println(e.getMessage());
        }
    }

}

