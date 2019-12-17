// Write a method ant that simulates an ant trying to crawl up a building of height 6 steps. The ant starts on the ground, at height 0. Each iteration, the ant either crawls up one step, or slips off and falls all the way back to the ground. There is a 50% chance on each iteration that the ant will slip. You should use a Random object for this where zero represents a slip. The method should keep going until the ant gets to the top of the building. It should then print out the number of falls that the ant took before it finally reached the top.

// Here is a sample execution.

// number of falls: 8
// (Because this problem uses random numbers, our test cases check only the general format of your output. You must still examine the output yourself to make sure the answer is correct.)

public static void ant() {
  Random r = new Random();
  int falls = 0;
  int height = 0;
  while (height < 6) {
    int crawl = r.nextInt(2);
    if (crawl == 0) {
      height = 0;
      falls++;
    } else { 
      height++;
    }
  }
  System.out.println("number of falls: " + falls);
}