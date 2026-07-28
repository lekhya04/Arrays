import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubArraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumCountMap = new HashMap<>();
        sumCountMap.put(0, 1);

        int result = 0;
        int prefixsum = 0;

        for (int num : nums) {
            prefixsum += num;

            if (sumCountMap.containsKey(prefixsum - k)) {
                result += sumCountMap.get(prefixsum - k);
            }

            sumCountMap.put(prefixsum, sumCountMap.getOrDefault(prefixsum, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target sum (k): ");
        int k = sc.nextInt();

        int ans = subarraySum(nums, k);

        System.out.println("Number of subarrays with sum " + k + " = " + ans);

        sc.close();
    }
}