package behavioral.templateMethod;

abstract class TemplateMethod {
    final void perform() {
        this.begin();
        this.between();
        this.end();
    }

    public abstract void begin();

    public abstract void between();

    public abstract void end();
}