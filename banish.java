// Write a method named banish that accepts two arrays of integers a1 and a2 as parameters and removes all occurrences of a2's values from a1. An element is "removed" by shifting all subsequent elements one index to the left to cover it up, placing a 0 into the last index. The original relative ordering of a1's elements should be retained.

// For example, suppose the following two arrays are declared and the following call is made:


// int[] a1 = {42, 3, 9, 42, 42, 0, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 0, 1};
// int[] a2 = {42, 2222, 9};
// banish(a1, a2);
// After the call has finished, the contents of a1 should become:

// {3, 0, 17, 8, 4, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
// Notice that all occurrences of the values 42, 2222, and 9 have been removed and replaced by 0s at the end of the array, and the remaining values have shifted left to compensate.

// Do not make any assumptions about the length of the arrays or the ranges of values each might contain. For example, each array might contain no elements or just one element, or very many elements. (If a2 is an empty array that contains no elements, a1 should not be modified by the call to your method.) You may assume that the arrays passed are not null. You may assume that the values stored in a2 are unique and that a2 does not contain the value 0.

// You may not use any temporary arrays to help you solve this problem. (But you may declare as many simple variables as you like, such as ints.) You also may not use any other data structures or complex types such as Strings, or other data structures such as the ArrayList class.

public static void banish(int[] a1, int[] a2) {
  for (int i = 0; i < a1.length; i++) {
    int zeros = 0;
    for (int j = 0; j < a2.length; j++) {
      if (a1[i] == a2[j]) {
        zeros++;
        for (int k = i+1; k < a1.length; k++) {
          a1[k-1] = a1[k];
        }
        a1[a1.length - 1] = 0;
      }
    }
    if (zeros > 0) {
      i--;
    }
  }
}