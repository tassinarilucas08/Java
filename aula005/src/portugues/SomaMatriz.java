package portugues;
import java.util.Random;

public class SomaMatriz {
    public static int [][] montarMatriz(){
        Random random = new Random();
        int [][] matriz = new int [3][3];
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz [i][j] = random.nextInt(10);
            }
        }
        return matriz;
    }
    public static void mostrarMatriz(int [][] matriz){
        System.out.println("MATRIZ");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz [i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void calcularTotal(int [][] matriz){
        int total = 0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                total += matriz[i][j];
            }
        }
        System.out.println("O valor total é: " + total);
        System.out.println();
    }
       public static void calcularLinha(int [][] matriz){

        for(int i=0; i<matriz.length; i++){        
            int linha = 0;
            for(int j=0; j<matriz[i].length; j++){
                linha += matriz[i][j];
            }
            System.out.println("O valor da linha "+(i+1)+" é: "+linha);
        }
        System.out.println();
    }
    public static void calcularColuna(int [][] matriz){

        for(int i=0; i<matriz[0].length; i++){        
            int coluna = 0;
            for(int j=0; j<matriz[i].length; j++){
                coluna += matriz[j][i];
            }
            System.out.println("O valor da coluna "+(i+1)+" é: "+coluna);
        }
    }

    public static void main(String[] args) {
        int [][] matriz = montarMatriz();
        mostrarMatriz(matriz);
        calcularTotal(matriz);
        calcularLinha(matriz);
        calcularColuna(matriz);
    }
}