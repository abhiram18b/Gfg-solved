//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution
{
    public int[] AllPrimeFactors(int N)
    {
        // code here
        int arr[]=new int[N+1];
        Arrays.fill(arr,1);
        for(int i=2;i<=Math.sqrt(N);i++)
        {
            for(int j=i*i;j<=N;j+=i)
            {
                if(arr[j]==1)
                {
                    arr[j]=0;
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
         for(int i=2;i<=N;i++)
        {
            if(arr[i]==1 && N%i==0)
            {
                al.add(i);
            }
        }
        int prime[]=new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            prime[i]=al.get(i);
        }
        return prime;
        
    }
   
    
}