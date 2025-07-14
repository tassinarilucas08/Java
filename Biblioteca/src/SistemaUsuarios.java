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
        
    }
}
