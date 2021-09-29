package study;

public class Test {
    public static void main(String[] args) {

        TestPersonFinal kate = new TestPersonFinal("Kate");
        System.out.println(kate.getName());     // Kate
        changePerson(kate);
        System.out.println(kate.getName());     // Kate - изменения не произошло
        // kate хранит ссылку на старый объект
    }
    static void changePerson(TestPersonFinal p){
        p = new TestPersonFinal("Alice");    // p указывает на новый объект там что здесь и та что в методе мейн, хранит ссылку на разные объекты.
        p.setName("Ann");
    }
    static void changeName(TestPersonFinal p){
        p.setName("Alice");
    }
}
class TestPersonFinal {

    private String name;

    TestPersonFinal(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){

        return this.name;
    }
}

