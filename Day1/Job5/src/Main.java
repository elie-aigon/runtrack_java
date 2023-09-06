public class Main {
    public static void main(String[] args) {
        Dé dé = new Dé(6);
        int num1 = dé.lancerDé();
        int num2 = dé.lancerDé();
        System.out.println("Dé 1 : " + num1);
        System.out.println("Dé 2 : " + num2);
        System.out.println("Somme = " + (num1 + num2));
    }
}