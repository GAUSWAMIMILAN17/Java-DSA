package OOP;

public class Oop1 {
    public static void main(String[] args) {
//        Students s = new Students();
//        s.name = "aman";
//        System.out.println(s.name);

        Child c = new Child();
        System.out.println(c.user);
    }
}

class Students {
    String name;
    int marks;
}

class Child extends User {
    String user = username;
}

