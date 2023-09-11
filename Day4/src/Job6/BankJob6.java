package Job6;

public class BankJob6 {
    private float solde;
    public float getSolde() {
        return solde;
    }
    public BankJob6(float solde) {
        this.solde = solde;
    }
    public synchronized void withdraw(float amount) {
        if(this.solde >= amount) {
            this.solde-= amount;
            System.out.println("Withdraw succeed of " + amount);
        } else {
            System.out.println("Withdraw failed");
        }
    }
}