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
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        //code here
        ArrayList<String> al = new ArrayList<>();
        
        for(String str : Dictionary)
        {
            // int flag=0;
            String ans="";
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(Character.isUpperCase(ch))
                {
                    ans+=str.charAt(i);
                }
                
                if(ans.equals(Pattern))
                {
                //   System.out.print(ans+" ");
                  al.add(str);
                  break;
                }
            }
            
        }
        if(al.size()==0) 
        {
            al.add("-1");
        }
        Collections.sort(al);
        return al;
    }
}