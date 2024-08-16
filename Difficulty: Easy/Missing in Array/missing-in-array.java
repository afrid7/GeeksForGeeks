//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(n, arr));
        }
    }
}
// } Driver Code Ends

class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

    
        int sum=(n*(n+1))/2;
        int sum2=0;

        for(int i=0; i<n-1;i++){
            sum2=sum2+arr[i];
        }

        int missingNo=sum-sum2;
        return missingNo;
    }
}

