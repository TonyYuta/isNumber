/**
 *   File Name: IsArmstrongNumberTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Apr 8, 2016
 *   
 */

package org.numbers.B40.isNumber;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * IsArmstrongNumberTest 
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
@RunWith(Parameterized.class)
public class IsArmstrongNumberTest {
	private IsArmstrongNumber an;
	
	@Before
	public void initialize() {
		an = new IsArmstrongNumber();
	}
	
	@Parameter(value = 0)
	public Integer inputNumber;
	
	@Parameter(value = 1)
	public Boolean expectedResult;
	
	@Parameters(name = "Iteration # {index}: Number: {0}; isArmstrong? {1}")
	public static Collection<Object[]> armstrongNumbers() {
		Object[][] data = new Object[][] {
			{ 2 , false } ,
			{ 92 , false } ,
			{ 111 , false } ,
			{ 153 , true } ,
			{ 189 , false } ,
			{ 255 , false } ,
			{ 370 , true } ,
			{ 371 , true } ,
			{ 400 , false } ,
			{ 407 , true } ,
			{ 408 , false } 
		};
		
		return Arrays.asList(data);
	
	}
	
	@Test
	public void armstrongNumberChecker() {
		System.out.println("Is " + inputNumber + " an Armstrong number? - " + expectedResult);
		assertEquals(expectedResult, an.isArmstrongNumberValidate(inputNumber));
	}
}
