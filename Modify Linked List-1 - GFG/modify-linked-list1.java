//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {
            int n=Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            Node head=new Node(Integer.parseInt(s[0]));
            Node copy=head;
            for(int i=1;i<n;i++){
                Node temp=new Node(Integer.parseInt(s[i]));
                copy.next=temp;
                copy=copy.next;
            }
            Solution ob=new Solution();
            Node ans=ob.modifyTheList(head);
            while(ans!=null){
                out.print(ans.data+" ");
                ans=ans.next;
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public static Node modifyTheList(Node head)
    {
      
    //   System.out.println(n);
       Node slow=head;
       Node fast=head;
    //   Node prev=null;
       while(fast!=null && fast.next!=null)
       {
        //   prev=slow;
           slow=slow.next;
           fast=fast.next.next;
       }
       Node mid=slow;
       Node shalf=reverse(mid);
       Node currNode=head;
       Node temp=shalf;
       while(temp!=null)
       {
           int val=currNode.data;
           currNode.data=temp.data-val;
           temp.data=val;
           temp=temp.next;
           currNode=currNode.next;
       }
        shalf=reverse(shalf);
        slow=shalf;
        
       return head;
    }
    public static Node reverse(Node head)
    {
        Node currNode=head;
        Node prev=null;
        while(currNode!=null)
        {
            Node forward=currNode.next;
            currNode.next=prev;
            prev=currNode;
            currNode=forward;
        }
        // head=prev;
        return prev;
        
    }
    
}