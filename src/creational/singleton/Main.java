package creational.singleton;

class Main {
    public static void main(String[] args) {
        President president1 = President.getInstance();
        president1.setName("Mr. Robot X");

        System.out.println(president1.toString());

        President president2 = President.getInstance();
        if (president1.equals(president2)) {
            System.out.println("Same president");
        } else {
            System.out.println("Different presidents");
        }
    }
}
