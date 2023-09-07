package Job1;

public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;
    public CompteEpargne(float solde, double tauxInteret) {
        super(solde);
        this.tauxInteret = tauxInteret;
    }
    public void interet() {
        this.solde += (this.solde * tauxInteret);
        System.out.println("Solde après interet : " +  this.solde );
    }
}
