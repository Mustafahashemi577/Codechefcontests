import java.util.*;
import java.lang.*;
import java.io.*;

class SwapAndFlip
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n =scan.nextInt();
		    String s = scan.next();
		    String s2 = scan.next();
		    int oneS=0,zeroS=0,oneS2 = 0, zeroS2= 0;
		    for(int i = 0;i<n;i++)
		        if(s.charAt(i)=='1')
		        oneS++;
		        else
		        zeroS++;
		    for(int i = 0;i<n;i++)
		        if(s2.charAt(i)=='1')
		        oneS2++;
		        else
		        zeroS2++;
		    if(zeroS==zeroS2||oneS==oneS2||oneS%2==oneS2%2)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}
