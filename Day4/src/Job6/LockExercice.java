package Job6;
public class LockExercice{
    public static void main(String[] args) {
        BankJob6 b = new BankJob6(Float.parseFloat(args[0]));
        Thread t1 = new Thread(() ->b.withdraw(Float.parseFloat(args[1])));
        Thread t2 = new Thread(() ->b.withdraw(Float.parseFloat(args[1])));
        t1.start(); t2.start();
        try{
            t1.join(); t2.join();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            System.out.println(b.getSolde());
        }
    }
}
