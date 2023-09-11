package Job7;

public class ThreadInterruptionExercice{
    public static void main(String[] args) {
        int sec = Integer.parseInt(args[0]);
        Thread t1 = new Thread(() -> {
            try{
                System.out.println("Je dors");
                Thread.sleep(sec * 1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        });
        t1.start();
        try {
            Thread.sleep(sec * 1000/2);
            System.out.println("Sleep interronpue après " + sec/2 + " secondes");
            t1.interrupt();
        } catch (Exception e){

        }

    }
}
