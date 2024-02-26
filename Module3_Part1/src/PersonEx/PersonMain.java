package PersonEx;

public class PersonMain {
    public static void main(String[] args) {
//        Student student1 = new Student("Alan Turing",22,"1723 Callowill St",
//                "CCP",4.0);
//        student1.sayHello();

        System.out.println();

        Engineer engineer1 = new Engineer("Alan Turing",22,"1723 Callowill St",
                "CCP",5);
        engineer1.sayHello();

        //with default constructor
        System.out.println();
        Student student2 = new Student("CCP",3.8);
        student2.sayHello();

    }
}
