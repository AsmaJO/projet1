package org.fitec;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void shouldReturn5Given2And3(){
    App app=new App();
    assertTrue( app.addition(3,2)==5);

    }

    @Test
    public void shouldReturn2Given5And2(){
        App app=new App();
        assertTrue( app.modulo(5,3)==1);

    }


}
