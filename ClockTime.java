// Suppose that a class ClockTime has been defined for storing information about times of day. Each ClockTime object keeps track of hours, minutes, and a String to indicate "am" or "pm". The class includes the following members:

// Name	                                                Description
// private int hours	                                    hours component
// private int minutes	                                  minutes component
// private String amPm	                                  "am" for mornings or "pm" for afternoons
// public ClockTime(int hours, int minutes, String amPm)	constructs a clock time with given hours, mins, am/pm
// public int getHours()	                                returns the hours
// public int getMinutes()	                              returns the minutes
// public String getAmPm()	                              returns the am/pm setting
// public String toString()	                            returns a String representation of the time
// Your task is to modify the class to be Comparable by adding an appropriate compareTo method. The earliest time is 12:00 am and the latest time is 11:59 pm. In between the time increases as it would in a standard clock. Keep in mind that 12:59 am is followed by 1:00 am, that 11:59 am is followed by 12:00 pm, and that 12:59 pm is followed by 1:00 pm.

// Assume that the values passed to your constructor are legal. In particular, hours will be between 1 and 12 inclusive, minutes will be between 0 and 59 inclusive, and the am/pm parameter will be either the string "am" or the string "pm". These values should be returned by the various get methods.

// The toString method returns a string composed of the hours followed by a colon followed by the minutes (2 digits) followed by a space followed by the am/pm String. For example, given these declarations:

// ClockTime time1 = new ClockTime(8, 31, "am");
// ClockTime time2 = new ClockTime(12, 7, "pm");
// time1.toString() would return "8:31 am" and time2.toString() should return "12:07 pm".
public class ClockTime implements Comparable<ClockTime> {
  private int hours;
  private int minutes;
  private String amPm;
  
  public ClockTime(int hours, int minutes, String amPm) {
    this.hours = hours;
    this.minutes = minutes;
    this.amPm = amPm;
  }
  
  public int getHours() {
    return hours;
  }
  
  public int getMinutes() {
    return minutes;
  }
  
  public String getAmPm() {
    return amPm;
  }
  
  public String toString() {
    String result = hours + ":";
    if (minutes < 10) {
        result += "0" + minutes;
    } else {
        result += minutes;
    }
    result += " " + amPm;
    return result;
  }

  public int compareTo(ClockTime other) {
    if (!amPm.equals(other.amPm)) {
      return amPm.compareTo(other.amPm);
    } else if (hours != other.hours) {
      return hours % 12 - other.hours % 12;
    } else {
      return minutes - other.minutes;
    }
  }
}