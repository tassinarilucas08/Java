package portugues;
import java.util.Scanner;

public class primoIntervalos {
    public static void lePrimos (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int numberInicial = scanner.nextInt();
        System.out.println("Digite o segundo valor");
        int numberFinal = scanner.nextInt();
        for (int i = numberInicial; i <= numberFinal; i++) {
            boolean primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i + " é primo");
            }
        }
        scanner.close();
    }
    public static void main(String[] args) {
        lePrimos();
    }
}
