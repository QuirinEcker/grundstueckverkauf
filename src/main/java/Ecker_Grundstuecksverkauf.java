import java.util.Scanner;

public class Ecker_Grundstuecksverkauf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length;
        double width;
        double preis;
        double verkauferlös;
        double area;

        System.out.printf("Länge: ");
        length = scanner.nextDouble();
        System.out.printf("Breite: ");
        width = scanner.nextDouble();
        System.out.print("Preis pro m2: ");
        preis = scanner.nextDouble();

        area = length * width;
        verkauferlös = area * preis;

        System.out.printf("Der Verkaufserloes beträgt %f" , verkauferlös);




    }
}
