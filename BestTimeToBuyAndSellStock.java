import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a >= b) ? b : a;
    }

    public static int stockBuySell(int[] arr, int n) {
        int mini = arr[0];
        int profit = 0;
        int cost;

        for (int i = 1; i < n; i++) {
            cost = arr[i] - mini;
            profit = max(profit, cost);
            mini = min(mini, arr[i]);
        }

        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the stock prices:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = stockBuySell(arr, n);

        System.out.println("Maximum Profit: " + result);

        sc.close();
    }
}
