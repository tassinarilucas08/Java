import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SystemHour{
    // public static void main(String[] args) {
    //     Date clock = new Date();
    //     System.out.print("The system hour is: ");
    //     System.out.print(clock.toString());
    // }
    //O código acima printa a data e a hora
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = now.format(format);

    System.out.println("The hour now is " + formattedTime);
    }
    //O código acima printa apenas a hora
}