package Job1;

public class SimpleThreadExercice extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 5){
            System.out.println("Salut du thread");
            i++;
        }
    }
}
