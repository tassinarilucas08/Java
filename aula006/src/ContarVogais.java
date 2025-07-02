import java.util.Scanner;

public class ContarVogais {
    public static void MetodoContarVogais(){
        int numVogais = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma palavra e descubra quantas vogais tem");
        String palavra = scanner.nextLine();
        for(int i=0; i<palavra.length(); i++){
            char letra = palavra.charAt(i);
            char letraMaiuscula = Character.toUpperCase(letra);
            if (letraMaiuscula == 'A' || 
            letraMaiuscula == 'E' || 
            letraMaiuscula == 'I' || 
            letraMaiuscula == 'O' ||
            letraMaiuscula == 'U') {
                numVogais++;
            }
        }
        System.out.println("A palavra tem " + numVogais +" vogais");
        scanner.close();
    }
    public static void main(String[] args) {
        MetodoContarVogais();
    }
}
