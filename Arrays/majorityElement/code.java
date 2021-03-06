/*

GFG : https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1#

Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.

Example 1:

Input:
N = 3 
A[] = {1,2,3} 
Output: -1

Explanation: Since, each element in 
{1,2,3} appears only once so there 
is no majority element.
Example 2:

Input:
N = 5 
A[] = {3,1,3,3,2} 
Output: 3
Explanation: Since, 3 is present 
more than N/2 times, so it is 
the majority element.
Your Task:
The task is to complete the function majorityElement() which returns the majority element in the array. If no majority exists, return -1.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 10^7
0 <= Ai <= 10^6

*/

class Majority{
    static int majorityElement(int arr[], int size){
        //WORKS WITH O(N) EXTRA SPACE
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // for(int i=0;i<arr.length;i++)
        //     hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        // int majorityCount = (int)(size/2);
        // int majorityElement = -1;
        // for(Map.Entry<Integer, Integer> i : hm.entrySet()){
        //     if(i.getValue() > majorityCount)
        //         majorityElement = i.getKey();
        // }
        // return majorityElement;
        //MOORE'S ALGO WITHOUT THE EXTRA SPACE
        int maj_index = 0, count = 1;
        
        for (int i = 1; i < size; i++) {
            if (arr[maj_index] == arr[i])
                count++;
            else
                count--;
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == arr[maj_index])
                count++;
        }
        if(count > size/2)
            return arr[maj_index];
        return -1;
    }
}
