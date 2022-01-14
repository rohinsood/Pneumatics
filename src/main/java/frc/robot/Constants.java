// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static class Pnuematics {
        public static enum SolenoidDirection {
            FORWARD, REVERSE, OFF, COMPRESSOR, TRIGGER
        }
        public final static int kSolenoidForwardChannel = 2;
        public final static int kSolenoidReverseChannel = 2;
        
    
    }
    public static class Buttons {
        public final static XboxController m_xboxController = new XboxController(0);
        public final static JoystickButton m_aButton = new JoystickButton(m_xboxController, Button.kA.value);
        public final static JoystickButton m_bButton = new JoystickButton(m_xboxController, Button.kB.value);
        public final static JoystickButton m_xButton = new JoystickButton(m_xboxController, Button.kX.value);
        public final static JoystickButton m_yButton = new JoystickButton(m_xboxController, Button.kY.value);
        public final static JoystickButton m_leftBumper = new JoystickButton(m_xboxController, Button.kLeftBumper.value);
        public final static JoystickButton m_rightBumper = new JoystickButton(m_xboxController, Button.kRightBumper.value);
        public final static JoystickButton m_leftJoystickButton = new JoystickButton(m_xboxController, Button.kLeftStick.value);
        public final static JoystickButton m_rightJoystickButton = new JoystickButton(m_xboxController, Button.kRightStick.value);
        public static final double m_leftTriggerValue = m_xboxController.getLeftTriggerAxis();
        public static final double m_rightTriggerValue = m_xboxController.getRightTriggerAxis();
    }

    


}
