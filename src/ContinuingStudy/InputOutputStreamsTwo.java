package ContinuingStudy;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class InputOutputStreamsTwo {
    public static void main(String[] args) {
        try(FileInputStream fin=new FileInputStream("D://notes.txt");
    FileOutputStream fos=new FileOutputStream("D://notes2.txt"))
    {
        byte[] buffer = new byte[fin.available()];
        // считываем буфер
        fin.read(buffer, 0, buffer.length);
        // записываем из буфера в файл
        fos.write(buffer, 0, buffer.length);
    }
        catch(IOException ex){

        System.out.println(ex.getMessage());
    }
}
}
