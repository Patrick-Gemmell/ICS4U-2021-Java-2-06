/*
* This class creates a jet which is a type of airplane.
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2020-05-27
*/

public class Jet extends Airplane {
  // Initializing fields
  /**
   * Setting field values with a constructor.
   */
  private static final int MULTIPLIER = 2;

  /**
   * Setting field values with a constructor.
   */
  public Jet() {
    super();
  }

  /**
   * This method sets the speed of the jet.
   * @param speed
   */
  public void setSpeed(final int speed) {
    super.setSpeed(speed * MULTIPLIER);
  }

  /**
   * This method accelerates the jet.
   */
  public void accelerate() {
    super.setSpeed(getSpeed() * 2);
  }
}
