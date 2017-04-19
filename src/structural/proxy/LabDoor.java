package structural.proxy;

class LabDoor implements IDoor {
    @Override
    public void open() {
        System.out.println("Opening lab door");
    }

    @Override
    public void close() {
        System.out.println("Closing the lab door");
    }
}
