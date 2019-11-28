
package jjunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Calculatortest2 {

	private Calculator c;
	
	@BeforeEach
 public  void createObj() {

		c=new Calculator();
	 
	 
	}
	@Test
	public void test() {
		
 
		int res=c.add(10, 20);
		assertEquals(res,30);
	}
	
	@Test
	public void testDiv() {
		
		int res=c.div(100, 20);
		assertEquals(res,5);
	}
	
	@Test
	@Disabled
	public void testDivForException() {
	 
		assertThrows(ArithmeticException.class, ()->c.div(10, 0));
	}
// jar junit-jupiter-engine
	// jar junit-jupiter-api	
}
