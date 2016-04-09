/**
 *   File Name: IsArmstrongNumber.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 28, 2016
 *   
 */

package org.numbers.B40.isNumber;

/**
 * IsEvenNumber for verify is number Armstrong or not
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class IsArmstrongNumber {
	public boolean isArmstrongNumberValidate(Integer num) {
		int result = 0;
		int orig = num;
		if (num < 100) {
			return false;
		}
		while (num != 0) {
			int remainder = num % 10;
			// result = result + remainder * remainder * remainder
			result = result + ((int) Math.pow(remainder, 3));
			num = (num / 10);
		}
		if (orig == result) {
			return true;
		}
		return false;
	}
}