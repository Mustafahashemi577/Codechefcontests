import java.util.*;
import java.lang.*;
import java.io.*;

class Independence_Day_101
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    int max=Math.max(c,Math.max(a,b));
		    if(max==a && max>c+b+1 || max==b && max>a+c+1 || max==c && max>a+b+1)
		    System.out.println("NO");
		    else
		    System.out.println("YES");
		}

	}
}
