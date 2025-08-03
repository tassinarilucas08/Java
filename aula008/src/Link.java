import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Link {

    public static void main(String[] args) throws IOException {
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String valor = br.readLine();

    System.out.println(Integer.parseInt(valor) * 4);

 }
}