//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    // static boolean isValid=true;
    int atoi(String str) {
	// Your code 
	    int flag=0;
        if(str.charAt(0)=='-') 
        {
            for(int i=1;i<str.length();i++)
            {
                if(!Character.isDigit(str.charAt(i)))
                {
                    flag=1;
                    return -1;
                    
                }
            }
            if(flag==0)
             {
                return -1*num(str.substring(1),0,str.length()-1);
             }
        }
	    return num(str,0,str.length());
	    
    }
    public static int num(String str,int i,int n)
    {
        if(i>=n-1 && (str.charAt(i)>='0' && str.charAt(i)<='9'))
             return str.charAt(i)-'0';
        if(i>=n-1)
            return -1;
        if(!Character.isDigit(str.charAt(i))) return -1;
        int d=num(str,i+1,n);
        if(d==-1) return -1;
        return (str.charAt(i)-'0')*(int)Math.pow(10,n-i-1)+d;
    
    }
}
