import java.util.Scanner;

public class Ativ09 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int idade;
        System.out.print("Escreva sua idade: ");
        idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Parabéns, você é maior de idade!");
            
        } else {
            System.out.println("Que pena, você ainda é menor de idade!");
        }
        scanner.close();
    }
}
