package portugues;
import java.util.Scanner;

public class Palindromo{
    public static void ehPalindromo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva a palavra para descobrirmos se é palindromo");
        String palavra = scanner.nextLine().toLowerCase();
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        boolean ehPalindromo = palavra.equals(palavraInvertida);
        if (ehPalindromo) {
            System.out.println("A palavra "+palavra+" é um palíndromo");
        }
        else{
            System.out.println("A palavra "+palavra+" não é um palíndromo. Essa palavra ao contrário fica "+palavraInvertida);
        }
        scanner.close();
    }
    public static void main(String[] args) {
        ehPalindromo();
    }
}