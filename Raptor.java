// ("Critter" classes come from the University of Washington's CSE 142 Critters homework assignment. See the assignment spec for more information.)

// Write a critter class Raptor along with its movement and eating behavior. All unspecified aspects of Tigger use the default behavior. Write the complete class with any fields, constructors, etc. necessary to implement the behavior.

// In the absence of food, Raptors move horizontally. When a Raptor is constructed, he is passed a boolean value that indicates whether he will initially walk west (false) or east (true). The Raptor should remember this value and should continue walking in that direction until he finds food. If a Raptor finds food, he should eat it, and then "stomp" up and down 10 times by moving north-south 10 times. In other words, his next twenty moves after finding food should be N,S,N,S,N,S,N,S,N,S,N,S,N,S,N,S,N,S,N,S. After finishing his ten "stomps" the Raptor should resume moving horizontally, but reverse the direction from west to east or vice versa. For example, if the Raptor had been moving west and then finds food, he will move east once he is done stomping.

// The following would be a possible sequence of moves for a new Raptor(false) :

// W,W,W,W,W,W (eats food), N,S,N,S,N,S,N,S,N,S,N,S,N,S,N,S,N,S,N,S, E, E, E, E, (eats food), N,S,...
// The following would be a possible sequence of moves for a new Raptor(true) :

// E,E,E,E,E,E,E,E,E,E,E,E (eats food), N,S,N,S,N,S,N,S,N,S,N,S,N,S,N,S,N,S,N,S, W,W,W,W,W,W,W,W (eats food), N,S,N,S,N,S,N,S,N,S,N,S,N,S,N,S,N,S,N,S, E, E, E, ...

public class Raptor extends Critter {
  private boolean walkEast;
  private int stomp;

  public Raptor(boolean walkEast) {
    this.walkEast = walkEast;
    stomp = 0;
  }

  public boolean eat() {
    walkEast = !walkEast;
    stomp = 1;
    return true;
  }

  public Direction getMove() {
    if (stomp != 0) {
      Direction dir = Direction.CENTER;
      if (stomp % 2 == 0) {
        dir = Direction.SOUTH;
      } else {
        dir = Direction.NORTH;
      }
      stomp++;
      if (stomp > 20) {
        stomp = 0;
      }
      return dir;
    } else if (walkEast) {
      return Direction.EAST;
    }
    return Direction.WEST;
  }
}
