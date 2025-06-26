public class MediaNotas {
    public static String mediaAluno(double[] numbers){
        String situacaoAluno = "";
        double soma = 0;
        for(int i = 0; i<numbers.length; i++){
            soma += numbers[i];
        }
        double result = soma/numbers.length;

        if(result < 6 ){
            situacaoAluno = "reprovado";
        }
        else{
            situacaoAluno = "aprovado";
        }
        String msg = "A média do aluno foi: "+result+", portanto ele está: "+situacaoAluno;
        return msg;
    }
    public static void main(String[] args) {
        System.out.println(mediaAluno(new double[]{9, 4, 3, 7}));
    }
}