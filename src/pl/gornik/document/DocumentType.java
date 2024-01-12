package pl.gornik.document;

public enum DocumentType {
    INVOICE("faktura",1),
    CONTRACT("kontrakt",2),
    NOTARIAL_ACT("akt notarialny",3),
    CERTYFICATE("certyfikat",4);

    private String document;
    private int id;

    DocumentType(String document, int id) {
        this.document = document;
        this.id = id;
    }
}
