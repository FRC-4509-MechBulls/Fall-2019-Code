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
        //Use requires() here to declare subsystem dependencies
        addSequential(new DriveAutonomousCommand(0.5,0,0)); 
       addSequential(new DriveAutonomousCommand(1,0.45,0)); // Goes forward for 2.3 sec
        //addSequential(new DriveAutonomousCommand(2.25, -.75, 0)); // Rotates to fix the drift 

      //  addSequential(new DriveAutonomousCommand(1, .60, 0)); // Moves forward for 2 seconds
        addSequential(new DriveAutonomousCommand(1, -.65, 0)); // Moves backwards for 1.5 seconds
       // addSequential(new DriveAutonomousCommand(0.25, 0, -.35)); // Turns slightly counterclockwise
        addSequential(new DriveAutonomousCommand(3, 0.5, 0));
        addSequential(new DriveAutonomousCommand(1,0.0, 0.25));
        addSequential(new DriveAutonomousCommand(2,.5,0.0));
        // addSequential(new DriveAutonomousCommand(6.75, .6, 0)); // Moves forward for 4 seconds
        // addSequential(new DriveAutonomousCommand(1, 0, .3)); // Rotates to face the cargo 90 degrees clockwise
        // addSequential(new DriveAutonomousCommand(.5,0,0.65));
        // addSequential(new DriveAutonomousCommand(3.0,0.65,0));
        
        // addSequential(new DriveAutonomousCommand(.25,0,0.5));

        // addSequential(new DriveAutonomousCommand(.25,0,0));
        // addSequential(new DriveAutonomousCommand(1.30,-0.75,0));

        // addSequential(new DriveAutonomousCommand(1.4,.75,0));
        // addSequential(new DriveAutonomousCommand(.25,0,0.3));

        // addSequential(new DriveAutonomousCommand(1.7,-.75,0));
        // addSequential(new DriveAutonomousCommand(.25,0,-0.3));
        // addSequential(new DirectDriveCommand());
   
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
