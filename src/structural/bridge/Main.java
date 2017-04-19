package structural.bridge;

class Main {
    public static void main(String[] args) {
        ITheme darkTheme = new DarkTheme();
        ITheme lightTheme = new LightTheme();

        Webpage about = new About(darkTheme);
        Webpage home = new Home(lightTheme);

        about.setTheme(darkTheme);
        System.out.println(about.getContent());

        home.setTheme(lightTheme);
        System.out.println(home.getContent());

        about.setTheme(lightTheme);
        System.out.println(about.getContent());

        home.setTheme(darkTheme);
        System.out.println(home.getContent());
    }
}