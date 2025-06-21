import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número");
        int num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println("O número " +num1+ " é maior que o número " +num2);
        }
        else if(num1==num2){
            System.out.println("Os dois números são iguais. O número é "+num1);
        }
        else{
            System.out.println("O número "+num2+ " é maior que o número " +num1);
        }
        scanner.close();
    }
}
