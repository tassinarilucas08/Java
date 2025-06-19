import java.awt.Toolkit;
import java.awt.Dimension;

public class ResolucaoDoSistema {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();        
        Dimension screenSize = toolkit.getScreenSize();
        int largura = screenSize.width;
        int altura = screenSize.height;

        System.out.println("O sistema tem "+largura+" de largura e "+altura+ " de altura");
    }
}