import java.util.Scanner;

public class ImparParNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("O número é par");
        }
        else{
            System.out.println("O número é impar");
        }
        scanner.close();
    }
}
