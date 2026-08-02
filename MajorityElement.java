    import java.util.Scanner;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int cnt = 0;
        int el = 0;

        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (nums[i] == el) {
                cnt++;
            } else {
                cnt--;
            }
        }

        int cnt1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
        }

        if (cnt1 > (nums.length / 2)) {
            return el;
        }

        return -1;
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

        int result = majorityElement(nums);

        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element");
        }

        sc.close();
    }

}
