package com.santosh.array;

/**
 * @author santoshbk
 *
 */
public class Consecutive1s {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 1, 1, 1 };
		System.out.println(findMaxConsecutiveOnes(arr));
		int[] arr1 = { 1, 0, 1, 1, 0, 1 };
		System.out.println(findMaxConsecutiveOnes(arr1));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int count = 0;
		for (int i : nums) {
			if (i == 1) {
				count++;
			} else {
				max = count < max ? max : count;
				count = 0;
			}
		}
		max = count < max ? max : count;
		return max;
	}
}
