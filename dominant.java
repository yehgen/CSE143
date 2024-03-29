// Write a method dominant that accepts three integers as parameters and returns true if any one of the three integers is larger than the sum of the other two integers. The integers might be passed in any order, so the largest value could be any of the three. If no value is larger than the sum of the other two, your method should return false.

// For example, the call of dominant(4, 9, 2) would return true because 9 is larger than 4 + 2. The call of dominant(5, 3, 7) would return false because none of those three numbers is larger than the sum of the others. You may assume that none of the numbers is negative.

public static boolean dominant(int one, int two, int three) {
  boolean larger = false;
  int sumOneTwo = one + two;
  int sumTwoThree = two + three;
  int sumOneThree = one + three;
  if (one > sumTwoThree || two > sumOneThree || three > sumOneTwo) {
    larger = true;
  }
  return larger;
}