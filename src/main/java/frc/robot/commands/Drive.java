package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.Constants.XboxControllerConstants;

public class Drive extends Command {
  public Drive() {
      requires(Robot.m_driveTrain);
  }

  @Override
  protected void initialize() {
  }
  @Override
  protected void execute() {
    double rotationPower = -Robot.m_oi.leftY(XboxControllerConstants.driveController);
		double straightPower = Robot.m_oi.rightX(XboxControllerConstants.driveController);
    //Arcade
    Robot.m_driveTrain.setPower(straightPower + rotationPower, straightPower - rotationPower);
    //Tanks
    // Robot.m_driveTrain.setPower(rotationPower , straightPower);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }
}
