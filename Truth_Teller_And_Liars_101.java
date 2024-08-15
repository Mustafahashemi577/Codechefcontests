import java.util.*;
import java.lang.*;
import java.io.*;

class Truth_Teller_And_Liars_101
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    if(n<m || n==m){
		        System.out.println(-1);
		    }
		    else{
		        System.out.println(m+1+m);
		    }   
		}

	}
}
