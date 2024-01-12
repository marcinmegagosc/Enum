package pl.gornik;

public enum ColorType {
    RED("czerwony"),
    BLUE("niebieski"),
    YELLOW("żółty"),
    GREEN("zielony"),
    BLACK("czarny"),
    WHITE("biały");

    private String color;

    ColorType(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
