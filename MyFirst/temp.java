/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class temp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,x,y;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n-->0){
		    x = sc.nextInt();
		    y = sc.nextInt();
		    if(x<y)
		        System.out.println("FIRST");
		    else if(x==y)
		        System.out.println("ANY");
		    else
		         System.out.println("SECOND");
        
		}

	}
}
