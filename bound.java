public class bound {
    int firstOcc(int arr[],int n, int key){
        int s=0;
        int end=n-1;
        int mid=s+(end-s)/2;
        int ans=-1;
        while(s<=end){
            if(arr[mid]==key){
                ans=mid;
                end=mid-1;
            }
            else if(key>arr[mid]){
                s=mid+1;
            }
            else if(key<arr[mid]){
                end=mid-1;
            }
            mid=s+(end-s)/2;
        }
        return ans;
    }

    int lastOcc(int arr[],int n, int key){
        int s=0;
        int end=n-1;
        int mid=s+(end-s)/2;
        int ans=-1;
        while(s<=end){
            if(arr[mid]==key){
                ans=mid;
                s=mid+1;
            }
            else if(key>arr[mid]){
                s=mid+1;
            }
            else if(key<arr[mid]){
                end=mid-1;
            }
            mid=s+(end-s)/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,4,4,5,6,7,8,9};
        int n=arr.length;
        int key=4;

        bound ob=new bound();
        int index=ob.firstOcc(arr,n,key);
        int index2=ob.lastOcc(arr,n,key);
        System.out.println("First occurence of "+key+" is at index: "+index);

        System.out.println("Last occurence of "+key+" is at index: "+index2);
    }
}
