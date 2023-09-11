package Job2;

public class RunnableInterfaceExercice implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (i < 5) {
            System.out.println("En cours d'exécution...");
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle the InterruptedException (optional)
            }
        }
    }
}
