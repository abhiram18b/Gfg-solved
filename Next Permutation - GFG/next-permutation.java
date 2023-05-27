//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        List<Integer> al= Arrays.asList(new Integer[N]);
        int ind=-1;
        for(int i=N-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1]) 
            {
                ind=i;
                break;
            }
        }
        
        if(ind==-1)
        {
            for(int i=0;i<N;i++)
           {
            al.set(i,arr[i]);
            }
            Collections.reverse(al);
            return al;
        }
        int min=Integer.MAX_VALUE;
        int big=0;
        for(int i=N-1;i>ind;i--)
        {
            if(arr[i]>arr[ind] && Math.abs(arr[i]-arr[ind])<min)
            {
                
                big=i;
                
                min=Math.abs(arr[i]-arr[ind]);
            }
        }
        int temp=arr[ind];
        arr[ind]=arr[big];
        arr[big]=temp;
        int mid=ind+1,end=N-1;
        while(mid<end)
        {
             temp=arr[mid];
             arr[mid]=arr[end];
             arr[end]=temp;
             mid++;
             end--;
        }
        for(int i=0;i<N;i++)
        {
            al.set(i,arr[i]);
        }
        return al;
    }
}