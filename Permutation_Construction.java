import java.util.*;
import java.lang.*;
import java.io.*;

class Permutation_Construction
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++){
                if (i % 2 == 0) {
                    a[i] = (i / 2) + 1; 
                } else {
                    a[i] = (n - (i / 2)); 
                }
            }
            
            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
	
}
