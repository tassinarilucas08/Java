package english;
import java.util.Locale;

public class SystemLanguage {
    public static void main(String[] args) {
        
        Locale locale = Locale.getDefault();

        String language = locale.getLanguage();
        String languageName = locale.getDisplayLanguage();
        String country = locale.getCountry();
        String countryName = locale.getDisplayCountry();

        System.out.println("The system language is "+language+"/"+languageName+". This language is of "+country+"/"+countryName);
    }
}
