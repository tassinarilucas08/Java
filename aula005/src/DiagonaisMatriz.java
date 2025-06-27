import java.util.Random;

public class DiagonaisMatriz {
    public static int [][] montarMatriz(){
        Random random = new Random();
        int [][] matriz = new int[4][4];
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                matriz [i][j] = random.nextInt(10);
            }
        }
        return matriz;
    }
    public static void mostrarMatriz(int [][] matriz){
        System.out.println("MATRIZ");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void mostrarPrincipal(int [][] matriz){
        int soma = 0;
        System.out.println("DIAGONAL PRINCIPAL");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(i == j){
                    System.out.print(matriz[i][j] + "\t");
                    soma += matriz[i][j];
                }
                else{
                    System.out.print(" " + "\t");
                }
            }        
            System.out.println();
        }
        System.out.println("Soma da Diagonal Principal: "+soma );
    }    
    public static void mostrarSecundaria(int [][] matriz){
        int soma = 0;
        System.out.println("DIAGONAL SECUNDÁRIA");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(i+j == 3){
                    System.out.print(matriz[i][j] + "\t");
                    soma += matriz[i][j];
                }
                else{
                    System.out.print(" " + "\t");
                }
            }        
            System.out.println();
        }
        System.out.print("Soma da Diagonal Secundária: "+soma);
    }

    public static void main(String[] args) {
        int [][] matriz = montarMatriz();
        mostrarMatriz(matriz);
        mostrarPrincipal(matriz);
        mostrarSecundaria(matriz);
    }
}
