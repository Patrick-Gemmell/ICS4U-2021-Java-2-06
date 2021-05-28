/*
* This program prints values that correlate with flight tests for a biplane and
* a boeing jet.
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2020-05-27
*/

public final class FlyTest {
  private FlyTest() {
  }
  /**
  * the number four.
  */
  public static final int FOUR = 4;
  /**
  * the number negative 212.
  */
  public static final int TOT = 212;
  /**
  * the number 422.
  */
  public static final int FTT = 422;
  /**
  * the number negative 5000.
  */
  public static final int FZZZ = 5000;
  /**
   * This function runs flight tests for a biplane and a boeing jet and prints
   * the values of the test.
   * @param args
   */
  public static void main(final String[] args) {
    // Creating a biplane and setting its speed
    Airplane biplane = new Airplane();
    biplane.setSpeed(TOT);
    System.out.println(biplane.getSpeed());

    // Creating a boeing jet and setting its speed
    Jet boeing = new Jet();
    boeing.setSpeed(FTT);
    System.out.println(boeing.getSpeed());

    // Setting counter variable
    int counter = 0;

    // Loop that tests acceleration on each aircraft
    while (counter < FOUR) {
      // Accelerating boeing plane
      boeing.accelerate();
      System.out.println(boeing.getSpeed());
      if (boeing.getSpeed() > FZZZ) {
        // Accelerating the biplane should the boeing plane speed be over 5000
        biplane.setSpeed(biplane.getSpeed() * 2);
      } else {
        // Accelerating the boeing aircraft
        boeing.accelerate();
      }

      // Increasing the counter by 1
      counter++;
    }

    // Printing out the final speed of the biplane
    System.out.println(biplane.getSpeed());
  }
}
