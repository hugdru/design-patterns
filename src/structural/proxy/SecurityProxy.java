package structural.proxy;

class SecurityProxy {
    private IDoor door;

    public SecurityProxy(IDoor door) {
        this.door = door;
    }

    public void open(String password) {
        if (this.authenticated(password)) {
            this.door.open();
        } else {
            System.out.println("Access denied!");
        }
    }

    private boolean authenticated(String password) {
        return password.equals("$ecr@t");
    }

    public void close() {
        this.door.close();
    }
}
