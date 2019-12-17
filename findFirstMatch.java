// Write a method named findFirstMatch that accepts as its parameters a Scanner for an input file and an array of Strings keywords representing a list of keywords in a search. Your method will read lines from its input Scanner and should return the line number of the first line in the file that contains one or more words from keywords. If none of the keywords are found in the file, your method should return a -1. The search should be case-insensitive, so if a keyword was "banana", the line "yummy baNAna split" would be considered a line that contains the keyword. Your method should also match whole words only, so if the only keyword in the array was "ball", the line "football game" would not be considered a match.

// For example, consider the following input file saved in sidewalk.txt, consisting of 6 lines:

// Let us leave this place where the smoke blows black
// And the dark street winds and bends.
// Past the pits where the asphalt flowers grow
// We shall walk with a walk that is measured and slow,
// And watch where the chalk-white arrows go
// To the place where the sidewalk ends.

// Scanner input = new Scanner(new File("sidewalk.txt"));
// Arrays	                                       Call / Returned Value
// String[] k1 = {"place", "winds"};	          findFirstMatch(input, k1) returns 1
// String[] k2 = {"dinosaur", "PITS", "pots"};	findFirstMatch(input, k2) returns 3
// String[] k3 = {"chalk", "row", "g", "ends"};	findFirstMatch(input, k3) returns -1
// String[] k4 = {"to"};	                      findFirstMatch(input, k4) returns 6
// You may assume that none of the words in the keywords array contain spaces, i.e. all keywords are single whole words, and the array contains at least one element. Do not modify the elements of the keywords array.

public static int findFirstMatch(Scanner input, String[] keywords) {
  int lineNum = 0;
  while (input.hasNextLine()) {
    String line = input.nextLine();
    Scanner lineScan = new Scanner(line);
    lineNum++;
    while (lineScan.hasNext()) {
      String word = lineScan.next();
      for (int i = 0; i < keywords.length; i++) {
        if (keywords[i].equalsIgnoreCase(word)) {
          return lineNum;
        }
      }
    }
  }
  return -1;
}