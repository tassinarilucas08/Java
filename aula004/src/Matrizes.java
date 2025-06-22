import java.util.Scanner;

public class Matrizes {
    
    public static int[][] matrizMetodo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de linhas");
        int linhas = scanner.nextInt();
        System.out.println("Digite o número de colunas");
        int colunas = scanner.nextInt();
        int[][] matrix = new int[linhas][colunas];
        for(int i=0; i<linhas; i++){
            for(int z=0; z<colunas; z++){
            System.out.println("Digite o número para a posição [" + (i+1) + "][" + (z+1) + "]: ");
                matrix[i][z] = scanner.nextInt();
            }
        }
        scanner.close();
        return matrix;
    }
    public static void imprimirMatriz (int[][] matriz){
        System.out.println("\nMatriz Digitada:");
        for(int i = 0; i< matriz.length; i++){
            for(int j = 0; j< matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    int[][] resultado = matrizMetodo();
    imprimirMatriz(resultado);
    }
}
