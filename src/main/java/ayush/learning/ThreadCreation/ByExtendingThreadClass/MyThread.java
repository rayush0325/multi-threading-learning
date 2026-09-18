package ayush.learning.ThreadCreation.ByExtendingThreadClass;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.printf("\nthread is running\n");
    }
}
