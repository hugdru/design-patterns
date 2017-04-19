package structural.proxy;

class Main {
    public static void main(String[] args) {
        SecurityProxy securityProxy = new SecurityProxy(new LabDoor());
        securityProxy.open("password123");
        securityProxy.open("$ecr@t");
        securityProxy.close();
    }
}
