package structural.composite;

class FileLeaf extends AFileSystemComponent {

    private String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    protected void ls(StringBuffer stringBuffer) {
        System.out.println(stringBuffer + this.name);
    }

    @Override
    public void ls() {
        ls(new StringBuffer());
    }
}
