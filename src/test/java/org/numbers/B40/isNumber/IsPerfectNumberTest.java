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
 * IsPerfectNumberTest 
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
@RunWith(Parameterized.class)
public class IsPerfectNumberTest {
	private IsPerfectNumber pfn;
	
	@Before
	public void initialize() {
		pfn = new IsPerfectNumber();
	}
	
	@Parameter(value = 0)
	public Integer inputNumber;
	
	@Parameter(value = 1)
	public Boolean expectedResult;
	
	@Parameters(name = "Iteration # {index}: Number: {0}; isPerfect? {1}")
	public static Collection<Object[]> perfectNumbers() {
		Object[][] data = new Object[][] {
			{ 2 , false } ,
			{ 6 , true } ,
			{ 28 , true } ,
			{ 153 , false } ,
			{ 496 , true } ,			
			{ 189 , false } ,
			{ 255 , false } ,
			{ 370 , false } ,
			{ 371 , false } ,
			{ 8128 , true } ,			
			{ 9294 , false } ,
			{ 33550336 , true } ,
			{ 135503363 , false } 
		};
		
		return Arrays.asList(data);
	
	}
	
	@Test
	public void perfectNumberChecker() {
		System.out.println("Is " + inputNumber + " a perfect number? - " + expectedResult);
		assertEquals(expectedResult, pfn.isPerfectNumberValidate(inputNumber));
	}
}
