//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.Count(matrix);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int  Count(int[][] matrix)
    {
        // code here
        int res = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int[] drow = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dcol = {0, 1, 1, 1, 0, -1, -1, -1};
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) continue;
                int zero = 0;
                for(int k = 0; k < 8; k++) {
                    int nrow = i+drow[k];
                    int ncol = j+dcol[k];
                    if(ncol >= 0 && nrow >= 0 && ncol < m && nrow < n && matrix[nrow][ncol] == 0) zero++;
                }
                if(zero > 0 && zero % 2 == 0) res++;
            }
        }
        return res;
    }
}