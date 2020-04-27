package com.learn4j.sort;

import com.learn4j.sort.insertion.InsertionSort;
import com.learn4j.sort.intf.Sorting;
import com.learn4j.sort.merge.MergeSort;
import com.learn4j.sort.quick.QuickSort;

/**
 * Sorting implementations!
 * @author Jose Anand
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int [] a = {2,3,9,5,1,4,7};
        Sorting is = new InsertionSort();
        is.sort(a);
        
        int [] b = {2,3,9,5,1,4,7};
        Sorting ms = new MergeSort();
        ms.sort(b);
        
        int [] c = {2,3,9,5,1,4,7};
        Sorting qs = new QuickSort();
        qs.sort(c);
    }
}
