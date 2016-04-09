/**
 *   File Name: IsOddNumber.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 28, 2016
 *   
 */

package org.numbers.B40.isNumber;

/**
 * IsEvenNumber for verify is number Odd or not
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class IsOddNumber {
	public Boolean isOddNumberValidate(final Integer num) {
		boolean result = false;
		if (num % 2 != 0) {
			result = true;
		}
		return result;
	}
}