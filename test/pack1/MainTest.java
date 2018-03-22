package pack1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MainTest {
    private Main main;
    
    @Before
    public void setup() {
    	main = new Main();
    }
	@Test
	public void testTriangle() {
	    assertEquals(0,main.triangle(1, 1, 3));
	    assertEquals(1,main.triangle(1, 1, 1));
	    assertEquals(2,main.triangle(2, 2, 3));
	    assertEquals(3,main.triangle(2, 3, 4));
	}
}
