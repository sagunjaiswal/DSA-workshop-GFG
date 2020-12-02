/*
gfg :
Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

 

Example 1:

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.
 

Example 2:

Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9
 

Your Task:
You don't need to read input or print anything. The task is to complete the function reverseInGroups() which takes the array, N and K as input parameters and modifies the array in-place. 

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

 

Constraints:
1 ≤ N, K ≤ 10^7
1 ≤ A[i] ≤ 10^18

*/

class Solution {
    void reverseInGroups(ArrayList<Integer> arr, int n, int size) {
        // code here
        // int n = arr.size();
        for(int i=0;i<n;i+=size){
            int start = i;
            int end = Math.min((i+size-1), n-1);
            int temp;
            while(start <  end){
                temp = arr.get(start);
                arr.set(start,arr.get(end));
                arr.set(end,temp);
                start++;
                end--;
            }
            
        }
    }
}
OR
for (int i = 0; i < n; i += size) {
         int left = i;
         int right = Math.min(i + size - 1, n - 1);
         int temp;
         while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right -= 1;
         }
      }
