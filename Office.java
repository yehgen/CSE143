// Define a class called Office that keeps track of information about an office's features. The class should have the following public methods:

// Method	Description
// public Office(double width, double length, boolean couch, int windows)	constructs an Office object with the given width and length, couch (true or false) and number of windows
// public boolean isCorner()	returns true if the office is a corner office. A corner office is square (has the same width and length) and has exactly two windows.
// public String toString()	returns a string representing the office in the format: width: , length: , windows: . If the office has a couch ", has a couch" should be appended to the end of the string.
// Examples:

// Office o1 = new Office (10.3, 10.3, true, 3);
// Office o2 = new Office (14.0, 6.7, false, 3);
// A call on o1.toString() and o2.toString() would return, respectively:


// width: 10.3, length: 10.3, windows: 3, has a couch
// width: 14.0, length: 6.7, windows: 2
// Also make Office objects comparable to each other using the Comparable interface. Offices that have that have a greater area (width * length) should be considered "less" than other Offices so that they appear at the beginning of a sorted list. Offices that have the same area should be ordered by the number of windows they have, with Offices that have a greater amount of windows considered "less" than Offices that have less. If Offices still appear equal they should be compared by whether or not they have a couch. Offices with couches should be considered "less".

public class Office implements Comparable<Office> {
  double width;
  double length;
  boolean couch;
  int windows;

  public Office(double width, double length, boolean couch, int windows) {
    this.width = width;
    this.length = length;
    this.couch = couch;
    this.windows = windows;
  }

  public boolean isCorner() {
    if (width == length && windows == 2) {
      return true;
    }
    return false;
  }

  public String toString() {
    String s = "width: " + width + ", length: " + length + ", windows: " + windows;
    if (couch == true) {
      s += ", has a couch";
    }
    return s;
  }

  public int compareTo(Office other) {
    if (length * width < other.length * other.width) {
      return 1;
    } else if (length * width > other.length * other.width) {
      return -1;
    } else if (windows != other.windows) {
      return other.windows - windows;
    } else {
      if (couch && !other.couch) {
        return -1;
      } else if (!couch && other.couch) {
        return 1;
      } else {
        return 0;
      }
    }
  }
}