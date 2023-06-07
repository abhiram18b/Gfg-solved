//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isKrishnamurthy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String isKrishnamurthy(int N) {
        // code here
        
                 int temp=N;
        int sum=0;
        
        while(temp>0)
        {
            int d=temp%10;
           
            int product=1;
            for(int i=1;i<=d;i++)
            {
                product*=i;
            }
            temp=temp/10;
            sum+=product;
        }
        
        if(sum==N) return "YES";
        else return "NO";
    }
};