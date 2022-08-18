package com.acme.app;

import static org.junit.Assert.assertEquals;
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
    public void shouldReturnTheExpectedCaption() 
    {
        App app = new App();

        assertEquals("Hello World!", app.getCaption());
    }

    @Test
    public void shouldReturnTheInitializedCaption() 
    {
        App app = new App("Hello Jordyn!");

        assertEquals("Hello Jordyn!", app.getCaption());
    }
}
