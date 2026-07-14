import java.util.Scanner;
public class InitialisationOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements");
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of array elements is: "+sum);
        sc.close();

    }
}