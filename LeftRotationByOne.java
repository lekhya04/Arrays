    import java.util.Scanner;

public class LeftRotationByOne {


    public void rotateArrayByOne(int[] nums) {
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        LeftRotationByOne obj = new LeftRotationByOne();
        obj.rotateArrayByOne(nums);

        System.out.print("Array after rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}

