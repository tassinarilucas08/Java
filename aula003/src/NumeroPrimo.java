import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um número e descubra se é primo");
        int nEscolhido = scanner.nextInt();
        boolean nEPrimo = true;

        for(int i=2; i < nEscolhido; i++){
            if(nEscolhido % i == 0){
                nEPrimo = false;
            }
        }
        if(nEPrimo == false){
            System.out.println("O número não é primo");
        }
        else{
            System.out.println("O número é primo");
        }
        scanner.close();
    }
}
