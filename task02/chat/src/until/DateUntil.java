package until;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUntil {

  public static String getNow(){
    Date date = new Date();
    SimpleDateFormat formatTime =  new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
    return formatTime.format(date);
  }

}
