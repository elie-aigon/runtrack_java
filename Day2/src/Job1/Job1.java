package Job1;

public class Job1 {
    public static void main(String[] args) {
        CompteBancaire cb = new CompteBancaire(100);
        CompteEpargne ce = new CompteEpargne(200, 0.02);
        cb.afficherSolde();
        ce.afficherSolde();
        ce.interet();
    }

}
