/**
 *   File Name: IsPrimeNumber.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 28, 2016
 *   
 */

package org.numbers.B40.isNumber;

/**
 * IsEvenNumber for verify is number Prime or not
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class IsPrimeNumber {
	public Boolean isPrimeNumberValidate(final Integer num) {
		
		if (num == 4) {
			return false;
		}
		
		for (int i = 2; i < (num / 2); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}