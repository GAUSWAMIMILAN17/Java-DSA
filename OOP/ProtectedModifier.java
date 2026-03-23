package OOP;

import LinkedList.B;

public class ProtectedModifier {
    static void main() {
        A a = new A();
        a.show();
    }
}

class A extends B {
    void show(){
        B b = new B();
        System.out.println(b.name); // aa alowed nai kare object
//        System.out.println(data); // direct data access kri sakase
    }
}
