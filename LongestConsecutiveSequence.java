import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums)
            set.add(i);

        int ans = 0;

        for (int i : set) {
            if (!set.contains(i - 1)) {
                int len = 1;
                while (set.contains(i + len))
                    len++;
                ans = Math.max(ans, len);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = longestConsecutive(nums);
        System.out.println("Longest Consecutive Sequence Length: " + result);

        sc.close();
    }
}
