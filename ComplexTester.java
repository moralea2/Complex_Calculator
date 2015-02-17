import static org.junit.Assert.*;

import org.junit.Test;


public class ComplexTester {

	@Test
	public void ComplexCreationTest(){
		Complex c = new Complex(); 
		assertEquals(0, c.realNum, 0);
		assertEquals(0, c.complexNum, 0);
	}
	@Test
	public void ComplexCustomCreationTest(){
		Complex c = new Complex(1,2); 
		assertEquals(1, c.realNum, 0);
		assertEquals(2, c.complexNum, 0);
	}
	
	@Test 
	public void additionTest(){
		Complex c = new Complex(1,2);
		c = c.add(new Complex(3, 4));
	    assertEquals(4, c.realNum, 0);
	    assertEquals(6, c.complexNum, 0);		
	}
	
	@Test 
	public void subtractionTest(){
		Complex c = new Complex(1,2);
		c = c.subtract(new Complex(3, 4));
	    assertEquals(-2, c.realNum, 0);
	    assertEquals(-2, c.complexNum, 0);		
	}
	
	@Test 
	public void multiplyTest(){
		Complex c = new Complex(1,2);
		c = c.multiply(new Complex(3, 4));
	    assertEquals(-5, c.realNum, 0);
	    assertEquals(10, c.complexNum, 0);		
	}
	
	@Test 
	public void oneNegativeMultiplyTest(){
		Complex c = new Complex(-1,2);
		c = c.multiply(new Complex(-3, 4));
	    assertEquals(-5, c.realNum, 0);
	    assertEquals(-10, c.complexNum, 0);		
	}
	
	@Test 
	public void allNegativeMultiplyTest(){
		Complex c = new Complex(-1, -2);
		c = c.multiply(new Complex(-3, -4));
	    assertEquals(-5, c.realNum, 0);
	    assertEquals(10, c.complexNum, 0);		
	}

	@Test 
	public void divisionTest(){
		Complex c = new Complex(1,2);
		c = c.divide(new Complex(3, 4));
	    assertEquals(0.44, c.realNum, .00001);
	    assertEquals(0.08, c.complexNum, .00001);		
	}
	
	@Test 
	public void oneNegativeDivisionTest(){
		Complex c = new Complex(-1,2);
		c = c.divide(new Complex(-3, 4));
	    assertEquals(0.44, c.realNum, .00001);
	    assertEquals(-0.08, c.complexNum, .00001);		
	}
	
	@Test 
	public void allNegativeDivisionTest(){
		Complex c = new Complex(-1,-2);
		c = c.divide(new Complex(-3, -4));
	    assertEquals(0.44, c.realNum, .00001);
	    assertEquals(0.08, c.complexNum, .00001);		
	}
	
	@Test 
	public void toStringTest(){
		Complex c = new Complex(1,2);
	    assertEquals("1.0+2.0i", c.toString());
	}
	
	@Test 
	public void negativeToStringTest(){
		Complex c = new Complex(-1,-2);
	    assertEquals("-1.0-2.0i", c.toString());
	}
}
