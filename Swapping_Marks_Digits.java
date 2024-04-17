import java.util.*;
import java.lang.*;
import java.io.*;

class Swapping_Marks_Digits
{
    public static int reverse(int a){
        int c = a-10*(a/10);
        a = a/10;
        
        return a+10*c;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int d = reverse(a);
		    int f = reverse(b);
		    if(d>b || d>f || a>b || a>f )
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		    
		}

	}
}
