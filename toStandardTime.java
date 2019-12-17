// Suppose that you are provided with a pre-written class ClockTime as described below. Assume that the fields, constructor, and methods shown are implemented. You may refer to them or use them in solving this problem.


// // A ClockTime object represents an hour:minute time in  in either standard 
// // time such as 10:45 AM or 6:27 PM or military time such as 10:45 hours or
// // 18:27 hours.
// public class ClockTime {
//         private int hour;
//         private int minute;
//         private String label;
// ​
//         // Constructs a new time for the given hour/minute.  If time is in
//         // standard time, the label is "AM" or "PM".  If the time is in military
//         // time, the label is "hours".
//         public ClockTime(int h, int m, String label)
// ​
//         // returns the field values
//         public int getHour()
//         public int getMinute()
//         public String getLabel()
// ​
//         // returns String for time;
//         // example: "06:27 PM"
//         // example: "18:27 hours"
//         public String toString()
// ​
//         // your method would go here
// }
// This version of ClockTime can represent times in either standard or military time format. Military time is an alternative way to describe times where hours go from 0 - 24 instead of 1 - 12 (the AM and PM suffixes are not used). The following table shows how to convert between standard and military time:

// Standard Time	Military Time
// 12:00AM (midnight)	24:00 hours
// 12:01AM to 12:59AM	00:01 hours to 00:59 hours
// 1:00AM to 11:59AM	01:00 hours to 11:59 hours
// 12:00PM (noon) to 12:59PM	12:00 hours to 12:59 hours
// 1:00PM to 11:59PM	13:00 hours to 23:59 hours
// Write an instance method named toStandardTime that will be placed inside the ClockTime class to become a part of each ClockTime object's behavior. The toStandardTime method converts the ClockTime object into standard time if it is in military time. You can tell which format a particular ClockTime object is using by examining its label field. For example, if the following object is declared in client code:

// ClockTime t1 = new ClockTime(15, 27, "hours");
        
// The following call to your method would cause 03:27 PM to be printed to the console:

// t1.toStandardTime();
// System.out.println(t1);    // 03:27 PM 
        
// Here are some other objects. Their results when used with your method and then printed to the console are shown at right in comments:


// ClockTime t2 = new ClockTime(24, 00, "hours");   // 12:00 AM
// ClockTime t3 = new ClockTime( 0, 30, "hours");   // 12:30 AM
// ClockTime t4 = new ClockTime(10, 35, "hours");   // 10:35 AM
// ClockTime t5 = new ClockTime(12, 15, "hours");   // 12:15 PM
// ClockTime t6 = new ClockTime(13, 00, "hours");   // 01:00 PM
// ClockTime t7 = new ClockTime(19, 11, "hours");   // 07:11 PM
// ClockTime t9 = new ClockTime(23, 59, "hours");   // 11:59 PM
// ClockTime ta = new ClockTime( 9, 30, "AM");      // 09:30 AM
// ClockTime tb = new ClockTime( 5, 01, "PM");      // 05:01 PM
// Assume that the state of the ClockTime object is valid and that the label field stores "AM", "PM", or "hours".

public void toStandardTime() {
  if (label == "hours") {
    if (hour == 24 || hour == 0) {
      hour = 12;
      label = "AM";
    } else if (hour < 12) {
      label = "AM";
    } else if (hour >= 12) {
      label = "PM";
      hour = hour - 12;
      if (hour == 0) {
        hour = 12;
      }
    }
  }
}