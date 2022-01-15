package frc.robot.commands;

import edu.wpi.first.wpilibj.PS4Controller.Button;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.Buttons;
import frc.robot.Constants.Pnuematics.SolenoidDirection;
import frc.robot.subsystems.Solenoid;

public class SolenoidCommand extends CommandBase{
    

    private final Solenoid m_solenoid;

    public SolenoidCommand(Solenoid subsystem) {
        m_solenoid = subsystem;
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(subsystem);
      }

    @Override
    public void initialize() {
        System.out.println("ROHIN HATES SPAM");
        // m_solenoid.loopControl();
        m_solenoid.disableLoopControl();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        System.out.println("B button");
        System.out.println(Buttons.m_bButton.get());
        System.out.println("A button");
        System.out.println(Buttons.m_aButton.get());
        // if (Buttons.m_leftTriggerValue.getAsDouble() > 0.0) {
        //     for (int i = 0; i<2; i++) m_solenoid.forward(i); 
        //     System.out.println("Forwards");
        // }

        // else if (Buttons.m_rightTriggerValue.getAsDouble() > 0.0) {
        //     for (int i = 0; i<2; i++) m_solenoid.reverse(i); 
        //     System.out.println("Reverse");
        // }

        double[] triggerVals = {Buttons.m_leftTriggerValue.getAsDouble(),Buttons.m_rightTriggerValue.getAsDouble()};

        for (int i = 0; i<2; i++) {
            if (triggerVals[i] > 0.0) {
                m_solenoid.forward(i); 
                System.out.println("Forwards");
            }
            else {
                m_solenoid.reverse(i); 
                System.out.println("Reverse");
            }

            
            if (Buttons.m_xButton.get()) {
                m_solenoid.off(i); /*System.out.println("Loop Ctronl Off");*/
            }
        }
        

        if (Buttons.m_aButton.get()) {
            m_solenoid.disableLoopControl(); /*System.out.println("Loop Ctronl Off");*/
        }

        if (Buttons.m_bButton.get()) {
            m_solenoid.loopControl();
        }
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
  }
  
}