package Job4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Job4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        CallableFutureExercice t1 = new CallableFutureExercice(5, 6);
        Future<Integer> future = executorService.submit(t1);
        try{
            Integer out = future.get();
            System.out.println("Result = " + out);
        } catch (Exception e){
            System.err.println(e);
        } finally {
            executorService.shutdown();
        }
    }
}
