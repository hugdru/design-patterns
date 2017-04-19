package behavioral.chainOfResponsibility;

class BitcoinAccountHandler extends AAccountHandler {

    public BitcoinAccountHandler(double amount, AAccountHandler accountHandler) {
        super(amount, accountHandler);
    }

    public BitcoinAccountHandler(double amount) {
        super(amount);
    }
}
