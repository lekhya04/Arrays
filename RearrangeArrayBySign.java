import java.util.Scanner;
public class RearrangeArrayBySign {

    public static int[] rearrangeArray(int[] nums) {
        int pos = 0, neg = 1;
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                ans[neg] = nums[i];
                neg += 2;
            } else {
                ans[pos] = nums[i];
                pos += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = rearrangeArray(nums);

        System.out.println("Rearranged Array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}

