/**
 *   File Name: IsPerfectNumber.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 28, 2016
 *   
 */

package org.numbers.B40.isNumber;

/**
 * IsEvenNumber for verify is number Perfect or not
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class IsPerfectNumber {
	public boolean isPerfectNumberValidate(final Integer num) {
		int temp = 0;
		for (int i = 1; i <= (num / 2); i++) {
			if (num % i == 0) {
				temp += i;
			}
		}
		if (temp == num) {
			return true;
		}
		else {
			return false;
		}
	}
}