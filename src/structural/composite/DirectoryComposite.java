package structural.composite;

import java.util.ArrayList;

class DirectoryComposite extends AFileSystemComponent {

    private static final String SPACING = "   ";
    private static final int SPACE_LENGTH = SPACING.length();

    private String name;
    private ArrayList<AFileSystemComponent> components = new ArrayList<>();

    public DirectoryComposite(String name) {
        this.name = name;
    }

    @Override
    protected void ls(StringBuffer stringBuffer) {
        System.out.println(stringBuffer + this.name);
        stringBuffer.append(DirectoryComposite.SPACING);
        for (AFileSystemComponent component : components) {
            component.ls(stringBuffer);
        }
        stringBuffer.setLength(stringBuffer.length() - DirectoryComposite.SPACE_LENGTH);
    }

    @Override
    public void ls() {
        ls(new StringBuffer());
    }

    public void add(AFileSystemComponent component) {
        components.add(component);
    }
}
