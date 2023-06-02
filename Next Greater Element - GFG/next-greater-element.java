//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        ArrayList<Long> al = new ArrayList<>();
        Stack<Long> st = new Stack<>();
        st.push(arr[n-1]);
        al.add(Long.valueOf(-1));
         for(int i=n-2;i>=0;i--)
        {
             while(!st.isEmpty() && arr[i]>=st.peek()) 
             {
                st.pop();
             }
             if(st.isEmpty()) al.add(Long.valueOf(-1));
             else al.add(st.peek());
             st.push(arr[i]);
        }
         Collections.reverse(al);
        // System.out.println(al.size());
        long k=(long)al.size();
        
        long a[]=new long[(int)k];
        for(int i=0;i<(int)k;i++)
        {
            a[i]=al.get(i);
        }
        return a;
    } 
}