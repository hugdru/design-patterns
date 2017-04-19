package structural.bridge;

abstract class Webpage {

    private ITheme theme;

    Webpage(ITheme theme) {
        this.theme = theme;
    }

    String getContent() {
        return this.getClass().getName() + " content is using the " + this.theme.getColor() + " theme";
    }

    void setTheme(ITheme theme) {
        this.theme = theme;
    }

}
