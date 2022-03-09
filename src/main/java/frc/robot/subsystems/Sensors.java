// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.ColorSensorV3;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Sensors extends SubsystemBase {

  private final I2C.Port i2cPort = I2C.Port.kOnboard;
  private final ColorSensorV3 m_colorSensor = new ColorSensorV3(i2cPort);
  Color detectedColor;



  public Sensors() {
    //CameraServer.startAutomaticCapture();
    //CameraServer.startAutomaticCapture();

  }

  public void printRGBValues(){
    detectedColor = m_colorSensor.getColor();
    System.out.print("Red: " + detectedColor.red);
    System.out.print(" Green: " + detectedColor.green);
    System.out.println(" Blue: " + detectedColor.blue);


  }

  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
