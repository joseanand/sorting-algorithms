/**
 * 
 */
package com.learn4j.sort.insertion;

import com.learn4j.sort.intf.Sorting;
import com.learn4j.sort.utils.IntegerUtility;

/**
 * Insertion sort implementation.
 * Iterate through the items and if a smaller element is 
 * found then move it to the right one by one until it 
 * finds the right spot.
 * @memoryusage In-place
 * @worstcase o(N^2)
 * @author Jose Anand Antony Raj
 *
 */
public class InsertionSort implements Sorting {
	
	public void sort(int[] a) {
		IntegerUtility.printArray(a, "Insertion Sort Before: ");
		for (int i=0; i<a.length-1; i++) {
			for (int j=i; j>=0; j--) {
				if (a[j]>a[j+1]) {
					a = IntegerUtility.swap (a, j, j+1);
				}
			}
		}
		IntegerUtility.printArray(a, "Insertion Sort After: ");
	}

	
	
	
}
