import java.util.ArrayList;
import java.util.Scanner;

public class SistemaUsuarios {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    public void cadastrarUsuario(){
        Usuario usuario = Usuario.fazerCadastro();
        usuarios.add(usuario);
    } 
    public boolean validarLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos fazer o login!");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Digite o email :\n");
        String email = scanner.nextLine();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        for (Usuario u : usuarios){
            if(email.equals(u.getEmail())){
                if(senha.equals(u.getSenha())){
                    System.out.println("Seja bem vindo de volta "+ u.getName() + " " + u.getLastName() +"! :)");
                }
                else{
                    System.out.println("Eita! Senha errada :(");
                }
            }
            else{
                System.out.println("Ixi! não tem ninguém cadastrado com esse email :(");
            }
        }
    }
}
