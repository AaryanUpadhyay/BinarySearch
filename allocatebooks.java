public class allocatebooks {
    
    int allocateBooks(int arr[], int n, int m) {
        if (m > n) return -1; // More students than books is not possible
        
        int s = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            s = Math.max(s, arr[i]); // Minimum possible value should be max book in array
        }
        
        int e = sum, ans = -1;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if (isPossible(arr, n, m, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        
        return ans;
    }

    boolean isPossible(int arr[], int n, int m, int mid) {
        int student = 1, sum = 0;
        
        for (int i = 0; i < n; i++) {
            if (sum + arr[i] <= mid) {
                sum += arr[i];
            } else {
                student++;
                if (student > m) {
                    return false;
                }
                sum = arr[i];
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int n = arr.length;
        int m = 2;
        
        allocatebooks obj = new allocatebooks();
        System.out.println(obj.allocateBooks(arr, n, m));
    }
}
