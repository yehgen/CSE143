// In this problem, we'll address the following question: Can a cash register containing a given amount of pennies (1-cent coins) and a given amount of nickels (5-cent coins) give a customer a given exact amount of cents of change? For example, if there are 3 pennies and 5 nickels in the cash register, is it possible to give exactly 19 cents of change? (No.) If there are 2 pennies and 7 nickels in the register, is it possible to give exactly 26 cents of change? (Yes.)

// Write a method named canMakeChange that accepts three integer parameters representing the number of pennies in the cash register, the number of nickels in the cash register, and the desired amount of change to make. The method should return true if the coins in the register could be used to produce this exact amount of change, and false if not. For example, if the register contains 3 pennies and 4 nickels, it is able to exactly produce 17 cents of change (using 2 of the pennies and 3 of the nickels), so the call of canMakeChange(3, 4, 17) should return true. If the register contains 1 penny and 10 nickels, it is not able to exactly produce 8 cents of change (in this case, there are not enough pennies to reach exactly 8), so the call of canMakeChange(1, 10, 8) should return false.

// The following are several sample calls to your method and the values they should return. You may assume that no negative parameter values are passed, but otherwise your method should work with any values passed.

// Call	                                                                Value Returned

// canMakeChange(3, 4, 12)      //  3 pennies,  4 nickels,  12c change? true
// canMakeChange(1, 5, 26)      //  1 penny,    5 nickels,  26c change? true
// canMakeChange(24, 2, 31)     // 24 pennies,  2 nickels,  31c change? true
// canMakeChange(87, 19, 134)   // 87 pennies, 19 nickels, 134c change? true
// canMakeChange(0, 0, 0)       //  0 pennies,  0 nickels,   0c change? true
// canMakeChange(1, 1, 9)       //  1 penny,    1 nickel,    9c change? false
// canMakeChange(2, 7, 8)       //  2 pennies,  7 nickels,   8c change? false
// canMakeChange(4, 3, 39)      //  4 pennies,  3 nickels,  39c change? false
// canMakeChange(3, 80, 14)     //  3 pennies, 80 nickels,  14c change? false

public static boolean canMakeChange(int penny, int nickel, int change) {
  if (penny + 5 * nickel < change) {
    return false;
  } else if (change % 5 > penny) {
    return false;
  } else {
    return true;
  }
}