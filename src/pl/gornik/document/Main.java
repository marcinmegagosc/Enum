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
        documentList.add(new Document("Akt notarialny",5,DocumentType.NOTARIAL_ACT));
        documentList.add(new Document("Certyfikat ukończenia szkolenia",1,DocumentType.CERTYFICATE));

        for(Document Document: documentList) System.out.println(Document);
        System.out.println("------------------------------");
        System.out.println("Tworzenie Dokumentu:");
        System.out.println("Wprowadź nazwę dokumentu");
        String name = scanner.nextLine();
        System.out.println("Wprowadź ilość stron dokumentu");
        int pageAmount = scanner.nextInt();
        System.out.println("Podaj typ dokumentu ");
    }
}
