import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tea {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalGetsRight = 0;

        String correctAnswer = br.readLine();
        
        String linha = br.readLine();
        
        String[] numbers = linha.split(" ");

        for(int i = 0; i< numbers.length; i++){
            if(Integer.parseInt(numbers[i]) == Integer.parseInt(correctAnswer)){
                totalGetsRight++;
            }
        }
        System.out.println(totalGetsRight);
    }       
}