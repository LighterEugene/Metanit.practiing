package ContinuingStudy;
import java.io.File;
import java.io.IOException;

public class InputOutputStreamTenth {


        public static void main(String[] args) {
            File dir2 = new File("C://SomeDir");
            // если объект представляет каталог
            if(dir2.isDirectory())
            {
                // получаем все вложенные объекты в каталоге
                for(File item : dir2.listFiles()){

                    if(item.isDirectory()){

                        System.out.println(item.getName() + "  \t folder");
                    }
                    else{

                        System.out.println(item.getName() + "\t file");
                    }
                }
            // определяем объект для каталога
            File dir = new File("C://SomeDir//NewDir");
            boolean created = dir.mkdir();
            if(created)
                System.out.println("Folder has been created");
            // переименуем каталог
            File newDir = new File("C://SomeDir//NewDirRenamed");
            dir.renameTo(newDir);
            // удалим каталог
            boolean deleted = newDir.delete();
           if(deleted)
                System.out.println("Folder has been deleted");
        }
            // определяем объект для каталога
            File myFile = new File("C://SomeDir//notes.txt");
            System.out.println("File name: " + myFile.getName());
            System.out.println("Parent folder: " + myFile.getParent());
            if(myFile.exists())
                System.out.println("File exists");
            else
                System.out.println("File not found");

            System.out.println("File size: " + myFile.length());
            if(myFile.canRead())
                System.out.println("File can be read");
            else
                System.out.println("File can not be read");

            if(myFile.canWrite())
                System.out.println("File can be written");
            else
                System.out.println("File can not be written");

            // создадим новый файл
            File newFile = new File("C://SomeDir//MyFile");
            try
            {
                boolean created = newFile.createNewFile();
                if(created)
                    System.out.println("File has been created");
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }
}

