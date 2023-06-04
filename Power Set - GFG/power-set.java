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
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
   
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        String curr="";
        List<String> li = new ArrayList<>();
        subseq(s,curr,li,0);
        Collections.sort(li);
        return li;
    }
    public static void subseq(String s,String curr,List<String> li,int i)
    {
        
        if(i>=s.length())
        {
            if(curr.length()!=0)
             li.add(curr);
            return ;
        }
        subseq(s,curr+s.charAt(i),li,i+1);
        subseq(s,curr,li,i+1);
    }
}