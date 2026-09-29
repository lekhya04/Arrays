import java.util.*;

public class MajorityElementT {
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int cnt1 = 0;
        int cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && nums[i] != el2) {
                cnt1 = 1;
                el1 = nums[i];
            }
            else if (cnt2 == 0 && nums[i] != el1) {
                cnt2 = 1;
                el2 = nums[i];
            }
            else if (el1 == nums[i]) {
                cnt1++;
            }
            else if (el2 == nums[i]) {
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }

        int cnt3 = 0;
        int cnt4 = 0;
        int mini = (n / 3) + 1;

        for (int i = 0; i < n; i++) {
            if (el1 == nums[i]) {
                cnt3++;
            }
            if (el2 == nums[i]) {
                cnt4++;
            }
        }

        List<Integer> ls = new ArrayList<>();

        if (cnt3 >= mini) {
            ls.add(el1);
        }

        if (cnt4 >= mini) {
            ls.add(el2);
        }

        return ls;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> result = majorityElement(nums);

        System.out.println(result);
        sc.close();
    }
}