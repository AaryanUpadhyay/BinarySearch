public class binarysearch {
    int binary(int [] arr, int n, int key){
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;

        while (start<=end){
            if (arr[mid]==key) {
                return mid;
            }

            if(key<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int even[]={2,4,6,8,16,20,24};
        int odd[]={1,5,7,9,11,13,15};
    
        binarysearch ob=new binarysearch();
        int index=ob.binary(even,7, 2);
        int index2=ob.binary(odd, 7, 13);

        System.out.println("Index of 2 in even array is: "+index);
        System.out.println("Index of 13 in odd array is: "+index2);
    }
}
