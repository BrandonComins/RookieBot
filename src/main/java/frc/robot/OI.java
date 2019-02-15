
package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Constants.XboxControllerConstants;

public class OI {
  public double leftX(Joystick cont) {
		return cont.getRawAxis(XboxControllerConstants.AXIS_LEFT_X);
	}

	public double leftY(Joystick cont) {
		return cont.getRawAxis(XboxControllerConstants.AXIS_LEFT_Y);
	}

	public double rightX(Joystick cont) {
		return cont.getRawAxis(XboxControllerConstants.AXIS_RIGHT_X);
	}

	public double rightY(Joystick cont) {
		return cont.getRawAxis(XboxControllerConstants.AXIS_RIGHT_Y);
	}

	public double leftTrigger(Joystick cont) {
		return cont.getRawAxis(XboxControllerConstants.TRIGGER_RIGHT);
	}

	public OI() {

	}
}