package structural.composite;

abstract class AFileSystemComponent {
    abstract protected void ls(StringBuffer stringBuffer);

    abstract void ls();
}
