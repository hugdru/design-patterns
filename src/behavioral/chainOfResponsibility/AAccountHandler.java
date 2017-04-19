package behavioral.chainOfResponsibility;

abstract class AAccountHandler {
    protected AAccountHandler successor;
    protected double balance;

    public AAccountHandler(double amount, AAccountHandler successor) {
        this.balance = amount;
        this.successor = successor;
    }

    public AAccountHandler(double amount) {
        this.balance = amount;
    }

    public AAccountHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(AAccountHandler successor) {
        this.successor = successor;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (canWithdraw(amount)) {
            System.out.println("Withdraw of " + amount + " from " + this.getClass().getSimpleName());
        } else if (this.successor != null) {
            System.out.println("Cannot pay using " + this.getClass().getSimpleName());
            this.successor.withdraw(amount);
        }

        throw new IllegalStateException("None of the accounts have enough balance");
    }

    private boolean canWithdraw(double amount) {
        return this.balance >= amount;
    }
}
