package OOP;

public class Oop1 {
    public static void main(String[] args) {
        Students s = new Students();
        s.name = "aman";
        System.out.println(s.name);
    }
}

class Students {
    String name;
    int marks;
}

