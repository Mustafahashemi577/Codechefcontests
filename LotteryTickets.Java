import java.util.*;
import java.lang.*;
import java.io.*;

class LotteryTickets {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while(t-->0) {
      int n = scan.nextInt();
      int a[] = new int[n];
      for (int i = 0; i < n; i++) a[i] = scan.nextInt();
      int num = a[0];
      Arrays.sort(a);
      int index = Arrays.binarySearch(a,num);
      int left = 0;
      if (index > 0)
        left = a[index-1];
      else
        left=Integer.MIN_VALUE;
      int right = 0;
      if (index<n - 1)
        right = a[index + 1];
      else
        right=Integer.MAX_VALUE;
      int leftR = 0;
      if (left == Integer.MIN_VALUE)
        leftR = 1;
      else {
        int mid1 = (num + left + 1) / 2;
        leftR = Math.max(1, mid1);
      }
      var rightR = 0;
      if (right == Integer.MAX_VALUE)
        rightR = 1000000;
      else {
        var mid2 = (num + right) / 2;
        rightR = Math.min(1000000, mid2);
      }
      System.out.println(rightR-leftR + 1);
    }
  }
}
