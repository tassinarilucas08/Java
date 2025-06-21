public class ResultadoSoma {
    
    int soma;
    
    public static void main(String[] args) {
        ResultadoSoma minhaSoma = new ResultadoSoma();
        for (int i=1; i<3; i++){
            double num = Math.random()*100;
            System.out.println("Este é o número " +i+ " em formato double gerado aleatoriamente: " + num + "\n");
            int numArredondado = (int)Math.round(num);
            System.out.println("Este é o número " +i+ " arredondado para o mais próximo dele: "+numArredondado+"\n");
            minhaSoma.soma += numArredondado;
        }
        System.out.println("Essa é a soma dos dois números arredondados: " + minhaSoma.soma+"\n");
    }
}
