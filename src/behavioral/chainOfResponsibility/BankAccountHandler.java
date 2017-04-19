package behavioral.chainOfResponsibility;


class BankAccountHandler extends AAccountHandler {

    public BankAccountHandler(double amount, AAccountHandler accountHandler) {
        super(amount, accountHandler);
    }

    public BankAccountHandler(double amount) {
        super(amount);
    }
}
