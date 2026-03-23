package OOP;

public class Oop {
    public static void main(String[] args) {
//        Pen p1 = new Pen(); //created a pen object p1
//        p1.setColor("Blue");
//        System.out.println(p1.getColor());
//        p1.setTip(5);
//        System.out.println(p1.getTip());
//        BankAccount myAcc = new BankAccount();
//        myAcc.username = "milangauswami07";
//        myAcc.password = "abc";

//        Student s1 = new Student("milan");
//        System.out.println(s1.name);
//        Student s1 = new Student();
//        Student s2 = new Student("Milan");
//        Student s3 = new Student(123);
//        Student s4 = new Student("Adity" , 123);

        Student s1 =new Student();
        s1.name = "Milan";
        s1.roll = 1716;
        s1.password = "abc";
        s1.mark[0] = 100;
        s1.mark[1] = 90;
        s1.mark[2] = 80;

        Student s2 = new Student(s1);
        s1.mark[2] = 85;
        s2.password = " xyz";




    }
}
//class BankAccount {
//    public String username;
//    private String password; //not acessable to main function because this is private not a public
//
//}
//class Pen{
//    String color;
//    int tip;
//    String getColor(){
//        return this.color;
//    }
//    int getTip(){
//        return this.tip;
//    }
//    void setColor(String newColor){
//        color = newColor;

//    }
//    void setTip(int newTip){
//        tip = newTip;
//    }
//}
class Student{
    String name;
    int roll;
    String password;
    int mark[];

    Student(Student s1){
        mark = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;

        for (int i = 0; i <3; i++) {
            this.mark[i] = s1.mark[i];
            System.out.println(mark[i]);
        }


    }

    // shallow copy constructor
//    Student(Student s1){
//        this.name=s1.name;
//        this.roll = s1.roll;
//        marks = new int[3];
//        this.marks = s1.marks;
//    }

    Student(){
        mark = new int[3];

        System.out.println(" Constructor is called..");

    }
    Student (String name){
        mark = new int[3];
        this.name = name;
        System.out.println(name);
    }

    Student(int roll){
        mark = new int[3];
        this.roll = roll;
    }


}
