/**
 *   File Name: AllTests.java<br>
 *
 *   Yutaka<br>
 *   Created: Apr 8, 2016
 *   
 */

package org.numbers.B40.isNumber;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * AllTests for verify methods in 5 classes class
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ 
	IsArmstrongNumberTest.class, 
	IsEvenNumberTest.class, 
	IsOddNumberTest.class, 
	IsPerfectNumberTest.class,
	IsPrimeNumberTest.class })
public class AllTests {

}
