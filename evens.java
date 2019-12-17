// Write a method evens that takes an integer parameter n and that returns the integer formed by removing the odd digits from n. For example:

//     evens(8342116) returns 8426
//     evens(4109) returns 40
//     evens(8) returns 8
// If a negative number with even digits other than zero is passed to the method, the result should also be negative, as in:

//     evens(-34512) returns -42
//     evens(-163505) returns -60
// Any leading zeros in the result should be ignored and if there are no even digits other than zero in the number, the method should return zero, as in:

//     evens(3052) returns 2
//     evens(7010496) returns 46
//     evens(35179) returns 0
//     evens(5307) returns 0
//     evens(7) returns 0
// Write your solution to evens below.

public int evens(int n) {
  if (n == 0) {
    return 0;
  }

  int last = n % 10;
  if (last % 2 == 0) {
    return 10 * evens(n / 10) + last;
  }
  return evens(n / 10);
}