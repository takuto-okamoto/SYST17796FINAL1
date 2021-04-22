/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam3.pkg1_syst17796;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Takuto
 */
public class FinalExam31_SYST17796IT {
    
    public FinalExam31_SYST17796IT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Good Test of calculateNet method, of class FinalExam31_SYST17796.
     */
    @Test
    public void testCalculateNetGood() {
        int hours = 40000;
        double rate = 1.5;
        double tax = 10000;
        FinalExam31_SYST17796 test = new FinalExam31_SYST17796();
        double result = test.calculateNet(hours, rate, tax);
        assertEquals(50000, result, 0.01);
    }
    
    /**
     * Bad Test of calculateNet method, of class FinalExam31_SYST17796.
     */
    @Test
    public void testCalculateNetBad() {
        int hours = 40000;
        double rate = 1.5;
        double tax = 10000;
        FinalExam31_SYST17796 test = new FinalExam31_SYST17796();
        double result = test.calculateNet(hours, rate, tax);
        assertEquals(40000, result, 0.01);
    }
}
