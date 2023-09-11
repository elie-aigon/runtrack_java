package Job4;

import java.util.concurrent.Callable;

public class CallableFutureExercice implements Callable<Integer> {
    private int num1;
    private int num2;

    public CallableFutureExercice(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Integer call() throws Exception{
        return this.num1 * this.num2;
    }

}
