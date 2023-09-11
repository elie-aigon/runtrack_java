package Job3;

public class SynchornizationExercice {
    public static void main(String[] args) {
        Bank b = new Bank(200);
        Thread t1 = new Thread(() -> b.withdraw(50));
        Thread t2 = new Thread(() -> b.withdraw(250));
        t1.start(); t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            System.err.println(e);
        }
        System.out.println(b.getSolde());
    }
}
