import java.util.*;
import java.lang.*;
import java.io.*;

class No_Winner
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    int m = scan.nextInt();
		    boolean result = false;
		    int p [] = new int [3];
		    p[0]=Math.abs(a-b);
		    p[1]=Math.abs(a-c);
		    p[2]=Math.abs(b-c);
		    if(p[0]<=m || p[1]<=m || p[2]<=m || p[1]+p[0]<=m || p[1]+p[2]<=m || p[2]+p[0]<=m || p[1]+p[0]+p[2]<=m)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
