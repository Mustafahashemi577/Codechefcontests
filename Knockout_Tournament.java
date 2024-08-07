import java.util.*;
import java.lang.*;
import java.io.*;

class Knockout_Tournament
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int s [] = new int [16];
		    int b [] = new int [16];
		    for(int i = 0;i<16;i++){
		        int c = scan.nextInt();
		        s[i]=c;
		        b[i]=c;
		    }
		    Arrays.sort(b);
		    for(int i = 0;i<16;i++){
		        for(int j = 0;j<16;j++){
		            if(s[i]==b[j]){
		              if(j==0)
		              s[i]=0;
		              else if (j<=2)
		              s[i]=1;
		              else if (j<=6)
		              s[i]=2;
		              else if (j<=14)
		              s[i]=3;
		              else
		              s[i]=4;
		            }
		        }
		    }
		    for(int i=0;i<16;i++)
		    System.out.print(s[i]+" ");
		}
	}
}
