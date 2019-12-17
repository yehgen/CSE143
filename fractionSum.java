// Write a method called fractionSum that accepts an integer parameter n and returns as a double the sum of the first n terms of the sequence:

// fraction sum equation from i=1 to n of (1/i)

// In other words, the method should generate the following sequence:

// 1 + (1/2) + (1/3) + (1/4) + (1/5) + ...

// You may assume that the parameter n is non-negative.

public double fractionSum(double n) {
  double total = 0.0;
  for (double i = 1.0; i <= n; i++) {
    total = total + 1 / i;
  }
  return total;
}