// ("Critter" classes come from the University of Washington's CSE 142 Critters homework assignment. See the assignment spec for more information.)

// Write a complete Critter class named Bumblebee. A Bumblebee object should move in a "spiral" pattern from W to S to E to N, lengthening each time:

// one step west
// two steps south
// three steps east
// four steps north
// five steps west
// six steps south
// seven steps east
// eight steps north
// nine steps west
// ...
// All other Bumblebee behavior uses the defaults. You may add anything needed (fields, other methods) to implement this behavior appropriately.

public class Bumblebee extends Critter {
  private int direction; // W S E N for 0 1 2 3
  private int steps; // amount of steps taken
  private int moves; // moves needed

  public Bumblebee() {
    direction = 0;
    steps = 0;
    moves = 1;
  }

  public Direction getMove() {
    steps++;
    if (steps > moves) {
      moves++;
      steps = 1;
      direction = (direction + 1) % 4;
    }

    if (direction == 0) {
      return Direction.WEST;
    } else if (direction == 1) {
      return Direction.SOUTH;
    } else if (direction == 2) {
      return Direction.EAST;
    }
    return Direction.NORTH;
  }
}