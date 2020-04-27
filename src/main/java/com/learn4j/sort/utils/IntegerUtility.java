/**
 * 
 */
package com.learn4j.sort.utils;

import java.util.Random;

/**
 * @author Jose Anand Antony Raj
 *
 */
public class IntegerUtility {

	public static void printArray (int [] a, String msg) {
		StringBuffer sb = new StringBuffer();
		sb.append(msg);
		for (int i=0; i< a.length; i++) {
			sb.append(a[i] + " ");
		}
		System.out.println(sb);
	}
	
	public static int[] swap(int[] a, int j, int k) {
		int temp = a[k];
		a[k] = a[j];
		a[j] = temp;
		return a;
	}
	
	public static void shuffle (int[] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			int randomIndexToSwap = rand.nextInt(a.length);
			swap(a, i, randomIndexToSwap);
		}
	}
	
}
