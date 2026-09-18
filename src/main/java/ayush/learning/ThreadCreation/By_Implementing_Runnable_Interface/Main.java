package ayush.learning.ThreadCreation.By_Implementing_Runnable_Interface;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnableThread());
        thread.start();
    }
}
