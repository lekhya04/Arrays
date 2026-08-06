import java.util.*;

public class LeadersInArray {

    public static List<Integer> leaders(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > maxi) {
                maxi = nums[i];
                res.add(0, maxi);
            }
        }

        return res;
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

        System.out.println(leaders(nums));

        sc.close();
    }
}