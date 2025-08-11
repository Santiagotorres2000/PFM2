
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Record {
    private String action;
    private Long date;

    public Record(String action, Long fecha) {
        this.action = action;
        this.date = System.currentTimeMillis();
    }

    public String getActio() {
        return action;
    }

    public Long getDate() {
        return date;
    }
    public String toString(){
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date), ZoneId.systemDefault());
        return "[" + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + "] " + action;
    }

   

    
}
