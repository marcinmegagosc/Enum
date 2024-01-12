package pl.gornik.document;

public enum DocumentType {
    INVOICE("faktura"),
    CONTRACT("kontrakt"),
    NOTARIAL_ACT("akt notarialny"),
    CERTYFICATE("certyfikat");

    private String document;

    DocumentType(String document) {
        this.document = document;
    }
}
