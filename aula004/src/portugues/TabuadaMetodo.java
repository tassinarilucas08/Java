import java.util.Scanner;

public class TabuadaMetodo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int number = scanner.nextInt();
        for(int i = 1; i<11; i++){
            System.out.println(number+"X"+i+ "=" + number*i);
        }
        scanner.close();
    }   
}
