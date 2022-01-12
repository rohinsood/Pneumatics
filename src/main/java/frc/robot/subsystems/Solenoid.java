package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Compressor;
import frc.robot.Constants.Pnuematics;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;


public class Solenoid extends SubsystemBase {
    private final Compressor m_comp = new Compressor(0, PneumaticsModuleType.CTREPCM);
    private final DoubleSolenoid m_doubleSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Pnuematics.kSolenoidForwardChannel, Pnuematics.kSolenoidReverseChannel); 

    public void forward() {
        m_doubleSolenoid.set(kForward);
    }

    public void reverse() {
        m_doubleSolenoid.set(kReverse);
    }

    public void off() {
        m_doubleSolenoid.set(kOff);
    } 

    public void loopControl(){
        m_comp.enableDigital();
    }
}



