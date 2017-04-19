package creational.singleton;

class President {

    private static President instance;

    private String name;

    private President() {
    }

    // Lazy instantiation using double locking mechanism.
    public static President getInstance() {
        if (instance == null) {
            synchronized (President.class) {
                // To make sure that if I wait and someone creates I don't recreate
                if (instance == null) {
                    instance = new President();
                }
            }
        }
        return instance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        President president = (President) o;

        return name != null ? name.equals(president.name) : president.name == null;
    }

    public String getName() {
        return name;
    }

    synchronized void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "President{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
