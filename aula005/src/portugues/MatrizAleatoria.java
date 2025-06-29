package portugues;
import java.util.Random;

public class MatrizAleatoria {
    public static int[][] montarMatriz(){
        int[][]matriz = new int [5][5];
        Random random = new Random();
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz [i][j] = random.nextInt(100);
            }}
            return matriz;
        }        
    
    public static void mostrarMatriz(int [][]matriz){
        System.out.println("MATRIZ");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz [i][j] +"\t");
            }            
            System.out.println();
        }
        System.out.println();
    }
    public static void maiorEhMenor(int[][]matriz){
        int menor = 100;
        int maior = 0;
        int linhaMaior = 0, colunaMaior = 0;
        int linhaMenor = 0, colunaMenor = 0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if (matriz [i][j] > maior) {
                    maior = matriz[i][j];  
                    linhaMaior = i;                
                    colunaMaior = j;
                }
                if (matriz [i][j] < menor) {
                    menor = matriz[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }            
        }
        System.out.println("O maior número é " + maior + " e está na posição [" + (colunaMaior+1) + "][" + (linhaMaior+1) + "]");
        System.out.println("O menor número é " + menor + " e está na posição [" + (colunaMenor+1) + "][" + (linhaMenor+1) + "]");
    }

    public static void main(String[] args) {
    int [][] matriz = montarMatriz();
    mostrarMatriz(matriz);
    maiorEhMenor(matriz);
 }
}

