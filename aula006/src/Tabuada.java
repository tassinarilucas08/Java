import java.util.Scanner;

public class Tabuada {
    public static void MontarTabuada(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para descobrir sua tabuada do 1 ao 10");
        int numberEscolhido = scanner.nextInt();
        for(int i=1; i<=10; i++){
            int calculo = numberEscolhido * i;
            System.out.println(numberEscolhido+"X"+i + " = "+calculo);
        }
        scanner.close();
    }
    public static void main(String[] args) {
        MontarTabuada();
    }
}