/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import edu.wpi.first.wpilibj.command.*;
import frc.robot.controls.*;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;
import frc.robot.controls.XboxArcadeController;

/**
 * An example command. You can replace me with your own command.
 */
public class AutoCommands extends CommandGroup {
    public AutoCommands() {

        // number of seconds in auto mode
        // Use requires() here to declare subsystem dependencies
        addSequential(new DriveAutonomousCommand(2,0.75,0));
        addSequential(new DriveAutonomousCommand(0,0,0));
    addSequential(new DriveAutonomousCommand(0.25,0,-.75));
    addSequential(new DriveAutonomousCommand(0,0,0));
      addSequential(new DriveAutonomousCommand(2,0.5,0.0));
   
    requires(Robot.drivingSubsystem);
    
  }

  // Called just before this Command runs the first time
//   @Override
//   protected void initialize() {
    
//   }

//   // Called repeatedly when this Command is scheduled to run
//   @Override
//   protected void execute() {
    

//   }

//   // Make this return true when this Command no longer needs to run execute()

//   // Called once after isFinished returns true
//   @Override
//   protected void end() {

//   }

//   // Called when another command which requires one or more of the same
//   // subsystems is scheduled to run
//   @Override
//   protected void interrupted() {
//   }
}
