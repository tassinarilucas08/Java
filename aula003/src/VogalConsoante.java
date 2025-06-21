import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letra = scanner.nextLine();
        String letraPadrao = letra.toUpperCase();
        if(letraPadrao.equals("A") || 
        letraPadrao.equals("E") || 
        letraPadrao.equals("I") || 
        letraPadrao.equals("O") || 
        letraPadrao.equals("U")){
            System.out.println("A letra "+letraPadrao+" é uma vogal");
        }
        else{
        System.out.println("A letra "+letraPadrao+" é uma consoante");
        }
    scanner.close();
    }
}
