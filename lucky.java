// Write a method named lucky that accepts an integer parameter min and rolls a 6-sided die until it gets four consecutive rolls in a row that have values of min or less. As the method rolls the die it should print each value rolled, and then it should print a message at the end to indicate how many rolls were made. For example, the call of lucky(3); should print output such as the following (though the output would be different on every call because of randomness). Notice that the method stops after rolling 3, 2, 1, and 2 consecutively because these are all values of 3 or less:

// 5 2 4 6 1 3 5 5 3 2 1 2 
// Finished after 12 rolls.
// A call of lucky(5); should print output such as the following. Notice that it continues rolling until it rolls four consecutive dice rolls produce a value of 5 or less. In this example, those values are 3, 5, 5, and 4.

// 1 3 6 3 5 5 4 
// Finished after 7 rolls.
// You may assume that the parameter value passed will be between 1 and 6 inclusive. (Because this problem uses random numbers, our test cases check only the general format of your output. You must still examine the output yourself to make sure the answer is correct.)

public static void lucky(int min) {
  int count = 0;
  int rolls = 0;
  Random r = new Random();

  while (count < 4) {
    int roll= r.nextInt(6) + 1;
    rolls++;
    if (roll <= min) {
      count++;
    } else {
      count = 0;
    }

    if (count < 4) {
      System.out.print(roll + " ");
    } else {
      System.out.println(roll);
    }
  
    if (count == 4) {
      System.out.print("Finished after " + rolls + " rolls.");
    }
  }
}