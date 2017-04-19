package behavioral.chainOfResponsibility;


class PaypalAccountHandler extends AAccountHandler {

    public PaypalAccountHandler(double amount, AAccountHandler accountHandler) {
        super(amount, accountHandler);
    }

    public PaypalAccountHandler(double amount) {
        super(amount);
    }
}
