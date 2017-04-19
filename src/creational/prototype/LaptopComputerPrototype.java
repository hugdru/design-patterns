package creational.prototype;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

class LaptopComputerPrototype implements IComputerPrototype {

    private static final String type = "laptop";

    private String model;
    private String[] components;
    private String buildDate;

    public LaptopComputerPrototype(String model, String[] components) throws InterruptedException {
        this.model = model;
        this.components = components.clone();
        buildLaptop();
    }

    private LaptopComputerPrototype(String model, String[] components, String buildDate) {
        this.model = model;
        this.components = components.clone();
        this.buildDate = buildDate;
    }

    private void buildLaptop() throws InterruptedException {
        System.out.println("Building laptop...");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("The " + model + " laptop has been built with the following components:");
        for (String component : components) {
            System.out.println(component);
        }
        SimpleDateFormat dateFormatGmt = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
        dateFormatGmt.setTimeZone(TimeZone.getTimeZone("GMT"));
        buildDate = dateFormatGmt.format(new Date());
    }

    @Override
    public String toString() {
        return "Laptop " + this.model + " at " + buildDate;
    }

    @Override
    public IComputerPrototype copy() {
        return new LaptopComputerPrototype(model, components, buildDate);
    }

    @Override
    public String getType() {
        return LaptopComputerPrototype.type;
    }

    @Override
    public String getModel() {
        return this.model;
    }
}
