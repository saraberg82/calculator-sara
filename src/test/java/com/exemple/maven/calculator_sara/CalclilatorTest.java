package com.exemple.maven.calculator_sara;

import static org.junit.Assert.*;

import org.junit.Test;



public class CalclilatorTest {
	Calculator calculator= new Calculator();

	@Test
	public void testAddition() {
			assertEquals(calculator.addition(2, 2) ,4, 0);
		}
	@Test
	public void testSubtraction() {
			assertEquals(calculator.subtraction(2, 2) ,0, 0);
		}
	@Test
	public void testDevition() {
			assertEquals(calculator.devition(2, 2) ,1, 0);
		}
	@Test
	public void testMultiplication() {
			assertEquals(calculator.multiplication(2, 2) ,4, 0);
		}
	

}
