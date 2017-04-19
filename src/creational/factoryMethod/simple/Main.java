package creational.factoryMethod.simple;

class Main {
    public static void main(String[] args) {
        ADocument[] documentCreators = new ADocument[]{new ResumeDocument(), new ReportDocument()};

        for (ADocument documentCreator : documentCreators) {
            System.out.println("\nDocument creator: " + documentCreator.getClass().getSimpleName());
            for (APage page : documentCreator.getPages()) {
                System.out.println("Page: " + page.getClass().getSimpleName());
            }
        }
    }
}
