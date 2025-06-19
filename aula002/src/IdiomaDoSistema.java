import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        
        Locale local = Locale.getDefault();

        String linguagem = local.getLanguage();
        String nomeLinguagem = local.getDisplayLanguage();
        String pais = local.getCountry();
        String nomePais = local.getDisplayCountry();

        System.out.println("O sistema está na linguagem "+linguagem+"/"+nomeLinguagem +" que é a linguagem do país "+pais+"/"+nomePais);
    }
}
