package structural.composite;

class Main {
    public static void main(String[] args) {
        DirectoryComposite root = new DirectoryComposite("/");

        DirectoryComposite usr = new DirectoryComposite("usr");
        root.add(usr);

        DirectoryComposite boot = new DirectoryComposite("boot");
        root.add(boot);

        DirectoryComposite etc = new DirectoryComposite("etc");
        root.add(etc);

        DirectoryComposite bin = new DirectoryComposite("bin");
        usr.add(bin);

        DirectoryComposite include = new DirectoryComposite("include");
        usr.add(include);

        bin.add(new FileLeaf("javac"));
        bin.add(new FileLeaf("java"));

        boot.add(new FileLeaf("initramfs-linux.img"));
        boot.add(new FileLeaf("vmlinuz-linux"));
        boot.add(new FileLeaf("intel-ucode.img"));

        etc.add(new FileLeaf("locale.conf"));
        etc.add(new FileLeaf("fstab"));
        etc.add(new FileLeaf("resolv.conf"));

        root.ls();
    }
}
