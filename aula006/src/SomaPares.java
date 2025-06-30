import java.util.Scanner;

public class SomaPares {
    public static void CalcularPares(){
        int somaPares = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga um número e descubra a soma dos pares até ele");
        int number = scanner.nextInt();
        for(int i=0; i<number; i++){
            if(i % 2 == 0){
                somaPares += i;
            }
        }
        scanner.close();
        System.out.println("A soma dos valores pares até "+number+ " é: "+somaPares);
    }
    public static void main(String[] args) {
        CalcularPares();
    }
}
