/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam3.pkg1_syst17796;

/**
 *
 * @author Takuto
 */
public class FinalExam31_SYST17796 {
    public double calculateNet(int hours, double rate, double tax) {
        double gross = hours * rate;
        double net = gross - tax;
        return net;
    }
}
