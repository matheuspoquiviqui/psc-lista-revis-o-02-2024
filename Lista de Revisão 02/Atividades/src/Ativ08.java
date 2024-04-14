import java.util.Scanner;

public class Ativ08 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        char decisao = 0;

        do {
            
            System.out.print("Escreva um número inteiro: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0 ) {
                System.out.println("O número informado é par");
            } else {
                System.out.println("O número informado é ímpar");
            }
                System.out.println("Aperte 's' para sair ou 'c' para continuar");
                decisao = scanner.next().charAt(0);
        } while (decisao != 's');
            System.out.println("Programa encerrado!");

        scanner.close();
    }
}
