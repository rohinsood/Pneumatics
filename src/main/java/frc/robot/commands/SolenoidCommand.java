package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.Pnuematics.SolenoidDirection;
import frc.robot.subsystems.Solenoid;

public class SolenoidCommand extends CommandBase{
    

    private final Solenoid m_solenoid;
    private SolenoidDirection button;

    public SolenoidCommand(Solenoid subsystem, SolenoidDirection input) {
        m_solenoid = subsystem;
        button = input;
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(subsystem);
      }

    @Override
    public void initialize() {
        m_solenoid.loopControl();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        if (button == SolenoidDirection.FORWARD) m_solenoid.forward();

        if (button == SolenoidDirection.REVERSE) m_solenoid.reverse();

        if (button == SolenoidDirection.OFF) m_solenoid.off();
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