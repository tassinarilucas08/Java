public class Mainn {
    public static void main(String[] args) {
        Usuario novoUsuario = Usuario.fazerCadastro();
        System.out.println("\nID Gerado: "+novoUsuario.getId());
        System.out.println("Email: "+novoUsuario.getEmail());
    }
}
