//Thread Using Thread Class
class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Thread A : i = " + i);
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Thread B : i = " + i);
    }
}

public class ThreadUsingClass {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();
    }
}
