public class getPivot {
    
    int Pivot(int arr[], int n) {
        int s = 0;
        int e = n - 1;
        
        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] >= arr[0]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s; // The start index 's' will point to the pivot
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int n = arr.length;
        getPivot ob = new getPivot();
        int index = ob.Pivot(arr, n);
        System.out.println("Pivot element is at index: " + index);
    }
}