
package org.usfirst.frc.team178.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
<<<<<<< HEAD
	private RunningComponent[] components = {
		new Camera(new Joystick(1))
	};
	
    public void robotInit() {
    	
=======
	DriveTrain drivetrain;
	Joystick joystick;
	//Encoders encoder;
	double value;
    public void robotInit() {
    drivetrain = new DriveTrain();
    	joystick = new Joystick(1);
    	//encoder = new Encoders(1,2);
>>>>>>> 8a362654adf947564218eb491bbcca522255ceb2
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	for (int i = 0; i < components.length; i++) {
			components[i].auto();
		}
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
<<<<<<< HEAD
    	for (int i = 0; i < components.length; i++) {
			components[i].teleop();
		}
    }
    
=======
    	drivetrain.drive(joystick);
    	//System.out.println("Amount of Pulses:"/*+ encoder.GetPulse()*/);
    	}
 
>>>>>>> 8a362654adf947564218eb491bbcca522255ceb2
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
<<<<<<< HEAD
    	for (int i = 0; i < components.length; i++) {
			components[i].test();
		}
=======
    	//value = encoder.GetDistance();
        
>>>>>>> 8a362654adf947564218eb491bbcca522255ceb2
    }
    
}
