import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade");
        int idade = scanner.nextInt();
        //Vamos considerar 1 e 110 como menor e maior valor respectivamente
        if(idade >= 1 && idade <= 110){
            if(idade<=12){
                System.out.println("É a idade de uma criança");
            }
            else if(idade<=17){
                System.out.println("É a idade de em adolescente");
            }
            else if(idade<=59){
                System.out.println("É a idade de um adulto");
            }
            else{
                System.out.println("É a idade de um idoso");
            }
        }
        else{
            System.out.println("Extrapolou o limite de idade");
        }
        scanner.close();
    }
}
