/*
* This class creates an airplane.
*
* @author  PAtrick Gemmell
* @version 1.0
* @since   2020-05-27
*/
/**
* Setting field values with a constructor.
*/
public class Airplane {
  // Initializing fields
  /**
   * Setting field values with a constructor.
   */
  private int speed;

  /**
   * Setting field values with a constructor.
   */
  public Airplane() {
    this.speed = 0;
  }
  /**
   * This method sets the speed of the airplane.
   * @param speedABC
   */
  public void setSpeed(final int speedABC) {
    this.speed = speedABC;
  }
  /**
   * This method gets the speed of the airplane.
   * @return
   * returns speed
   */
  public int getSpeed() {
    return this.speed;
  }
}
