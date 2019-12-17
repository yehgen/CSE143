// Write a method named countEvenDigits that accepts an integer parameter and returns the number of even digits in that integer. An even digit is one whose value is either 0, 2, 4, 6, or 8.

// For example, the number 8546587 has four even digits (the two 8s, the 4, and the 6), so the call countEvenDigits(8346387) should return 4.

// You may assume that the value passed to your method is greater than 0.

public static int countEvenDigits(int n) {
  int count = 0;
  while (n > 0) {
    if ((n % 10) % 2 == 0) {
      count++;
    }
    n = n / 10;
  }
  return count;
}