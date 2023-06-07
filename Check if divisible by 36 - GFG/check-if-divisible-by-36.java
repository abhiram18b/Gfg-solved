//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.checkDivisible36(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int checkDivisible36(String S){
        // code here
        int n=S.length();
        if(n==1 && (S.charAt(0)-'0')%4==0 && (S.charAt(0)-'0')%9==0 ) return 1;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=S.charAt(i)-'0';
        }
        int num=(S.charAt(n-2)-'0')*10+S.charAt(n-1);
        if(num%4==0 && sum%9==0) return 1;
        return 0;
    }
}