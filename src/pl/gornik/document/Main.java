package pl.gornik.document;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dokument Enum:");
        Scanner scanner = new Scanner(System.in);
        List<Document> documentList = new ArrayList<>();
        documentList.add(new Document("Faktura na żelazko",1,DocumentType.INVOICE));
        documentList.add(new Document("Kontrakt zawodowy",3,DocumentType.CONTRACT));
        documentList.add(new Document("Akt zakupienia domu",5,DocumentType.NOTARIAL_ACT));
        documentList.add(new Document("Certyfikat ukończenia szkolenia",1,DocumentType.CERTYFICATE));

        for(Document Document: documentList) System.out.println(Document);
        System.out.println("------------------------------");
        System.out.println("Tworzenie Dokumentu: 1. Poprzez nazwę, 2. Poprzez ID 0. Wyjście");
        int dokument = scanner.nextInt();
        scanner.nextLine();
        switch(dokument) {

            case 1:
                System.out.println("Tworzenie Dokumentu poprzez nazwę:");
                System.out.println("Wprowadź nazwę dokumentu");
                String name = scanner.nextLine();
                System.out.println("Wprowadź ilość stron dokumentu");
                int pageAmount = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Podaj typ dokumentu (faktura,kontrakt,akt notarialny,certyfikat");
                String documentName = scanner.nextLine();
                DocumentType docType = getDocument(documentName);
                if (docType != null) {
                    documentList.add(new Document(name, pageAmount, docType));
                    System.out.println("Utworzono obiekt dokumentu poprzez nazwę");
                } else System.out.println("Wprowadziłeś wartość z poza ENUM");
                for (Document Document : documentList) System.out.println(Document);
                break;
            case 2:
                System.out.println("Tworzenie Dokumentu poprzez ID:");
                System.out.println("Wprowadź nazwę dokumentu");
                name = scanner.nextLine();
                System.out.println("Wprowadź ilość stron dokumentu");
                pageAmount = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Podaj typ dokumentu (1.faktura,2.kontrakt,3.akt notarialny,4.certyfikat");
                System.out.println("Wprowadź ID");
                int documentId = scanner.nextInt();
                DocumentType docID = getDocument(documentId);
                if (docID != null) {
                    documentList.add(new Document(name, pageAmount, docID));
                    System.out.println("Utworzono obiekt dokumentu poprzez ID");
                } else System.out.println("Wprowadziłeś wartość z poza ENUM");
                for (Document Document : documentList) System.out.println(Document);
                break;
            case 0:
                System.out.println("Koniec");
                break;
        }
    }

    public static DocumentType getDocument(String documentName){
        switch(documentName){
            case("faktura") ->{
                return DocumentType.INVOICE;
            }
            case("kontrakt") ->{
                return DocumentType.CONTRACT;
            }
            case("akt notarialny")->{
                return DocumentType.NOTARIAL_ACT;
            }
            case("certyfikat")->{
                return DocumentType.CERTYFICATE;
            }
            default -> {
                return null;
            }
        }
    }
    public static DocumentType getDocument(int documentID){
        switch(documentID){
            case(1) ->{
                return DocumentType.INVOICE;
            }
            case(2) ->{
                return DocumentType.CONTRACT;
            }
            case(3)->{
                return DocumentType.NOTARIAL_ACT;
            }
            case(4)->{
                return DocumentType.CERTYFICATE;
            }
            default -> {
                return null;
            }
        }
    }

}
