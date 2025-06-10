import java.util.Locale;
import java.util.Scanner;

public class LancamentoDeDardo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as tres distancias:");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double d3 = scanner.nextDouble();

        double maiorDistancia;

        if (d1 >= d2 && d1 >= d3) {
            maiorDistancia = d1;
        }

        else if (d2 >= d1 && d2 >= d3) {
            maiorDistancia = d2;
        }

        else {
            maiorDistancia = d3;
        }

        System.out.printf("MAIOR DISTANCIA = %.2f%n", maiorDistancia);

        scanner.close();
    }
}