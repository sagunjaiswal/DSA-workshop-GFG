/*
gfg : https://practice.geeksforgeeks.org/problems/merge-sort/1/?track=dsa-workshop-1-search-sort&batchId=308#

Merge Sort is a Divide and Conquer algorithm. It repeatedly divides the array into two halves and combines them in sorted manner. 

Given an array arr[], its starting position l and its ending position r. Merge Sort is achieved using the following algorithm. 

MergeSort(arr[], l,  r)
    If r > l
         1. Find the middle point to divide 
            the array into two halves:  
                 middle m = (l+r)/2
         2. Call mergeSort for first half:   
                 Call mergeSort(arr, l, m)
         3. Call mergeSort for second half:
                 Call mergeSort(arr, m+1, r)
         4. Merge the two halves sorted in 
            step 2 and 3:
                 Call merge(arr, l, m, r)
Implement the merge() function used in MergeSort().


Example 1:

Input:
N = 5
arr[] = {4 1 3 9 7}
Output: 1 3 4 7 9

Example 2:

Input:
N = 10
arr[] = {10 9 8 7 6 5 4 3 2 1}
Output: 1 2 3 4 5 6 7 8 9 10

Your Task:
You don't need to take the input or print anything. Your task is to complete the function merge() which takes arr[], l, m, r as its input parameters and modifies arr[] in-place such that it is sorted from position l to position r. 
Assume that the range [l,m] and [m+1,r] are already sorted.


Expected Auxiliary Space: O(n)
Expected Time Complexity: O(n) for the merge() function only.


Constraints:
1 <= N <= 10^5
1 <= arr[i] <= 10^3
*/

void merge(int arr[], int l, int m, int r) 
{ 
    int i, j, k; 
    int n1 = m - l + 1; 
    int n2 = r - m; 
  
    /* create temp arrays */
    int L[n1], R[n2]; 
  
    /* Copy data to temp arrays L[] and R[] */
    for (i = 0; i < n1; i++) 
        L[i] = arr[l + i]; 
    for (j = 0; j < n2; j++) 
        R[j] = arr[m + 1 + j]; 
  
    /* Merge the temp arrays back into arr[l..r]*/
    i = 0; // Initial index of first subarray 
    j = 0; // Initial index of second subarray 
    k = l; // Initial index of merged subarray 
    while (i < n1 && j < n2) { 
        if (L[i] <= R[j]) { 
            arr[k] = L[i]; 
            i++; 
        } 
        else { 
            arr[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 
  
    /* Copy the remaining elements of L[], if there 
       are any */
    while (i < n1) { 
        arr[k] = L[i]; 
        i++; 
        k++; 
    } 
  
    /* Copy the remaining elements of R[], if there 
       are any */
    while (j < n2) { 
        arr[k] = R[j]; 
        j++; 
        k++; 
    } 
}
