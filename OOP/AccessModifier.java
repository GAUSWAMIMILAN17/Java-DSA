package OOP;

public class AccessModifier {
    static void main(String[] args) {
        //Private Access Modifier
//        BankAcount bankAcount = new BankAcount();
//        bankAcount.setName("Milan");
//        System.out.println(bankAcount.name);
//        bankAcount.balance;  //aaaccess nai thay
//        bankAcount.setBalance(200);
//        System.out.println(bankAcount.getBalance());

        //Default Access Modifier
//        B b = new B();
//        b.show();
    }
}

//Private Access Modifier
class BankAcount{
    public String name;
    private double balance;
    public void setName(String username) {
        this.name = username;
    }
    public void setBalance(double amount) {
        balance = amount;
    }
    public double getBalance() {
        return balance; // class nin andar j balance ne access kari sakiye bija class ma acess kri sakta nathi
    }
}

//Default Access Modifier
//class A {           //default class
//    int data = 50;  //default var
//    String name;
//
//    void setNewName(String newName) {       //default method
//        name = newName;
//    }
//}
//
//class B {
//    void show(){
//        A a = new A();
//        a.setNewName("milan");
//        System.out.println(a.name);
//    }
//}

