import java.util.Scanner;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        RemoveDuplicates obj = new RemoveDuplicates();
        int result = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + result);

        sc.close();
    }
}