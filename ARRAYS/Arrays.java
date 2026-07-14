import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};

        int n = arr.length;
        int Sum = 0;

        for ( int i=0; i<=n-1; i++){
            int value = arr[i];
            Sum = Sum + value;
        }
        System.out.println (Sum);



        // int arr[] = {10,20,30};

        // int n= arr.length;
        // for ( int i=0; i<=n-1; i++){
        //     System.out.println(arr[i]);
        // }

        // int arr[] = new int[5];
        // Scanner sc = new Scanner(System.in);

        // int n = arr.length;

        // for (int i = 0; i < n; i++) {
        //     System.out.println ("Provide input for index :"+i);
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println ("Your Array contains :");
        // for ( int val : arr ){
        //     System.out.println (val);
        // }


        // int[] arr;
        // arr = new int[5];

        // int[] brr = {10, 20, 30};

        // for ( int value : brr ){
        //     System.out.println (value);
        // }
        
        // int n =brr.length;
        // for ( int index=0; index<=n-1; index++){
        //     System.out.println (brr[index]);
        // }


        // System.out.println("Value at 0 index: " + brr[0]);
        // System.out.println("Value at 1 index: " + brr[1]);
        // System.out.println("Value at 2 index: " + brr[2]); 
    }
}