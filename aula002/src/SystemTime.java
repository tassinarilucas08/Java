import java.util.Date;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SystemTime{

    public static void main(String[] args) { 

        Date clock = new Date();
        System.out.println("The system hour is: " + clock.toString());
        //The above code displays the date and time in a disorganized format.

        LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = now.format(format);
        System.out.println("The hour now is " + formattedTime);    
        //The above code displays the time in a organized format.
    }
}