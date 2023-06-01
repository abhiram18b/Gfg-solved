//{ Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}


class MergeLists
{
    Node head;



  /* Function to print linked list */
   public static void printList(Node head)
    {
        
        while (head!= null)
        {
           System.out.print(head.data+" ");
           head = head.next;
        }  
        System.out.println();
    }
	
	 
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			Node head1 = new Node(sc.nextInt());
            Node tail1 = head1;
            for(int i=0; i<n1-1; i++)
            {
                tail1.next = new Node(sc.nextInt());
                tail1 = tail1.next;
            }
			Node head2 = new Node(sc.nextInt());
            Node tail2 = head2;
            for(int i=0; i<n2-1; i++)
            {
                tail2.next = new Node(sc.nextInt());
                tail2 = tail2.next;
            }
			
			LinkedList obj = new LinkedList();
			Node head = obj.sortedMerge(head1,head2);
			printList(head);
			
			t--;
			
         }
    }
}

// } Driver Code Ends


/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node newNode = new Node(-1);
     Node currNode=newNode;
     Node temp1=head1;
     Node temp2=head2;
     while(temp1!=null && temp2!=null)
     {
         int a=0,b=0;
         if(temp1!=null)
         {
             a=temp1.data;
         }
         if(temp2!=null)
         {
             b=temp2.data;
         }
         if(a<=b)
         {
             currNode.next=new Node(a);
             currNode=currNode.next;
             temp1=temp1.next;
         }
         else
         {
             currNode.next=new Node(b);
             currNode=currNode.next;
             temp2=temp2.next;
         }
     }
     if(temp2==null && temp1!=null)
     {
         while(temp1!=null)
         {
             currNode.next=new Node(temp1.data);
             currNode=currNode.next;
             temp1=temp1.next;
         }
     }
     else if(temp1==null && temp2!=null)
     {
          while(temp2!=null)
         {
             currNode.next=new Node(temp2.data);
             currNode=currNode.next;
             temp2=temp2.next;
         }
     }
     return newNode.next;
   } 
}
