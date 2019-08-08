/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;

/**
 * An example command. You can replace me with your own command.
 */
public class AutoCommands extends CommandGroup {
    public AutoCommands() {

        // number of seconds in auto mode
        // Use requires() here to declare subsystem dependencies
        addSequential(new ForwardCommand(1,0.75,0));
        //calls ForwardCommand which moves the robot forward
    //   addSequential(new StopCommand());
    //   //calls StopCommand which makes the robot stop for a couple of seconds
    // addSequential(new RotationCommand());
    // //calls RotationCommand afterwards to make robot rotate for a given amount of time
    //     addSequential(new StopCommand());
    // addSequential(new ForwardCommand());
    // addSequential(new StopCommand());
    // addSequential(new BackwardsCommand());
    // //calls BackwardsCommand to make the robot go backwards
    // addSequential(new StopCommand());
    // addSequential(new BackwardsRotation());
    // //calls BackwardsRotation to rotate the robot in its original position
    // addSequential(new StopCommand());
    // addSequential(new BackwardsCommand());
    // addSequential(new RotationCommand());
    // addSequential(new BackwardsCommand());
    addSequential(new DriveManually());
    requires(Robot.m_subsystem);
    
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
