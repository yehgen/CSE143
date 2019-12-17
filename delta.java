// Write a method named delta that accepts an array of integers as a parameter and returns a new array formed by inserting between each pair of values the difference between those values. For example, given this array:


// int[] numbers = {3, 8, 15};
// The call of delta(numbers) should return the following array:

// {3, 5, 8, 7, 15}
// In this example, 5 is inserted between 3 and 8 because (8 - 3) is 5, and 7 is inserted between 8 and 15 because (15 - 8) is 7. The difference should always be computed as the second value minus the first, so you can get negative values. For example, given the following array:


// int[] numbers2 = {3, 8, 2, 5, 1, 9};
// The call of delta(numbers2) should return the array:

// {3, 5, 8, -6, 2, 3, 5, -4, 1, 8, 9}
// You may assume that the array passed is not null. You may assume that the array contains at least one element.

public static int[] delta(int[] list) {
  int[] result = new int[list.length * 2 - 1];
  for (int i = 0; i < list.length; i++) {
    result[i * 2] = list[i];
  }

  for (int i = 0; i < list.length - 1; i++) {
    result[i * 2 + 1] = list[i + 1] - list[i];
  }
  return result;
}