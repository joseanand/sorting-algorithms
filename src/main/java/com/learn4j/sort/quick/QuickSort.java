/**
 * 
 */
package com.learn4j.sort.quick;

import com.learn4j.sort.intf.Sorting;
import com.learn4j.sort.utils.IntegerUtility;

/**
 * Quick sory implementation.
 * Partition the list with an nth item.  
 * All less values at left and greater values at right.
 * First item is k, i=k+1 and j=Nth
 * i iterates from left to right and see if there are 
 * any greater element if there are any greater element 
 * than k, then iterate j from right to left to identify 
 * if there are any possible lesser element to swap with i
 * Recursively iterates the list.
 * @memoryusage in-place
 * @worstcase o(n^2)
 * @author Jose Anand Antony Raj
 *
 */
public class QuickSort implements Sorting {

	/* (non-Javadoc)
	 * @see com.learn4j.sort.intf.Sorting#sort(int[])
	 */
	public void sort(int[] a) {
		IntegerUtility.printArray(a, "Quick Sort Before: ");
		//shuffle(a);
		sort (a, 0, a.length-1);
		IntegerUtility.printArray(a, "Quick Sort After: ");
		
	}

	/**
	 * Sort.
	 *
	 * @param a the a
	 * @param lo the lo
	 * @param i the i
	 * @param j the j
	 */
	private void sort(int[] a, int lo, int hi) {
		if (hi <= lo) {
			return;
		}
		int iPartition = partition (a, lo, hi);
		sort(a, lo, iPartition-1);
		sort(a, iPartition+1, hi);
	}

	/**
	 * Partition.
	 *
	 * @param a the a
	 * @param lo the lo
	 * @param hi the hi
	 * @return the int
	 */
	private int partition(int[] a, int lo, int hi) {
		int i = lo +1, j = hi;
		while (i <= j) {
			if (a[i] < a[lo]) {
				i++;
				continue;
			} else {
				while (a[j] > a[lo] && i <= j) {
					j--;
				}
				if(a[j] < a[lo] && i < j) {
					IntegerUtility.swap(a, i, j);
					i++;
					continue;
				}
			}
		}
		IntegerUtility.swap(a, lo, j);
		return j;
	}
	
	
	

}
