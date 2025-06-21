public class MediaNumeros {
        
    double soma;
    int nNumbers;
    double media;
    
    public static void main(String[] args) {
        MediaNumeros valorObjeto = new MediaNumeros();
        for (int i=1; i<=3; i++){
            double num = Math.random()*100;
            System.out.println("Este é o número " +i+ " em formato double gerado aleatoriamente: " + num + "\n");
            double numArredondado = Math.round(num * 100) / 100.0;
            System.out.println("Este é o número " +i+ " arredondado para o mais próximo dele: "+numArredondado+"\n");
            valorObjeto.soma += numArredondado;
            valorObjeto.nNumbers++;
        }
        double media = valorObjeto.soma / valorObjeto.nNumbers;
        double mediaArredondado = Math.round(media * 100) / 100.0;
        System.out.println("Essa é a soma dos valores: " + valorObjeto.soma);
        System.out.println("Essa é a média da soma dos valores " + mediaArredondado +"\n");
    }
}
