package Job1;
public class CompteBancaire {
    public float solde;
    public CompteBancaire(float startSolde) {
        solde = startSolde;
    }
    public void deposer(float amount) {
        solde+= amount;
        System.out.println(amount + "€ déposer. Nouveau solde: " + amount + "€.");
    }
    public void retirer(float amount) {
        if (solde >= amount) {
            solde -= amount;
            System.out.println(amount + " retirés. Nouveau solde : " + solde+ "€.");
        } else {
            System.out.println("Tentative de retrait de " + amount + " €, solde insufisant : " + solde+ "€.");
        }
    }
    public void afficherSolde() {
        System.out.println(solde + "€.");
    }
}