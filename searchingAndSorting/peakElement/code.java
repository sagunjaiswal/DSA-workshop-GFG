/*
gfg : https://practice.geeksforgeeks.org/problems/peak-element/1/?track=dsa-workshop-1-search-sort&batchId=308#


A peak element in an array is the one that is not smaller than its neighbours.
Given an array of size N, find the index of any one of its peak elements.
 

Example 1:

Input:
N = 3
arr[] = {1,2,3}
Output: 2 
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
 

Example 2:

Input:
N = 2
arr[] = {3,4}
Output: 1
Explanation: 4 (at index 1) is the 
peak element as it is greater than 
its only neighbour element 3.
 

Your Task:
You don't have to read input or print anything. Complete the function peakElement() which takes the array arr[] and its size N as input parameters and return the index of any one of its peak elements.
Note: The generated output will be 1 if the index that you return is correct. Otherwise output will be 0. 

 

Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 10^5
1 <= A[] <= 10^6
*/

int peakElement(int arr[], int n)
{
   // Your code here
   if(n==1)
    return arr[0];
  if(arr[0]>arr[1])
        return 0;
    if(arr[n-1]>=arr[n-2])
        return n-1;
    int lo = 0;
    int hi = n-1;
    while(lo<=hi){
        int mid = (lo+hi)/2;
        if(arr[mid+1]<=arr[mid] && arr[mid]>=arr[mid-1])
            return mid;
        else if(arr[mid+1]>=arr[mid])
            lo = mid+1;
        else if(arr[mid-1]>=arr[mid])
            hi = mid-1;
    }
    return -1;
}
