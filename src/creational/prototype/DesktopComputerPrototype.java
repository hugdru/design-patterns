package creational.prototype;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

class DesktopComputerPrototype implements IComputerPrototype {

    private static final String type = "desktop";

    private String model;
    private String[] components;
    private String buildDate;

    public DesktopComputerPrototype(String model, String[] components) throws InterruptedException {
        this.model = model;
        this.components = components.clone();
        buildDesktop();
    }

    private DesktopComputerPrototype(String model, String[] components, String buildDate) {
        this.model = model;
        this.components = components.clone();
        this.buildDate = buildDate;
    }

    private void buildDesktop() throws InterruptedException {
        System.out.println("Building desktop...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("The " + model + " desktop has been built with the following components:");
        for (String component : components) {
            System.out.println(component);
        }
        SimpleDateFormat dateFormatGmt = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
        dateFormatGmt.setTimeZone(TimeZone.getTimeZone("GMT"));
        buildDate = dateFormatGmt.format(new Date());
    }

    @Override
    public String toString() {
        return "Desktop " + this.model + " at " + buildDate;
    }

    @Override
    public IComputerPrototype copy() {
        return new DesktopComputerPrototype(model, components, buildDate);
    }

    @Override
    public String getType() {
        return DesktopComputerPrototype.type;
    }

    @Override
    public String getModel() {
        return this.model;
    }
}
