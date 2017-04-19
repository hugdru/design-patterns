package behavioral.templateMethod;

class Main {
    public static void main(String[] args) {
        TemplateMethodSpecialization1 tms1 = new TemplateMethodSpecialization1();
        tms1.perform();

        System.out.println();

        TemplateMethodSpecialization2 tms2 = new TemplateMethodSpecialization2();
        tms2.perform();
    }
}
