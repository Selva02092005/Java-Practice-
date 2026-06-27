import java.util.*;

class sliding {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = {-2, 1, -3, 4, -1, 2, 5};
        int k = 3;

        int max = 0;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}