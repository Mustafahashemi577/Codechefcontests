import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_Loves_Pizza_Chef_Loves_Halfs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int d = 1;
		    for(int i =0;d<x;i++){
		        d*=2;
		    }
		    int specifier = d-x;
		    if(specifier==0)
		    System.out.println(specifier);
		    else
		    {
		        System.out.println(x-specifier);
		    }
		}

	}
}
