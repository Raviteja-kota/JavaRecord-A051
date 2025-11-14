class MyThread extends Thread {
    public void run() { System.out.println("Running in thread"); }
}
public class MultiThread {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
    }
}
