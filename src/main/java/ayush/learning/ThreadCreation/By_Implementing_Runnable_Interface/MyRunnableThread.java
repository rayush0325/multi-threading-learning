package ayush.learning.ThreadCreation.By_Implementing_Runnable_Interface;

public class MyRunnableThread implements Runnable{
    @Override
    public void run(){
        System.out.printf("\nrunnable thread is running\n");
    }
}
