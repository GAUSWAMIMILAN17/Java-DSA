package OOP;

public class CopyConstructor {

    String name;
    int age;

    // Normal Constructor
    CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    CopyConstructor(CopyConstructor another) {
        this.name = another.name;
        this.age = another.age;
    }

    public static void main(String[] args) {
//----------------------Copy Constructer
//        CopyConstructor p1 = new CopyConstructor("John", 25);
//
//        CopyConstructor p2 = new CopyConstructor(p1);
//
////        p2.name = "Mike";
////        p2.age = 30;
//        p1.name = "milan";
//        p1.age = 25;
//
//        System.out.println(p1.name + " " + p1.age);
//        System.out.println(p2.name + " " + p2.age);

//-----------------------Reference Copy

        CopyConstructor p1 = new CopyConstructor("John" , 25);

        CopyConstructor p2 = p1;
//        without changes
        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p2.age);

        p2.name="yug";
        p2.age=18;
        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p2.age);




    }
}