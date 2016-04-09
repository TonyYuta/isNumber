/**
 *   File Name: IsEvenNumberTest.java<br>
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
 * IsOddNumberTest //Verifying is number odd or not?
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
@RunWith(Parameterized.class)
public class IsOddNumberTest {
	private IsOddNumber on;
	
	@Before
	public void initialize() {
		on = new IsOddNumber();
	}
	
	@Parameter(value = 0)
	public Integer inputNumber;
	
	@Parameter(value = 1)
	public Boolean expectedResult;
	
	@Parameters(name = "Iteration # {index}: Number: {0}; IsEven? {1}")
	public static Collection<Object[]> oddNumbers() {
		Object[][] data = new Object[][] {
		{ -32342110 , false } ,
		{ -152433 , true } ,
		{ 0 , false } ,
		{ 1 , true } ,
		{ 1892 , false } ,
		{ 223554 , false } ,
		{ 3455703 , true } ,
		{ 8857767 , true } ,
		{ 55340302 , false } ,
		{ 635543257 , true } ,
		{ 1363464912 , false } 
	};
	
	return Arrays.asList(data);
	
}
	
	@Test
	public void evenNumberChecker() {
		System.out.println("Is " + inputNumber + " an odd number? - " + expectedResult);
		assertEquals(expectedResult, on.isOddNumberValidate(inputNumber));
	}
		
}
