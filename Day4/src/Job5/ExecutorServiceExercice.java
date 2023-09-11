package Job5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExercice {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i<=3; i++) {
            int id = i;
            executorService.submit(()-> {
                System.out.println("Resultat de tache " + id + " : " + (id*num));
            });
        }
        executorService.shutdown();
    }
}