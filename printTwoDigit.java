// Write a static method called printTwoDigit that takes a Random object and an integer n as parameters and that prints a series of n randomly generated two-digit numbers. The method should use the Random object to select numbers in the range of 10 to 99 inclusive where each number is equally likely to be chosen. The method should indicate whether the number 42 was selected. For example, given the following lines of code:

// Random r = new Random();
// printTwoDigit(r, 4);
// You would expect output like the following:

// next = 52
// next = 10
// next = 96
// next = 86
// no 42 was seen.
// As the final line of output above indicates, that particular sequence did not include the number 42. Suppose that we then call the method as follows:

// printTwoDigit(r, 6);
// We might get output like the following where 42 is included in the sequence:

// next = 83
// next = 29
// next = 42
// next = 22
// next = 36
// next = 73
// we saw a 42!
// You may assume the integer value passed to your method is greater than or equal to 0.

// (Because this problem uses random numbers, our test cases check only the general format of your output. You must still examine the output yourself to make sure the answer is correct.)

public static void printTwoDigit(Random r, int n) {
  boolean fourTwo = false;
  for (int i = 1; i <= n; i++) {
    int range = r.nextInt(90) + 10;
    System.out.println("next = " + range);
    if (range == 42) {
      fourTwo = true;
    }
  }

  if (fourTwo) {
    System.out.println("we saw a 42!");
  } else {
    System.out.println("no 42 was seen.");
  }
}