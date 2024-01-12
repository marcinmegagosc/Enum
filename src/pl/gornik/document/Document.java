package pl.gornik.document;

public class Document {
    private String Name;
    private int pageAmount;
    private DocumentType type;

    public Document(String name, int pageAmount, DocumentType type) {
        Name = name;
        this.pageAmount = pageAmount;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Document{" +
                "Name='" + Name + '\'' +
                ", pageAmount=" + pageAmount +
                ", type=" + type +
                '}';
    }
}
