package creational.factoryMethod.simple;

import java.util.List;

class ReportDocument extends ADocument {
    @Override
    public void createPages() {
        List<APage> pages = getPages();
        pages.add(new IntroductionPage());
        pages.add(new ResultsPage());
        pages.add(new ConclusionPage());
        pages.add(new SummaryPage());
        pages.add(new BibliographyPage());
    }
}
