import java.util.Scanner;
public class PrefixSum{
    public static void main(String[] args){
        int n;
        System.out.println("enter no of elements");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] a= new int[n];
        System.out.println("enter array elemets");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int prefix[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                prefix[i]=a[i];
            }
            else{
                prefix[i]=prefix[i-1]+a[i];
            }
        }
        System.out.println("prefix sum array elements are:");
        for(int i=0;i<n;i++){
            System.out.println(prefix[i]);
        }
        sc.close();
    }
}