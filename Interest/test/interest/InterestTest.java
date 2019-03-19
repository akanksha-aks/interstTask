/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author akanksha singh
 */
public class InterestTest {
    
    public InterestTest() {
        Interest instance = new Interest();
    }

    /**
     * Test of Interest method, of class Interest.
     */
    @Test
    public void testInterest() {
       
        Interest instance = new Interest();
        //for simple Interest
        assertEquals("sorry ,wrong answer",200,instance.Interest(1,1000,10,2,0),0.0);
        assertEquals("sorry ,wrong answer",16500,instance.Interest(1,15000,11,10,0.0),0.0);
        assertEquals("sorry ,wrong answer",6000,instance.Interest(1,10000,12,5,0.0),0.0);
        //compound interest
        assertEquals("sorry ,wrong answer",30.082637654808423,instance.Interest(2,5000,0.05,10,12),0.0);
        assertEquals("sorry ,wrong answer",4.003601920671599,instance.Interest(2,2000,0.02,5,10),0.0);
    
}
}
