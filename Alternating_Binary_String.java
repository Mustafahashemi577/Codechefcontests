import java.util.*;

class Alternating_Binary_String {
    static void reverse(char[] a, int i) {
        for (; i < a.length; i++) {
            a[i] ^= '1';
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            char[] s = scan.next().toCharArray();
            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                if (s[i] == s[i + 1]) {
                    count++;
                    reverse(s, i);
                }
            }
            System.out.println(count);
        }
    }
}