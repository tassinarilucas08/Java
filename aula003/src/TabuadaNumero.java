import java.util.Scanner;

public class TabuadaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um número pra nós fazermos a tabuada dele");
        int numero = scanner.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(numero+"X"+i+" é igual a: " + numero*i);
        }
        scanner.close();
    }
}
