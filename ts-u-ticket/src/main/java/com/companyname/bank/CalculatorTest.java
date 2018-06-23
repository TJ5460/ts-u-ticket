package com.companyname.bank;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
   public 	Calculator calculator ;
	@Before
	public void setUp() throws Exception {
		 this.calculator = new Calculator();
	}

	@Test
	public void testAdd() {
	
		calculator.add(22);
		System.out.println(calculator.getResult());
		
	}

	@Test
	public void testSubstract() {
	 calculator.divide(7);
	 System.out.println(calculator.getResult());
	}

}
