package OOP;

public class Multithreading extends  Thread{

    public void run() {
        System.out.println("thread is running");
    }

    static void main(String[] args) {
        Multithreading t = new Multithreading();
        t.start();
    }
}
