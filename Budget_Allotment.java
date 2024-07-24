import java.util.*;
import java.lang.*;
import java.io.*;

class Budget_Allotment
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int a [] = new int [n];
		    int valid =0;
		    long plus = 0;
		    for(int i = 0;i<n;i++){
		        a[i]= scan.nextInt();
		        if(a[i]>=x){
		            int temp =a[i]-x;
		            valid++;
		            plus+=temp;
		        }
		    }
		    Arrays.sort(a);
		   for(int i = n-1;i>=0;i--){
		        if(a[i]<x && plus>=(x-a[i])){
		        int temp = x-a[i];
		        a[i]+=temp;
		        plus-=temp;
		        if(a[i]>=x)
		            valid++;
		        }
		        
		    }
		    System.out.println(valid);
		    
		}
	}
}
