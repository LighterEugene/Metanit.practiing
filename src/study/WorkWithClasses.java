package  study;

public class WorkWithClasses {
    public static void main(String[] args) {

        Person tom = new Person("Tom");
        tom.setAccount("qwerty");
    }
}
class Person{

    private String name;

    Person(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void display(){

        System.out.println("Name: " + name);
    }

    public void setAccount (String password){

        class Account{

            void display(){
                System.out.printf("Account Login: %s \t Password: %s \n", name, password);
            }
        }
        Account account = new Account();
        account.display();
    }
    class Employee extends Person{

        private String company;

        public Employee(String name, String company) {

            super(name);
            this.company=company;
        }
        @Override
        public void display(){

            super.display();
            System.out.printf("Works in %s \n", company);
        }
    }
}