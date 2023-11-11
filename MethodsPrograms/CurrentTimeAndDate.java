import java.util.Calendar;

//import java.util.Date;

//import java.util.Calendar;

public class CurrentTimeAndDate {

  public static void main(String[] args) {
    // Date sc = new Date();

    // System.out.println("GetYear          : " + sc.getYear());
    // System.out.println("GetMonth         : " + sc.getMonth());
    // System.out.println("Getdate          : " + sc.getDate());
    // System.out.println("GetDay           : " + sc.getDay());
    // System.out.println("GetTime          : " + sc.getTime());
    // System.out.println("GetHours         : " + sc.getHours());
    // System.out.println("GetMinutes       : " + sc.getMinutes());
    // System.out.println("GetSecond        : " + sc.getSeconds());
    // System.out.println("GetTmeZoneOffSet : " + sc.getTimezoneOffset());
    // System.out.println("ToGMTString      : " + sc.toGMTString());
    // System.out.println("ToLocaleString   : " + sc.toLocaleString());
    // System.out.println("GetTimeZoneOffSet: " + sc.getTimezoneOffset());
    Calendar s = Calendar.getInstance();
    //  System.out.println(s.getInstance());
    System.out.println(s.getCalendarType());
    System.out.println(s.DAY_OF_MONTH);
  }
}
