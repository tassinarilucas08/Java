import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaUsuarios sistemaUsuarios = new SistemaUsuarios();
        Biblioteca biblioteca = new Biblioteca();
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("[1] Cadastrar usuário");
            System.out.println("[2] Fazer login");
            System.out.println("[3] Sair");
            System.out.println("[4] Listar os usuários");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    sistemaUsuarios.cadastrarUsuario(scanner);
                    break;
                case 2:
                    sistemaUsuarios.validarLogin(scanner);
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                case 4:
                    sistemaUsuarios.listarUsuarios();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}