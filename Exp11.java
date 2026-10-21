class Worker extends Thread {
    public void run() { System.out.println("Thread subclass running"); }
}
public class Exp11 {
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Worker();
        Thread b = new Thread(() -> System.out.println("Runnable running"));
        a.start(); b.start(); a.join(); b.join();
    }
}