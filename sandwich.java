// Write a static method named sandwich that accepts a string bread, an array of strings fillings, and an integer fillFactor. Your method should return a new array sandwich which has bread as its first and last element and has fillFactor repetitions of the fillings array occupying the rest of its elements. For example, if fillings stores {"chicken", "lettuce"} and you call sandwich with sandwich("wheat", fillings, 2), your method should return {"wheat", "chicken", "lettuce", "chicken", "lettuce", "wheat"} because you add the elements of fillings as the inner elements of the sandwich array twice.

// The table below shows some additional calls to your method and the expected values returned:

// Arrays	Call and Value Returned
// String[] fillings1 = {"tuna", "mayo", "salt", "carrot"};	sandwich("bun", fillings1, 1) returns
// {"bun", "tuna", "mayo", "salt", "carrot", "bun"}
// String[] fillings2 = {"beef"};	sandwich("pita", fillings2, 4) returns
// {"pita", "beef", "beef", "beef", "beef", "pita"}
// String[] fillings3 = {"ham", "cheese"};	sandwich("rye", fillings3, 3) returns
// {"rye", "ham", "cheese", "ham", "cheese", "ham", "cheese", "rye"}
// String[] fillings4 = {"banana", "nutella"};	sandwich("white", fillings4, 0) returns
// {"white", "white"}
// String[] fillings5 = {};	sandwich("", fillings5, 5) returns
// {"", ""}
// For full credit, do not modify the elements of fillings. You may assume that fillings is not null and fillFactor is non-negative.

// Hint: Nested loops can be used to solve this, but they are not necessary.

public static String[] sandwich(String bread, String[] fillings, int fillFactor) {
  String[] sandwich = new String[fillFactor * fillings.length + 2];
  sandwich[0] = bread;
  sandwich[sandwich.length - 1] = bread;
  for (int i = 0; i < fillFactor; i++) {
    for (int j = 0; j < fillings.length; j++) {
      sandwich[j + 1 + (i * fillings.length)] = fillings[j];
    }
  }
  return sandwich;
}