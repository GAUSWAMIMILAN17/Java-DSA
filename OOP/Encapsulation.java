package OOP;

import java.sql.SQLOutput;

public class Encapsulation {

    static void main(String args[]) {
        Person a = new Person();
//        a.getName();
//        System.out.println(a.getName());
//        a.name= "jay";
//        System.out.println(a.getName());

//        a.setName("jay");
//        System.out.println(a.getName());
        Person b = a.getObject();  // same object but two reference
    }
}

class Person {
    Person() {
        this(20);
    }
    Person(int x) {
        System.out.println(x);
    }
    private String name = "milan";

    //getter
    public String getName() {
        return name;
    }
    Person getObject(){  //getobject method call kre se
        return this;  //current object ne return kre se
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
}
