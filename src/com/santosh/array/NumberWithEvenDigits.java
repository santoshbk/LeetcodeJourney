/**
 * 
 */
package com.santosh.array;

/**
 * @author santoshbk
 *
 */
public class NumberWithEvenDigits {
	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };
		System.out.println(findNumbers(nums));
		int[] nums1 = { 555, 901, 482, 1771 };
		System.out.println(findNumbers(nums1));
	}

	public static int findNumbers(int[] nums) {
		int count = 0;
		for (int i : nums) {
			int d = getDigits(i);
			if (d != 0 && d % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	private static int getDigits(int i) {
		int d = 0;
		while (i != 0) {
			i /= 10;
			d++;
		}
		return d;
	}
}
