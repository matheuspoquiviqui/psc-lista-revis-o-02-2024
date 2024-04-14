import java.util.Scanner;

public class Ativ13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o primeiro número: ");
        double maior = scanner.nextDouble();

        for (int i = 1; i < 3; i++) {        
            System.out.print("Escreva o " + (i + 1) + "º número: ");
            double numero = scanner.nextDouble();
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número é: " + maior);
        scanner.close();
    }
}
