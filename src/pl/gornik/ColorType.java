package pl.gornik;

public enum ColorType {
    RED("czerwony",1),
    BLUE("niebieski",2),
    YELLOW("żółty",3),
    GREEN("zielony",4),
    BLACK("czarny",5),
    WHITE("biały",6);

    private String color;
    private int id;

    ColorType(String color, int id) {
        this.color = color;
        this.id = id;
    }

    public String getColor() {
        return color;
    }
}
