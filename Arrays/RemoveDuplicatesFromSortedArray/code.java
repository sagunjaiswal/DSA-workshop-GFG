/*
gfg : https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1


Given a sorted array A of size N, delete all the duplicates elements from A.


Example 1:

Input:
N = 5
Array = {2, 2, 2, 2, 2}
Output: 2
Explanation: After removing all the duplicates 
only one instance of 2 will remain.

Example 2:

Input:
N = 3
Array = {1, 2, 2}
Output: 1 2 

Your Task:  
You dont need to read input or print anything. Complete the function remove_duplicate() which takes the array A[] and its size N as input parameters and modifies it in place to delete all the duplicates. The function must return an integer X denoting the new modified size of the array. 
Note: The generated output will print all the elements of the modified array from index 0 to X-1.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 <= N <= 10^4
1 <= A[i] <= 10^6
*/


class Solution {
    int remove_duplicate(int arr[],int n){
        // code here
        if(n==0 || n==1)
            return n;
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i] != arr[i+1])
                arr[j++] = arr[i];
        }
        arr[j++] = arr[n-1];
        return j;
   }
}
