/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public void drive (double speed, double rotation){
    RobotMap.driveTrain.arcadeDrive(speed,rotation);
  }

  // public DifferentialDrive controllerDrive = new DifferentialDrive(RobotMap.leftFrontMotor, RobotMap.rightFrontMotor);

  public void manualDrive(double move, double turn){
    //using differentialdrive and its stuff inside it
    /*math below makes it so if our Joystick is staying still but the robot is moving due to slight
    movements in the stick, it will be set to 0 and stay still*/  
    if (Math.abs(move) < 0.10) {				
      move = 0;
    }
    if (Math.abs(turn) < 0.10) {
      turn = 0;
    }
    RobotMap.driveTrain.arcadeDrive(move, turn);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
