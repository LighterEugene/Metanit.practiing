package ContinuingStudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreams {
    public static void main(String[] args) {

        String text = "Hello world! I must be nearer with her,mostly no matter what is the price!"; // строка для записи
        try(FileInputStream fin=new FileInputStream("D://notes.txt"))
        {
            System.out.printf("File size: %d bytes \n", fin.available());

            int i= 0;
            while((i=fin.read())!=-1){ //Когда в потоке больше нет данных для чтения, метод возвращает число -1.

                System.out.print((char)i); // конвертация байта в объект типа char
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


        try(FileOutputStream fos=new FileOutputStream("D://notes.txt"))// считываем с файла тогда InputStream, а когда пишем в файл Output
        {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println(" \nThe file has been written");
    }

}

