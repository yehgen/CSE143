// Suppose that you are provided with a pre-written class ClockTime as described below. (The headings are shown, but not the method bodies, to save space.) Assume that the fields, constructor, and methods shown are already implemented. You may refer to them or use them in solving this problem if necessary.


// // A ClockTime object represents an hour:minute time during
// // the day or night, such as 10:45 AM or 6:27 PM.
// public class ClockTime {
//     private int hour;
//     private int minute;
//     private String amPm;
// ​
//     // Constructs a new time for the given hour/minute
//     public ClockTime(int hour, int minute, String amPm)
    
//     // returns the field values
//     public int getHour()
//     public int getMinute()
//     public String getAmPm()
// ​
//     // returns String for time; for example, "6:27 PM"
//     public String toString()
// ​
//     // advances this ClockTime by the given # of minutes
//     public void advance(int m)
// ​
//     // your method would go here
// ​
// }
// Write an instance method named isWorkTime that will be placed inside the ClockTime class to become a part of each ClockTime object's behavior. The isWorkTime method returns true if the ClockTime object represents a time during the normal "work day" from 9:00 AM to 5:00 PM, inclusive. Any times outside that range would cause the method to return a result of false.

// For example, if the following object is declared in client code:


// ClockTime t1 = new ClockTime(3, 27, "PM");
// The following call to your method would return true:


// if (t1.isWorkTime()) {       // true
// Here are some other objects. Their results when used with your method are shown at right in comments:


// ClockTime t2 = new ClockTime(12, 45, "AM"); //false
// ClockTime t3 = new ClockTime( 6, 02, "AM"); //false
// ClockTime t4 = new ClockTime( 8, 59, "AM"); //false
// ClockTime t5 = new ClockTime( 9, 00, "AM"); //true
// ClockTime t6 = new ClockTime(11, 38, "AM"); //true
// ClockTime t7 = new ClockTime(12, 53, "PM"); //true
// ClockTime t8 = new ClockTime( 3, 15, "PM"); //true
// ClockTime t9 = new ClockTime( 4, 59, "PM"); //true
// ClockTime ta = new ClockTime( 5, 00, "PM"); //true
// ClockTime tb = new ClockTime( 5, 01, "PM"); //false
// ClockTime tc = new ClockTime( 8, 30, "PM"); //false
// ClockTime td = new ClockTime(11, 59, "PM"); //false
// Your method should not modify the state of the object. Assume that the state of the object is valid at the start of the call and that the amPm field stores either "AM" or "PM".

public boolean isWorkTime() {
  boolean work = false;
  if (amPm == "AM") {
    if (this.hour >= 9 && this.minute >= 0) {
      work = true;
      if (this.hour == 12) {
        work = false;
      }
    }
  } else {
    if (this.hour <= 4 || this.hour == 12) {
      work = true;
    } else if (this.hour == 5 && this.minute == 0) {
      work = true;
    }
  }
  return work;
}