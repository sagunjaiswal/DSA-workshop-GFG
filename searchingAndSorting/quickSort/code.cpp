/*
gfg : https://practice.geeksforgeeks.org/problems/quick-sort/1/?track=dsa-workshop-1-search-sort&batchId=308#

Quick Sort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot.

Given an array arr[], its starting position low and its ending position high. Quick Sort is achieved using the following algorithm. 

quickSort(arr[], low, high)
{
    if (low < high)
    {
        /* pi is partitioning index, 
           arr[pi] is now at right place */
        pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);  // Before pi
        quickSort(arr, pi + 1, high); // After pi
    }
}
Implement the partition() function used in quickSort().


Example 1:

Input: 
N = 5 
arr[] = { 4, 1, 3, 9, 7}
Output: 1 3 4 7 9


Example 2:

Input:
N = 10
arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output: 1 2 3 4 5 6 7 8 9 10

Your Task: 
You don't need to read input or print anything. Your task is to complete the function partition() which takes the array arr[], low and high as input parameters and partitions the array. Consider the last element as the pivot such that all the elements less than(or equal to) the pivot lie before it and the elements greater than it lie after the pivot. 


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 <= N <= 10^3
1 <= arr[i] <= 10^4
*/

void swap(int* a, int* b)  
{  
    int t = *a;  
    *a = *b;  
    *b = t;  
} 
int partition (int arr[], int low, int high)  
{  
    int pivot = arr[high]; // pivot  
    int i = (low - 1); // Index of smaller element  
  
    for (int j = low; j <= high - 1; j++)  
    {  
        // If current element is smaller than the pivot  
        if (arr[j] < pivot)  
        {  
            i++; // increment index of smaller element  
            swap(&arr[i], &arr[j]);  
        }  
    }  
    swap(&arr[i + 1], &arr[high]);  
    return (i + 1);  
} 
