import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Sum {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        String num2 = br.readLine();

        System.out.println("X = " + (Integer.parseInt(num1) + Integer.parseInt(num2)));
    }
}
