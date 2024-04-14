import java.util.Scanner;

public class Ativ12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
        
        scanner.close();
    }
    
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove espaços e caracteres especiais, e converte para minúsculas
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
        scanner.close();
    }
}