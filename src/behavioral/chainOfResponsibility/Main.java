package behavioral.chainOfResponsibility;

class Main {
    public static void main(String[] args) {
        AAccountHandler bankAccountHandler =
                new BankAccountHandler(100,
                        new PaypalAccountHandler(200,
                                new BitcoinAccountHandler(300)));

        bankAccountHandler.withdraw(259);
        bankAccountHandler.withdraw(1000);
    }
}
