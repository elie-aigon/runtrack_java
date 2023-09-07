package Job5;

import Job5.ExceptionVitesse;

public class Voiture {
    private int speed = 0;
    private String Marque;
    private String Couleur;

    public void start (int speed){
        this.speed = speed;
        System.out.println("La voiture démarre.");
    }
    public void stop (){
        System.out.println("La voiture s'arrête.");
    }
    public void accelerer (){
        try{
            speed+= 10;
            System.out.println("La voiture est maintenant à " + speed);
            if (speed > 100) {
                throw new ExceptionVitesse("Ralenti zebi");
            }
        } catch (ExceptionVitesse e) {
            System.err.println(e.getMessage());
        }
    }
}