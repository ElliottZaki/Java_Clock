import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

class Clock {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The current time is: " + dtf.format(now));
    }
}