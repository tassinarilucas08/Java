import java.util.Scanner;

public class SomaMatriz {

    public static int[][] montaMatriz(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de linhas");
        int linhas = scanner.nextInt();
        System.out.println("Digite o número de colunas");
        int colunas = scanner.nextInt();
        int [][] matrix = new int [linhas][colunas];
        for(int i=0; i<linhas; i++){
            for(int z=0; z<colunas; z++){
             System.out.println("Digite o número para a posição [" + (i+1) + "][" + (z+1) + "]: ");
             matrix[i][z] = scanner.nextInt();
            }
        }        
        scanner.close();
        return matrix;
     }
    }

