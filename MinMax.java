import java.util.Scanner;

public class MinMax {

    int getMax(int arr[] , int n){
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    int getMin(int arr[] , int n){
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int size;
        Scanner sc= new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Maximum number is "+new MinMax().getMax(arr, size));
        System.out.println("Minimum number is "+new MinMax().getMin(arr, size));


    }
}
