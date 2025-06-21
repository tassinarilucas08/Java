import java.util.Scanner;

public class CalcularFatorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial");
        int number = scanner.nextInt();

        int contador = number;
        int resultado = 1;
        do{
            resultado *= contador;
            contador--;
        }while(contador > 0);
        scanner.close();
        System.out.println("O fatorial do número " + number + " é " + resultado);
    }
}