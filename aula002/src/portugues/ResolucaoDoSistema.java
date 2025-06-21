package portugues;
import java.awt.Toolkit;
import java.awt.Dimension;

public class ResolucaoDoSistema {
    public static void main(String[] args) {
        Toolkit kitDeFerramentas = Toolkit.getDefaultToolkit();        
        Dimension tamanhoDaTela = kitDeFerramentas.getScreenSize();
        int largura = tamanhoDaTela.width;
        int altura = tamanhoDaTela.height;

        System.out.println("O sistema está em "+largura+"x"+altura);
    }
}