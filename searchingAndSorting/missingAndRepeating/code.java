/*

GFG : https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1#

Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.

Example 1:

Input:
N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and 
smallest positive missing number is 1.
Example 2:

Input:
N = 3
Arr[] = {1, 3, 3}
Output: 3 2
Explanation: Repeating number is 3 and 
smallest positive missing number is 2.
Your Task:
You don't need to read input or print anything. Your task is to complete the function findTwoElement() which takes the array of integers arr and n as parameters and returns an array of integers of size 2 denoting the answer ( The first index contains B and second index contains A.)

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 10^5
1 ≤ Arr[i] ≤ N
*/

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        //WORKS WITH EXTRA SPACE
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // int[] res = new int[2];
        // int max = arr.length;
        // for(int i=0;i<arr.length;i++)
        //     hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        // for(Map.Entry<Integer, Integer> i : hm.entrySet()){
        //     if(i.getValue() > 1)
        //         res[0] = i.getKey();
        // }
        // for (int i = 1; i <= max; i++) {
        //     if (hm.get(i) == null) {
        //         res[1] = i;
        //     }
        // }
        // return res;
        
        //WORKS WITHOUT USING EXTRA SPACE
        int [] res = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                res[0] = abs_val;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                res[1] = i+1;
        }
        return res;
    }
}
