// Write a method named printStrings that takes as a parameter a Scanner holding a sequence of integer/string pairs and that prints to System.out one line of output for each pair with the given String repeated the given number of times. For example if the Scanner contains the following data:

// 6 fun. 3 hello  10   <> 2      25   4 wow!
// your method should produce the following output:

// fun.fun.fun.fun.fun.fun.
// hellohellohello
// <><><><><><><><><><>
// 2525
// wow!wow!wow!wow!
// Notice that there is one line of output for each integer/string pair. The first line has 6 occurrences of "fun.", the second line has 3 occurrences of "hello", the third line has 10 occurrences of "<>", the fourth line has 2 occurrences of "25" the fifth line has 4 occurrences of "wow!". Notice that there are no extra spaces included in the output. You are to exactly reproduce the format of this sample output. You may assume that the input values always come in pairs with an integer followed by a String (which itself could be numeric, such as "25" above). If the Scanner is empty (no integer/string pairs), your method should produce no output.

public static void printStrings(Scanner s) {
  while (s.hasNextInt()) {
    int amount = s.nextInt();
    String term = s.next();
    for (int i = 0; i < amount; i++) {
      System.out.print(term);
    }
    System.out.println();
  }
}