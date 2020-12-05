/*
gfg : https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1/?track=dsa-workshop-1-search-sort&batchId=308

Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output: 0 0 1 2 2
Explanation: 0s 1s and 2s are segregated 
into ascending order.
 

Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output: 0 0 1
Explanation: 0s 1s and 2s are segregated 
into ascending order.

Your Task:
You don't need to read input or print anything. Your task is to complete the function sort012() that takes array and n as input parameters and sorts the array in-place. 


Expected Time Complexity: O(nLogn)
Expected Auxiliary Space: O(n)

 

Constraints:
1 <= N <= 10^5
0 <= A[i] <= 2
*/

void sort012(int a[], int n)
{
    // coode here 
    int zeros=0,ones=0,twos=0;
    int i;
    for(i=0;i<n;i++){
        if(a[i]==0)
            zeros++;
        else if(a[i]==1)
            ones++;
        else if(a[i]==2)
            twos++;
    }
    i=0;
    while(zeros>0){
        zeros--;
        a[i]=0;
        i++;
    }
    while(ones>0){
        ones--;
        a[i]=1;
        i++;
    }
    while(twos>0){
        twos--;
        a[i]=2;
        i++;
    }
    return;
}
