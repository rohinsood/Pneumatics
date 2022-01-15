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
    private final DoubleSolenoid[] m_doubleSolenoid = new DoubleSolenoid[2];

    public Solenoid () {
        for (int i = 0; i<2; i++) {
            m_doubleSolenoid[i] = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Pnuematics.kSolenoidForwardChannel[i], Pnuematics.kSolenoidReverseChannel[i]);
        }
    }
 

    public void forward(int pos) {
        m_doubleSolenoid[pos].set(kForward);
    }

    public void reverse(int pos) {
        m_doubleSolenoid[pos].set(kReverse);
    }

    public void off(int pos) {
        m_doubleSolenoid[pos].set(kOff);
    } 

    public void loopControl(){
        m_comp.enableDigital();
    }

    public void disableLoopControl() {
        m_comp.disable();
    }
}



