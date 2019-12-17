// Write a method named evenOdd that accepts an array of integers as a parameter and rearranges the array's elements so that all of its odd elements are in positions with odd-numbered indexes and all of its even elements are in positions with even-numbered indexes. The array passed in will always contain exactly as many even values as odd values. The exact order of the elements in the array after your method is run on it is unimportant, as long as its content alternates between even and odd values, starting with even. In other words, after your method is done, the array contents should follow the pattern [even value, odd value, even value, odd value...].

// For example, if your method were called on the following array:


// int[] a1 = {5, 6, 3, 3, 2, 5, 2, 6};
// evenOdd(a1);
// One acceptable ordering of the elements after the call would be:

// [6, 5, 2, 3, 2, 5, 6, 3]
// The even-numbered indexes of this array are 0, 2, 4, 6, and each of these positions contains an even integer. The odd-numbered indexes of this array are 1, 3, 5, 7, and each of these positions contains an odd integer.

// You may assume that the array contains at least two elements. You may not create an additional array or use a String to solve this problem.

public static void evenOdd(int[] list) {
  for (int i = 0; i < list.length - 1; i++) {
    if (list[i] % 2 != i % 2) { // if the number at an even index isn't even
      int j = i + 1;
      while (list[j] % 2 != i % 2) {
        j++;
      }
      int hold = list[i];
      list[i] = list[j];
      list[j] = hold;
    }
  }
}