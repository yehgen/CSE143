// Write a recursive method called printDashed that takes an integer as a parameter and that prints the integer with dashes in between the digits.

// The table below shows sample calls and the output that should be produced:

//         Method call            Output       Method call             Output
//         ------------------------------      ---------------------------------
//         printDashed(-834)       -8-3-4      printDashed(6)          6
//         printDashed(-17)        -1-7        printDashed(42)         4-2
//         printDashed(-4)         -4          printDashed(983)        9-8-3
//         printDashed(0)          0           printDashed(29348)      2-9-3-4-8
// Notice that no dashes are printed for positive one-digit numbers and that a leading dash is printed only for negative numbers. You are not allowed to construct any structured objects (no array, ArrayList, String, StringBuilder, etc) and you may not use a while loop, for loop, or do/while loop to solve this problem; you must use recursion.

public void printDashed(int n) {
  if (n < 0) {
    System.out.print("-");
    printDashed(-n);
  } else if (n < 10) {
    System.out.print(n);
  } else {
    printDashed(n / 10);
    System.out.print("-");
    printDashed(n % 10);
  }
}