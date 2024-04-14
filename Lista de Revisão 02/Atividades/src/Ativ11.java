import java.util.Scanner;
import java.util.Random;
public class Ativ11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        System.out.println("Bem-vindo ao jogo de Pedra, Papel e Tesoura!");

        while (true) {
            System.out.print("\nEscolha sua (jogada Pedra, Papel, Tesoura ou Sair): ");
            String jogadaJogador = scanner.nextLine();

            if (jogadaJogador.equalsIgnoreCase("sair")) {
                System.out.println("Programa Encerrado!");
                break;
            }

            if (!jogadaJogador.equalsIgnoreCase("pedra") &&
                !jogadaJogador.equalsIgnoreCase("papel") &&
                !jogadaJogador.equalsIgnoreCase("tesoura")) {
                System.out.println("Jogada inválida! Tente novamente.");
                continue;
            }

            int aleatorioJogadaComputador = random.nextInt(3);
            String jogadaComputador = opcoes[aleatorioJogadaComputador];

            System.out.println("Você jogou: " + jogadaJogador);
            System.out.println("O computador jogou: " + jogadaComputador);

            if (jogadaJogador.equalsIgnoreCase(jogadaComputador)) {
                System.out.println("Empate!");
            } else if ((jogadaJogador.equalsIgnoreCase("pedra") && jogadaComputador.equalsIgnoreCase("tesoura")) ||
                       (jogadaJogador.equalsIgnoreCase("papel") && jogadaComputador.equalsIgnoreCase("pedra")) ||
                       (jogadaJogador.equalsIgnoreCase("tesoura") && jogadaComputador.equalsIgnoreCase("papel"))) {
                System.out.println("Você venceu!");
            } else {
                System.out.println("Você perdeu!");
            }
        }

        scanner.close();
    }
}