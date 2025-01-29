import java.util.*;
public class AgressiveCows {
    boolean isPossible(int arr[], int k, int mid){
        int cows=1;
        int pos=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-pos>=mid){
                cows++;
                pos=arr[i];
            }
            if(cows==k){
                return true;
            }
        }
        return false;
    }

    int aggresiveCows(int arr[], int k){
        Arrays.sort(arr);
        int s=0;
        int maxi=-1;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        int e=maxi;
        int ans=-1;
        int mid=s+(e-s)/2;

        while(s<=e){
            if (isPossible(arr,k,mid)) {
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,8,4,9};
        int k=3;
        AgressiveCows ob = new AgressiveCows();
        int cow=ob.aggresiveCows(arr, k);
        System.out.println("Largest minimum distance : "+cow);
    }

}
