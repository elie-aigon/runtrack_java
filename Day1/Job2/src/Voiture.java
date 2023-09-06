public class Voiture {
    private int speed = 0;
    private String Marque;
    private String Couleur;

    public void start (){
        System.out.println("La voiture démarre.");
    }
    public void stop (){
        System.out.println("La voiture s'arrête.");
    }
    public void accelerer (){
        speed+= 10;
        System.out.println("La voiture est maintenant à " + speed);
    }
}
