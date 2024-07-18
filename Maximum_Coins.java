import java.util.*;
import java.lang.*;
import java.io.*;

class Maximum_Coins
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int sum = 0;
		    while(x>0){
		        sum+=Math.pow(2,n);
		        x--;
		        n--;
		    }
		    while(n>0){
		        sum-=Math.pow(2,n);
		        n--;
		    }
		    System.out.println(sum);
		}

	}
}
