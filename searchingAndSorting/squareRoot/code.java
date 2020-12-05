/*

gfg : 

Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).

 

Example 1:

Input:
x = 5
Output: 2
Explanation: Since, 5 is not a perfect 
square, floor of square_root of 5 is 2.
 

Example 2:

Input:
x = 4
Output: 2
Explanation: Since, 4 is a perfect 
square, so its square root is 2.
 

Your Task:
You don't need to read input or print anything. The task is to complete the function floorSqrt() which takes x as the input parameter and return its square root.

 

Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)

 

Constraints:
1 ≤ x ≤ 10^7
*/

class SquareRoot
{
     long floorSqrt(long n)
	 {
		// Your code here
    //GIVES CORRECT ANS
// 		return (int)Math.sqrt(x);
//CORRECT 
        if(n==0 || n==1)
            return n;
        
        long start = 1, end = n , res = 0;
        
        while(start<=end){
            long mid = start + (end-start)/2;
            
            if(mid * mid == n)
                return mid;
            else if(mid * mid < n){
                start = mid + 1;
                res = mid;
            }
            else
                end = mid - 1;
        }
        return res;
	 }
}
