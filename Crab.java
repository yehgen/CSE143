// ("Critter" classes come from the University of Washington's CSE 142 Critters homework assignment. See the assignment spec for more information.)

// Write a class Crab that extends the Critter class from the Critters assignment, along with its movement behavior. Crab objects move in the following repeating pattern:

// west 1 time, east 2 times
// west 3 times, east 4 times
// west 5 times, east 6 times
// west 7 times, east 8 times
// west 7 times, east 6 times
// west 5 times, east 4 times
// west 3 times, east 2 times
// (entire pattern repeats)
// Write your complete Crab class below. All other aspects of Crab besides movement use the default critter behavior. You may add anything needed to your class (fields, constructors, etc.) to implement this behavior appropriately.

// Note: You will receive a maximum of only 5 points if you "hard-code" the entire set of movements (by simply keeping a move counter and using an extremely long chain of if or if/else statements) rather than recognizing the crab's overall movement pattern.

public class Crab extends Critter {
  private int moveCount;
  private int moveDirection;
  private int delta;

  public Crab() {
    moveCount = -1;
    moveDirection = 0;
    delta = 1;
  }

  public Direction getMove() {
    moveCount++;
    if (moveCount == moveDirection) {
      moveCount = 0;
      if (moveDirection == 8) {
        delta = -1;
      } else if (moveDirection == 1) {
        delta = 1;
      }
      moveDirection += delta;
    }
    if (moveDirection % 2 == 0) {
      return Direction.EAST;
    } else {
      return Direction.WEST;
    }
  }
}