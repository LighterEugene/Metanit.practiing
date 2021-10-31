package ContinuingStudy;
import java.io.*;
import java.util.ArrayList;
public class InputOutputStreamsNinth {




        //@SuppressWarnings("unchecked")
        public static void main(String[] args) {

            String filename = "people.dat";
            // создадим список объектов, которые будем записывать
            ArrayList<Person5> people = new ArrayList<>();
            people.add(new Person5("Tom", 30, 175, false));
            people.add(new Person5("Sam", 33, 178, true));

            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
            {
                oos.writeObject(people);
                System.out.println("File has been written");
            }
            catch(Exception ex){

                System.out.println(ex.getMessage());
            }

            // десериализация в новый список
            ArrayList<Person5> newPeople= new ArrayList<Person5>();
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
            {

                newPeople=((ArrayList<Person5>)ois.readObject());
            }
            catch(Exception ex){

                System.out.println(ex.getMessage());
            }

            for(Person5 p : newPeople)
                System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        }
    }
    class Person5 implements Serializable{

        private String name;
        private int age;
        private double height;
        private boolean married;

        Person5(String n, int a, double h, boolean m){

            name=n;
            age=a;
            height=h;
            married=m;
        }
        String getName() {return name;}
        int getAge(){ return age;}
        double getHeight(){return height;}
        boolean getMarried(){return married;}
    }

