package frc.robot.commands.Auto.Routines;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.Auto.SensorlessDrive;

public class DriveToLine extends CommandGroup {
  public DriveToLine() {
    addSequential(new SensorlessDrive(), 3);
  }
}
