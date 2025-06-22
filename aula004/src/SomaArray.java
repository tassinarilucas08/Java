import java.util.Scanner;

public class SomaArray {
    public static void main(String[] args) {
        int numeros [] = new int[5];
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        scanner.close();
        System.out.println(soma);
    }
}
