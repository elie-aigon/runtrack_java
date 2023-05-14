package Jour04.Job08;

public class MyThread extends Thread {
    private final long finisher;
    private long count;
    public MyThread(long finisher) {
        this.finisher = finisher;
    }
    @Override
    public void run() {
        count = 0;
        while (count < finisher){
            count++;
        }
    }
    public long getter() {
        return count;
    }
}
