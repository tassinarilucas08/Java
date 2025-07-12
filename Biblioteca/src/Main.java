import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem vindo! Vamos fazer o seu cadastro!");
        Cliente cliente = new Cliente();
        cliente.fazerCadastro();
    }
}
