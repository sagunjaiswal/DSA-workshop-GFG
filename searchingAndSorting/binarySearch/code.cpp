/*
gfg : https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1/?track=dsa-workshop-1-search-sort&batchId=308#

Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.


Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.

Example 2:

Input:
N = 5
arr[] = {11 22 33 44 55} 
K = 445
Output: -1
Explanation: 445 is not present.

Your Task:  
You dont need to read input or print anything. Complete the function binarysearch() which takes arr[], N and K as input parameters and returns the index of K in the array. If K is not present in the array, return -1.


Expected Time Complexity: O(LogN)
Expected Auxiliary Space: O(LogN) if solving recursively and O(1) otherwise.


Constraints:
1 <= N <= 10^4
1 <= arr[i] <= 10^4
*/

int bin_search(int A[], int left, int right, int k)
{
    while(left<=right){
        int mid = (left+right)/2;
        if(k>A[mid])
            left = mid+1;
        else if(k<A[mid])
            right = mid-1;
        else
            return mid;
    }
    return -1;
}
