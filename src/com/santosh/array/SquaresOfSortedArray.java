package com.santosh.array;

import java.util.Arrays;

/**
 * @author santoshbk
 *
 */
public class SquaresOfSortedArray {
	public static int[] sortedSquares1(final int[] nums) {
		final int[] sq = new int[nums.length];
		int i = 0;
		for (final int a : nums) {
			sq[i++] = Math.abs(a);
		}
		Arrays.sort(sq);
		for (int j = 0; j < sq.length; j++) {
			sq[j] = sq[j] * sq[j];
		}
		return sq;
	}

	public static int[] sortedSquares(final int[] nums) {
		final int[] sq = new int[nums.length];
		int begin = 0;
		int end = nums.length - 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[begin] * nums[begin] > nums[end] * nums[end]) {
				sq[i] = nums[begin] * nums[begin];
				begin++;
			} else {
				sq[i] = nums[end] * nums[end];
				end--;
			}
		}
		return sq;
	}

	public static void main(final String[] args) {
		final int[] arr = { -4, -3, -2, -1, 0 };
		printArr(sortedSquares(arr));
		final int[] arr1 = { -7, -6, -5, -4, -1 };
		printArr(sortedSquares(arr1));
		final int[] arr4 = { -4, -3, -2, -1 };
		printArr(sortedSquares(arr4));

		final int[] arr2 = { -4, -1, 0, 3, 10 };
		printArr(sortedSquares(arr2));
		final int[] arr3 = { -7, -3, 2, 3, 11 };
		printArr(sortedSquares(arr3));

	}

	public static void printArr(final int[] arr) {
		for (final int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
