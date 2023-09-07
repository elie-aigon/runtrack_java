package Job4;

public class Job4 {
    public static void main(String[] args) {
        diviser(3,5);
        diviser(3,0);
    }
    static public void diviser(int n1, int n2) {
        try{
            float output = n1/n2;
            System.out.println("Résultat = " + output);
        } catch (ArithmeticException e) {
            System.err.println("Erreur : Division par zéro !");
        }
    }
}
