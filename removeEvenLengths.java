// Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that removes all of the strings of even length from the list.

public static void removeEvenLength(ArrayList<String> s) {
  for (int i = 0; i < s.size(); i++) {
    String word = s.get(i);
    if (word.length() % 2 == 0) {
      s.remove(i);
      i--;
    }
  }
}