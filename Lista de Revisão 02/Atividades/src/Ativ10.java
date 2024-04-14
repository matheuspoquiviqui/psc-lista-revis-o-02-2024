import java.util.Scanner;
public class Ativ10 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Saiba o valor do seu desconto:");

        System.out.print("Informe o valor do produto: R$ ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Informe a porcentagem de desconto (%): ");
        double valorDesconto = scanner.nextDouble();

        double totaldesconto = valorProduto * (valorDesconto / 100);

        double valorTotal = valorProduto - totaldesconto;

        System.out.println("Valor do deconto: R$ " + totaldesconto);
        System.out.println("Valor total a pagar: R$ " + valorTotal);
    
        scanner.close();
    }
}