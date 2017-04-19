package creational.factoryMethod.simple;

import java.util.LinkedList;
import java.util.List;

abstract class ADocument {
    private List<APage> pages = new LinkedList<>();

    public ADocument() {
        this.createPages();
    }

    public List<APage> getPages() {
        return pages;
    }

    // Factory Method
    public abstract void createPages();
}
