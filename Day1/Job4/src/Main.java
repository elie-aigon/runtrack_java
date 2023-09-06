public class Main {
    public static void main(String[] args) {
        CompteBancaire cb = new CompteBancaire(100);
        cb.afficherSolde();
        cb.deposer(100);
        cb.retirer(50);
        cb.retirer(500);
    }
}