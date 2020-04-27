/**
 * 
 */
package com.learn4j.sort.merge;

import com.learn4j.sort.intf.Sorting;
import com.learn4j.sort.utils.IntegerUtility;

/**
 * Merge sort implementation
 * Divide the array into 2 halves, 
 * sort the left and right recursively 
 * and merge the elements using a 
 * auxillary array.
 * @memoryusuage auxillary array
 * @worstcase nlogn
 * @author Jose Anand Antony Raj
 *
 */
public class MergeSort implements Sorting {
	
	/**
	 * Merges 2 halves and 
	 * replaces the original array.
	 *
	 * @param a the a
	 * @param aux the aux
	 * @param lo the lo
	 * @param mid the mid
	 * @param hi the hi
	 */
	private void merge(int[] a, int[] aux, int lo, int mid, int hi) {
		for (int k = lo; k<= hi; k++) {
			aux[k] = a[k];
		}
		int i = lo, j = mid+1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				a[k] = aux[j];
				j++;
			} else if (j > hi) {
				a[k] = aux[i];
				i++;
			} else if (aux[i] > aux[j]) {
				a[k] = aux[j];
				j++;
			} else if (aux[j] > aux[i]) {
				a[k] = aux[i];
				i++;
			}
		}
	}
	
	/**
	 * Sort.
	 *
	 * @param a the a
	 * @param aux the aux
	 * @param lo the lo
	 * @param hi the hi
	 */
	private void sort (int[] a, int[] aux, int lo, int hi) {
		if (hi <= lo) {
			return;
		}
		int mid = lo + (hi - lo) / 2;
		sort (a, aux, lo, mid);
		sort (a, aux, mid+1, hi);
		merge(a, aux, lo, mid, hi);
	}
	
	/* (non-Javadoc)
	 * @see com.learn4j.sort.intf.Sorting#sort(int[])
	 */
	public void sort (int[] a) {
		IntegerUtility.printArray(a, "Merge Sort Before: ");
		int[] aux = new int[a.length];
		sort (a, aux, 0, a.length-1);
		IntegerUtility.printArray(a, "Merge Sort After: ");
	}

}
