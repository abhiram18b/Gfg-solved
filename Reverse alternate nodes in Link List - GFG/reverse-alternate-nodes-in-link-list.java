//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static void rearrange(Node odd)
    {
        // add your code here
        Node newNode = new Node(-1);
        Node currNode=newNode;
        Node temp=odd;
        while(temp!=null && temp.next!=null)
        {
            
            if(temp.next!=null) currNode.next= new Node(temp.next.data);
            currNode=currNode.next;
            temp.next=temp.next.next;
            temp=temp.next;
        }
        Node last = reverse(newNode.next);
        temp=odd;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=last;
        
    
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
        return prev;
        
    }
}
