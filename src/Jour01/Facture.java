package Jour01.Job08;

public class Facture {
    public static void main(String[] args) {
        double prix = 49.99;
        int quantite = 3;
        double ht = prix*quantite;
        double taxe = (prix * quantite)/5;
        double ttc = ht + taxe;
        System.out.println("HT = " + ht + " ; taxe = " + taxe + " ; TTC = " + ttc);
    }
}
