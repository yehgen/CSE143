// ("Critter" classes come from the University of Washington's CSE 142 Critters homework assignment. See the assignment spec for more information.)

// Write a critter class Grasshopper along with its movement and eating behavior. All unspecified aspects of Grasshopper use the default behavior. Write the complete class with any fields, constructors, etc. necessary to implement the behavior.

// A Grasshopper sits still until getting into a fight. Once it fights, it celebrates its victory by doing a "hop". A "hop" consists of moving north a certain number of times, then south the same number of times, then west one time. The hops start with a height of 1 (one move north, then one move south) but each subsequent fight causes the next hop to be larger by one. The second hop is 2 moves north, 2 moves south, then 1 move west. After finishing the hop, the Grasshopper sits idle again until it gets into another fight.

// If a Grasshopper is sitting still, it always fights with Attack.ROAR. If a Grasshopper gets into a fight in the middle of a hop (while it is not sitting still), it always returns Attack.FORFEIT, causing it to lose the fight.

// Here is an example sequence of moves for one Grasshopper:

// CCCCC (fights) NSWCCC (fights) NNSSWCCCCCCC (fights) NNNSSSWCC (fights) NNNNSS (fights and dies)

public class Grasshopper extends Critter {
  private int max = 0;
  private int move = 0;

  public Direction getMove() {
    if (move == 0) {
      return Direction.CENTER;
    } else if (move <= max) {
      move++;
      return Direction.NORTH;
    } else if (move <= 2 * max) {
      move++;
      return Direction.SOUTH;
    } else {
      move = 0;
      return Direction.WEST;
    }
  }

  public Attack fight(String opponent) {
    if (move == 0) {
      move++;
      max++;
      return Attack.ROAR;
    }
    return Attack.FORFEIT;
  }
}