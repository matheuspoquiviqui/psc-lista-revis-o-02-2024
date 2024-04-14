import java.util.Scanner;
public class Ativ14 {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    double media, soma = 0;
        System.out.println("Escreva 03 notas para saber sua média e saber se foi aprovado ou não.");
        System.out.println("Caso sua nota for maior que 60 = Aluno Aprovado.");

        double[] notas = new double[3];

        for (int i = 0; i < notas.length; i++) {
            
            System.out.print("Escreva a " + (i + 1) + "° nota: ");
            notas [i] = scanner.nextDouble();
            soma += notas[i];
        }

         media = soma / notas.length;   
         System.out.println("\nSua média foi: " + media); 

         if (media >= 60.0) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else {
            System.out.println("Infelizmente, você foi reprovado.");
        }
        scanner.close();
    }
}

