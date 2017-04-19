package behavioral.nullObject;

class Main {
    public static void main(String[] args) {
        Application application = new Application(new NullPrintStream());
        application.go();
    }
}
