import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        
        Locale localizacao = Locale.getDefault();

        String linguagem = localizacao.getLanguage();
        String nomeLinguagem = localizacao.getDisplayLanguage();
        String pais = localizacao.getCountry();
        String nomePais = localizacao.getDisplayCountry();

        System.out.println("O sistema está na linguagem "+linguagem+"/"+nomeLinguagem +" que é a linguagem do país "+pais+"/"+nomePais);
    }
}
