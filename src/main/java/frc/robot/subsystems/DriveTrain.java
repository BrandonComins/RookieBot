package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Constants.DriveTrainConstants;
import frc.robot.commands.Drive;

public class DriveTrain extends Subsystem {
  // Declaring Left Motors
	private WPI_VictorSPX leftFrontMotor;
	private WPI_VictorSPX leftRearMotor;

	// Declaring Right Motors
	private WPI_VictorSPX rightFrontMotor;
	private WPI_VictorSPX rightRearMotor;

	public DriveTrain() {
		// Instantiating motors
		leftFrontMotor = new WPI_VictorSPX(DriveTrainConstants.MOTOR_LEFT_FRONT);
		leftRearMotor = new WPI_VictorSPX(DriveTrainConstants.MOTOR_LEFT_REAR);

		rightFrontMotor = new WPI_VictorSPX(DriveTrainConstants.MOTOR_RIGHT_FRONT);
		rightRearMotor = new WPI_VictorSPX(DriveTrainConstants.MOTOR_RIGHT_REAR);

		// Setting VictorSPX's to follower mode
		leftRearMotor.follow(leftFrontMotor);

		rightRearMotor.follow(rightFrontMotor);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new Drive());
  }

  // setPower is used for teleOP
	public void setPower(double leftPower, double rightPower) {
		leftFrontMotor.set(ControlMode.PercentOutput, leftPower);
		rightFrontMotor.set(ControlMode.PercentOutput, rightPower);
	}

}
