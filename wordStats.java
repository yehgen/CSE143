// Write a method named wordStats that accepts as its parameter a Scanner holding a sequence of words and that reports the total number of words (as an integer) and the average word length (as an un-rounded real number). You may assume that the Scanner isn't empty. For example, suppose the Scanner is scanning an input source that contains the following words:

// To be or not to be, that is the question.
// For the purposes of this problem, we will use whitespace to separate words. That means that some words include punctuation, as in "be,". (This is the same definition that the Scanner uses for tokens.) For the input above, your method should produce exactly the following output:

// Total words    = 10
// Average length = 3.2

public static void wordStats(Scanner words) {
  int totWords = 0;
  int totCharacters = 0;
  String word = "";

  while (words.hasNext()) {
    word = words.next();
    for (int i = 0; i < word.length(); i++) {
      totCharacters++;
    }
    totWords++;
  }
  System.out.println("Total words    = " + totWords);
  System.out.println("Average length = " + 1.0 * totCharacters / totWords);
}