package english;
import java.awt.Toolkit;
import java.awt.Dimension;

public class SystemResolution {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();        
        Dimension screenSize = toolkit.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        System.out.println("The system is "+width+ "x"+height);
    }
}