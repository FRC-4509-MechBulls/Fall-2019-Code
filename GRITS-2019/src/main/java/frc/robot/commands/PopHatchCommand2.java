package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class PopHatchCommand2 extends Command {
	
	public PopHatchCommand2() {
		requires(Robot.hatchSubsystem2);
	}

	protected void initialize() {
		Robot.hatchSubsystem2.enable();
	}

	public boolean isFinished() {
		return false;
	}
	
	protected void end() {
		Robot.hatchSubsystem2.disable();
	}

}