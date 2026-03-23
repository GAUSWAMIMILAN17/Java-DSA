package OOP;

public class Abstraction {
    public static void main(String[] args) {
//        Horse h = new Horse();
//        h.eat();
//        h.changeColor();
//        h.walk();

        //constructor call
        Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang class in order inhert kar rahi hai

//        Animal A = new Animal(); // not creat oblect of abstract class

    }
}
abstract class Animal{
    String color = "black";

    Animal(){
        System.out.println("animal constructor called");
    }

    void eat(){
        System.out.println("animal eat");
    }
    abstract void walk();


}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor() {
        color = "dark brown";
        System.out.println(color);

    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang Constructor called");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color = " yellow";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}
