package com.santosh.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author santoshbk
 *
 */
public class CheckIfNDoubleExit {

	public static void main(final String[] args) {
		final int[] arr1 = { 7, 1, 14, 11 };
		System.out.println(checkIfExist(arr1));
		final int[] arr3 = { -20, 8, -6, -14, 0, -19, 14, 4 };
		System.out.println(checkIfExist(arr3));
		final int[] arr = { 10, 2, 5, 3 };
		System.out.println(checkIfExist(arr));
		final int[] arr2 = { 3, 1, 7, 11 };
		System.out.println(checkIfExist(arr2));
	}

	public static boolean checkIfExist(final int[] arr) {
		final Set<Integer> set = new HashSet<>();
		for (final int a : arr) {
			if (set.contains(2 * a)) {
				return true;
			} else {
				if (a % 2 == 0 && set.contains(a / 2)) {
					return true;
				}
			}
			set.add(a);
		}
		return false;
	}

	// Alternative and better code
	public boolean checkIfExist1(final int[] arr) {
		final Set<Integer> set = new HashSet<>();
		final int len = arr.length;
		for (int i = 0; i < len; i++) {
			final int x = arr[i];
			if (set.contains(x * 2) || (x % 2 == 0 && set.contains(x / 2))) {
				return true;
			}
			set.add(x);
		}
		return false;
	}
}
