import java.util.*;
import java.lang.*;
import java.io.*;

class Penalty_Shoot_Out
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = Math.abs(x-y);
            if(x>y && z==1)
            System.out.println("YES");
            else if ((x==y || x<y) && z<=2)
            System.out.println("YES");
            else
            System.out.println("NO");
        }

	}
}
