import java.util.ArrayList;
import java.util.Scanner;

public class SistemaUsuarios {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    public void cadastrarUsuario(Scanner scanner){
        Usuario usuario = Usuario.fazerCadastro(scanner);
        usuarios.add(usuario);
    } 
    public void listarUsuarios(){
        if(usuarios.isEmpty()){
            System.out.println("Nenhum usuário cadastrado!");
        }else{
            System.out.println("\n--- Lista de Usuários ---");
            for(Usuario u:usuarios){
            System.out.println("ID: "+ u.getId() + " | Nome: "+ u.getName() +" "+u.getLastName()+" | Email: "+u.getEmail());
            }
        }        
    }
    public void excluirUsuario(Scanner scanner){
        System.out.println("Qual usuário deseja excluir? ");
        int idUser = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i<usuarios.size(); i++){
            if(usuarios.get(i).getId() == idUser){
                Usuario removido = usuarios.remove(i);
                System.out.println("O usuário "+ removido.getName() +" "+ removido.getLastName() + " foi removido com sucesso");
            }
        }
    }
    public Usuario validarLogin(Scanner scanner){
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
                    u.setIsLogged(true);
                    return u;
                }
                else{
                    System.out.println("Eita! Senha errada :(");
                    return null;
                }
            }
            else{
                System.out.println("Ixi! não tem ninguém cadastrado com esse email :(");
                return null;
            }
        }
        return null;
    }
}