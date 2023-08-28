import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTime {
    public static void main(String[] args) {
        Date date = new Date();
        String formatedDate = formatDate(date);
        System.out.println("Formatted date: " + formatedDate);
    }
    
     public static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(date);
    }
}
