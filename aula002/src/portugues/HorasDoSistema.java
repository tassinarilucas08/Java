package portugues;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class HorasDoSistema{
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é: " + relogio.toString());
        //O código acima apresenta a data e a hora em um formato desorganizado

        LocalTime agora = LocalTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = agora.format(formato);
        System.out.println("A hora agora é: " + horaFormatada);    
        //O codigo acima apresenta a hora em um formato mais organizado
    }
}