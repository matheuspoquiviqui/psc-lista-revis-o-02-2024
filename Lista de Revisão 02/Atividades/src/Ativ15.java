import java.util.Scanner;

public class Ativ15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = scanner.nextDouble();

        double imposto;

        if (salario <= 1903.98) {
            imposto = 0;
        } else if (salario <= 2826.65) {
            imposto = salario * 0.075 - 142.80;
        } else if (salario <= 3751.05) {
            imposto = salario * 0.15 - 354.80;
        } else if (salario <= 4664.68) {
            imposto = salario * 0.225 - 636.13;
        } else {
            imposto = salario * 0.275 - 869.36;
        }

        System.out.println("Você deve pagar R$" + imposto + "de imposto.");

        scanner.close();
    }
}

