// Write a method named groceries that accepts as its parameter a Scanner for an input file. The data in the file represents grocery items purchased along with their price and their discount category. Your method should compute and return a real number representing the total cost of the grocery items.

// Each item is represented by three tokens starting with the name of the item (a single word) followed by its discount category ("red", "blue" or "none") followed by its full price. The discount category may include capitalization. The different discount options are:

// red: 10% off full price
// blue: 25% off full price
// none: full price
// For example, if a Scanner named input refers to an input file containing the following text:

// avocado RED 1  blueberries none 5 milk blue 
//    2.00       cream                   red 1.00    cereal None 1.29
// The call on groceries(input) should return 9.59. The avocado will cost $0.9 because a discount of 10% off of $1 is $0.1. Blueberries cost the full price of $5. Milk will cost $1.50 because it receives a discount of 25% off of $2.00. Cream will cost $0.9 and cereal will cost the full price of $1.29. The total is 0.9 + 5 + 1.5 + .9 + 1.29 = 9.59.

// Notice that the input may span multiple lines and may have different spacing between tokens. The entire file represents a single grocery bill.

// You may assume that the input file exists and has the format described above. The file will always contain at least one grocery item and will always contain a number of tokens that is a multiple of 3. The second token in every triple will always be one of "red", "blue" or "none", case-insensitive.

public static double groceries(Scanner s) {
  double red = 0.0;
  double blue = 0.0;
  double none = 0.0;
  while (s.hasNext()) {
    s.next();
    String color = s.next();
    if (color.equalsIgnoreCase("red")) {
      red += s.nextDouble();
    } else if (color.equalsIgnoreCase("blue")) {
      blue += s.nextDouble();
    } else {
      none += s.nextDouble();
    }
  }
  return 0.90 * red + 0.75 * blue + none;
}