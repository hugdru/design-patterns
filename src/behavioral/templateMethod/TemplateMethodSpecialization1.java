package behavioral.templateMethod;

class TemplateMethodSpecialization1 extends TemplateMethod {
    @Override
    public void begin() {
        System.out.println("The begin of Specialization 1");
    }

    @Override
    public void between() {
        System.out.println("The between of Specialization 1");
    }

    @Override
    public void end() {
        System.out.println("The end of Specialization 1");
    }
}
