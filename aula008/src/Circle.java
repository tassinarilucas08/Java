import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
    public static void main(String[] args) throws IOException{
        double n = 3.14159;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value = br.readLine();

        double raio = Double.parseDouble(value);
        double area = Math.pow(raio, 2) * n;

        System.out.printf("A=%.4f\n", area);
    }    
}
