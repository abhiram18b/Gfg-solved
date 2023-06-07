//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String arr[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(arr[0]);
            int k = Integer.parseInt(arr[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.kthPrime(n, k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int kthPrime(int n, int k){
        // code here
        if(n==0) return -1;
        int count=0;
        while(n%2==0)
        {
            
            count++;
            if(count==k)
            {
                return 2;
            }
            n=n/2;
        }
        for(int i=3;i<=n;i=i+2)
        {
            while(n%i==0)
            {
                count++;
                if(count==k) return i;
                n=n/i;
            }
        }
        return -1;
        
    }
}