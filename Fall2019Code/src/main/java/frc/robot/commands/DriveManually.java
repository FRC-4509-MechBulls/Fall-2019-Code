/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;


public class DriveManually extends Command {
//   Encoder encoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
//   int count = encoder.get();
// double encoderDistance = encoder.getRaw();
// double distance = encoder.getDistance();
// double period = encoder.getPeriod();
// double rate = encoder.getRate();
// boolean direction = encoder.getDirection();
// boolean stopped = encoder.getStopped();
  public DriveManually() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_subsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    // set up initial values
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //fires every 20 milliseconds
    //declaring values for move and turn
    double move = -Robot.m_oi.stick.getY();
    //its negative since going forward is -1 by default and this will make it 1
    double turn = Robot.m_oi.stick.getX();
    Robot.m_subsystem.manualDrive(move, turn);
  //System.out.println(distance);
    
  
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    //checks if it is finished
    //if so then it will return true
    /*
    LETS SAY YOU WANT TO CODE AUTOMONOUS:
     if(feetDrive > 10) return true;
    */
    return false;


  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
    //end command if interruption with code
  }
}
