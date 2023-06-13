package ExceptionHandling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {

    public static void main(String[] args) throws ParseException {

        String dateStr = "26/09/2013";

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM-yyyy");
        Date date = null;

       // try {
             date = sd.parse(dateStr);
    /*    }
        catch (ParseException e) {
           e.printStackTrace();
        }*/

        System.out.println("date="+date);

    }
}
