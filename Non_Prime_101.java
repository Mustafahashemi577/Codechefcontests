import java.util.*;

class Non_Prime_101 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        while (t-- > 0) {
            int n = scan.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            
            boolean find = false;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int sum = a[i] + a[j];
                    if (!isPrime(sum)) {
                        System.out.println((i + 1) + " " + (j + 1));
                        find = true;
                        break;
                    }
                }
                if (find) {
                    break;
                }
            }
            if (!find) {
                System.out.println(-1);
            }
        }
    }
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
