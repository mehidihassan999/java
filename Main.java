package week3;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("mehidi hassan", "P001");
        Person p2 = new Student("rasel riyad", "S12345");
        Person p3 = new Lecturer("dr izzad", "L67890");

        p1.introduce(); 
        p2.introduce(); 
        p3.introduce(); 
    }
}
