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
 * IsEvenNumberTest //Verifying is number even or not?
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
@RunWith(Parameterized.class)
public class IsEvenNumberTest {
	private IsEvenNumber en;
	
	@Before
	public void initialize() {
		en = new IsEvenNumber();
	}
	
	@Parameter(value = 0)
	public Integer inputNumber;
	
	@Parameter(value = 1)
	public Boolean expectedResult;
	
	@Parameters(name = "Iteration # {index}: Number: {0}; IsEven? {1}")
	public static Collection<Object[]> evenNumbers() {
		Object[][] data = new Object[][] {
		{ -3234111 , false } ,
		{ -15234 , true } ,
		{ 0 , true } ,
		{ 1 , false } ,
		{ 189 , false } ,
		{ 22355 , false } ,
		{ 345570 , true } ,
		{ 8865776 , true } ,
		{ 5534403 , false } ,
		{ 63554432 , true } ,
		{ 236345649 , false } 
	};
	
	return Arrays.asList(data);
	
}
	
	@Test
	public void evenNumberChecker() {
		System.out.println("Is " + inputNumber + " an even number? - " + expectedResult);
		assertEquals(expectedResult, en.isEvenNumberValidate(inputNumber));
	}
		
}
