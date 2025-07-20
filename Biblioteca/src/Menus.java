import java.util.Scanner;

public class Menus {
    
    static SistemaUsuarios sistemaUsuarios = new SistemaUsuarios();
    static Biblioteca biblioteca = new Biblioteca();
    static Usuario usuarioLogado = null;
        
        public static void menuPrincipal(Scanner scanner){
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("[1] Cadastrar usuário");
            System.out.println("[2] Fazer login");
            System.out.println("[3] Menu da Biblioteca");
            System.out.println("[4] Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    executarCadastroUsuario(scanner);
                    menuPrincipal(scanner);
                    break;
                case 2:
                    executarLogin(scanner);
                    menuPrincipal(scanner);
                    break;
                case 3:
                    if(usuarioLogado != null && usuarioLogado.getIsLogged()){
                        if(usuarioLogado.getIdType() == 1){
                            menuBibliotecaCliente(scanner);
                            break;
                        }
                        else if(usuarioLogado.getIdType() == 2){
                            menuBibliotecaEscritor(scanner);
                            break;
                        }
                        else{
                            menuBibliotecaAdm(scanner);
                            break;
                        }
                    }
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
}

        public static void menuBibliotecaCliente(Scanner scanner){
        int opcao = 0;

        while (opcao !=3) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("[1] Alugar Livro");
            System.out.println("[2] Comprar Livro");
            System.out.println("[3] Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    biblioteca.alugarLivro(scanner);
                    menuPrincipal(scanner);
                    break;
                case 2:
                    biblioteca.comprarLivro(scanner, usuarioLogado);
                    menuPrincipal(scanner);
                    break;
                case 3:
                    menuPrincipal(scanner);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
}
    
        public static void menuBibliotecaEscritor(Scanner scanner){
        int opcao = 0;

        while (opcao !=2) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("[1] Adicionar Livro");
            System.out.println("[2] Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    biblioteca.cadastrarLivro(scanner);
                    menuPrincipal(scanner);
                    break;
                case 2:
                    menuPrincipal(scanner);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
}

public static void menuBibliotecaAdm(Scanner scanner){
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("[1] Adicionar usuário");
            System.out.println("[2] Excluir usuário");
            System.out.println("[3] Adicionar livro");
            System.out.println("[4] Excluir livro");
            System.out.println("[5] Voltar para o menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    executarCadastroUsuario(scanner);
                    menuBibliotecaAdm(scanner);
                    break;
                case 2:
                    sistemaUsuarios.excluirUsuario(scanner);
                    menuBibliotecaAdm(scanner);
                    break;
                 case 3:
                    biblioteca.cadastrarLivro(scanner);
                    menuBibliotecaAdm(scanner);
                    break;
                case 4:
                    biblioteca.excluirLivro(scanner);
                    menuBibliotecaAdm(scanner);
                    break;
                case 5:
                    menuPrincipal(scanner);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }    
    
    public static void executarCadastroUsuario(Scanner scanner) {
        sistemaUsuarios.cadastrarUsuario(scanner);
    }
    
    public static void executarLogin(Scanner scanner) {
        Usuario logado = sistemaUsuarios.validarLogin(scanner);
        if (logado != null) {
            usuarioLogado = logado;
        }
    }
}