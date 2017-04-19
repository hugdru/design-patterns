package creational.factoryMethod.simple;

import java.util.List;

class ResumeDocument extends ADocument {
    @Override
    public void createPages() {
        List<APage> pages = getPages();
        pages.add(new SkillsPage());
        pages.add(new EducationPage());
        pages.add(new ExperiencePage());
    }
}
