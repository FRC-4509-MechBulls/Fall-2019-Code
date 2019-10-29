package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class HatchSubsystem2 extends Subsystem {

	@Override
	public void initDefaultCommand() {}

	public void enable() {
		RobotMap.hatchSolenoid2.set(true);
	}

	public void disable() {
		RobotMap.hatchSolenoid2.set(false);
	}

	public void toggle() {
		RobotMap.hatchSolenoid2.set(!RobotMap.hatchSolenoid2.get());
	}

}