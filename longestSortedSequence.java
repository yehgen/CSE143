// Write a method named longestSortedSequence that accepts an array of integers as a parameter and that returns the length of the longest sorted (nondecreasing) sequence of integers in the array. For example, if a variable named array stores the following values:

// int[] array = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
// then the call of longestSortedSequence(array) should return 4 because the longest sorted sequence in the array has four values in it (the sequence -3, 0, 14, 207). Notice that sorted means nondecreasing, which means that the sequence could contain duplicates. For example, if the array stores the following values:

// int[] array2 = {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1, 19}
// Then the method would return 5 for the length of the longest sequence (the sequence 3, 5, 5, 5, 8). Your method should return 0 if passed an empty array. Your method should return 1 if passed an array that is entirely in decreasing order or contains only one element.

public static int longestSortedSequence(int[] array) {
  int chain = 1;
  int maxChain = 1;
  if (array.length == 0) {
    maxChain = 0;
  }
  for (int i = 0; i < array.length - 1; i++) {
    if (array[i] <= array[i+1]) {
      chain++;
      if (maxChain < chain) {
        maxChain = chain;
      }
    } else {
      chain = 1;
    }
  }
  return maxChain;
}