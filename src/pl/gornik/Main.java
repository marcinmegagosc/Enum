package pl.gornik;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enum:");
        Scanner scanner = new Scanner(System.in);
        List<Shape>shapes = new ArrayList<>();
        shapes.add(new Shape("Kwadrat",'M',ColorType.BLUE));
        shapes.add(new Shape("Koło",'M',ColorType.GREEN));
        shapes.add(new Shape("Trójkąt",'M',ColorType.YELLOW));
        shapes.add(new Shape("Romb",'M',ColorType.RED));

     for(Shape shape : shapes) System.out.println(shape);
        System.out.println("Wprowadź nazwę, rozmiar('S','M','L') oraz kolor");
        String name = scanner.nextLine();
        System.out.println("Wprowadź rozmiar");
        char size = scanner.nextLine().charAt(0);
        System.out.println("Wprowadź kolor");
        String colorName = scanner.nextLine();

        ColorType color = getColor(colorName);
        if(color != null){
            shapes.add(new Shape(name,size,color));
            System.out.println("Utworzony obiekt");

        }else System.out.println("Wprowadziłeś wartość z poza ENUM");

    }

    public static ColorType getColor(String colorName){
        switch(colorName){
            case "czerwony" -> {
                return ColorType.RED;
            }
            case "niebieski" ->{
                return ColorType.BLUE;
            }
            case "żółty"->{
                return ColorType.YELLOW;
            }
            case "zielony" ->{
                return ColorType.GREEN;
            }
            case "czarny" ->{
                return ColorType.BLACK;
            }
            case "biały" ->{
                return ColorType.WHITE;
            }
            default -> {
                return null;
            }
        }

    }

}