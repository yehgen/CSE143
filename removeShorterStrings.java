// Write a method removeShorterStrings that takes an ArrayList of strings as a parameter and that removes from each successive pair of values the shorter string in the pair. For example, suppose that an ArrayList called "list" contains the following values:

// ["four", "score", "and", "seven", "years", "ago"]
// In the first pair of strings ("four" and "score") the shorter string is "four". In the second pair of strings ("and" and "seven") the shorter String is "and". In the third pair of strings ("years" and "ago") the shorter string is "ago". Therefore, the call: removeShorterStrings(list); should remove these shorter strings, leaving the list with the following sequence of values after the method finishes executing:

// ["score", "seven", "years"]
// If there is a tie (both strings have the same length), your method should remove the first string in the pair. If there is an odd number of strings in the list, the final value should be kept in the list. For example, if the list contains the following values:

// ["to", "be", "or", "not", "to", "be", "hamlet"]
// After calling removeShorterStrings, it should contain the following:

// ["be", "not", "be", "hamlet"]
// You may not use any other arrays, lists, or other data structures to help you solve this problem, though you can create as many simple variables as you like. You may assume that the list passed is not null.

public static void removeShorterStrings(ArrayList<String> list) {
  for (int i = 0; i < list.size() - 1; i++) {
    String first = list.get(i);
    String second = list.get(i+1);
    if (first.length() > second.length()) {
      list.remove(second);
    } else {
      list.remove(first);
    }
  }
}