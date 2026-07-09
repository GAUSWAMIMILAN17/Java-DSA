package OOP;


public class shallowdeepcopy {
    String name;
    int age;
    Adress adress;


     shallowdeepcopy(String name, int age, Adress adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

     shallowdeepcopy(shallowdeepcopy another){
        this.name = another.name;
        this.age = another.age;
        this.adress = another.adress;
    }

    static void main(String[] args) {
        Adress ad = new Adress("kodinar");
        shallowdeepcopy p1 = new shallowdeepcopy("milan", 12, ad);

//        System.out.println(p1.name);
//        System.out.println(p1.age);
//        System.out.println(p1.adress);
        shallowdeepcopy p2 = new shallowdeepcopy(p1);
//        System.out.println(p2.adress);

        p1.adress.address  = "sindhaj";
        System.out.println(p1.adress);
        System.out.println(p2.adress);


//        p1.name = "yug";
//        System.out.println(p1.name);
//        System.out.println(p2.name);
//        System.out.println(p2.name);
//        System.out.println(p2.age);


    }
}

class Adress {
    String address;

    Adress (String address) {
        this.address = address;
    }

    public String toString() {
        return address;
    }
}