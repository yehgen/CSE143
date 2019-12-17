// Write a method named isAllEven that takes an array of integers as a parameter and that returns a boolean value indicating whether or not all of the values are even numbers (true for yes, false for no). For example, if a variable called list stores the following values:

// int[] list = {18, 0, 4, 204, 8, 4, 2, 18, 206, 1492, 42};

// Then the call of isAllEven(list) should return true because each of these integers is an even number.

// If instead the list had stored these values:

// int[] list = {2, 4, 6, 8, 10, 208, 16, 7, 92, 14};

// Then the call should return false because, although most of these values are even, the value 7 is an odd number. If the array is empty, your method should return true.

public static boolean isAllEven(int[] list) {
  for (int i = 0; i < list.length; i++) {
    if (list[i] % 2 != 0) {
      return false;
    }
  }
  return true;
}