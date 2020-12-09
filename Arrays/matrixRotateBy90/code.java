/*
GFG : https://practice.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1/?track=dsa-workshop-1-matrix&batchId=308#

Given a square matrix of size N x N. The task is to rotate it by 90 degrees in anti-clockwise direction without using any extra space. 

Example 1:

Input:
N = 3 
matrix[][] = {{1, 2, 3},
              {4, 5, 6}
              {7, 8, 9}}
Output: 
Rotated Matrix:
3 6 9
2 5 8
1 4 7
Example 2:

Input:
N = 2
matrix[][] = {{1, 2},
              {3, 4}}
Output: 
Rotated Matrix:
2 4
1 3

Your Task:
You dont need to read input or print anything. Complete the function rotateby90() which takes the matrix as input parameter and rotates it by 90 degrees in anti-clockwise direction without using any extra space. You have to modify the input matrix in-place. 

Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 100
1 <= matrix[][] <= 1000
*/

class Solution{
    static void rotateby90(int matrix[][], int n) 
    { 
        // code here
        //convert it to transpose of a matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse the columns of matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0, k = matrix[0].length - 1; j < k; j++, k--) { 
                int temp = matrix[j][i]; 
                matrix[j][i] = matrix[k][i]; 
                matrix[k][i] = temp; 
            }
        }
    }
}
