package Job3;

public class Bank{
    private float solde;

    public float getSolde() {
        return solde;
    }

    public Bank(float solde) {
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