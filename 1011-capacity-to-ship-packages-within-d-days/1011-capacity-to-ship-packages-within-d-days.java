class Solution {

    public int helper(int arr[], int capacity) {
        int days = 1;
        int load = 0;

        for (int weight : arr) {
            if (load + weight > capacity) {
                days++;           
                load = weight;    
            } else {
                load += weight;
            }
        }

        return days;
    }

    public int shipWithinDays(int[] arr, int d) {
        int lo = Arrays.stream(arr).max().getAsInt();
        int hi = Arrays.stream(arr).sum();

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if (helper(arr, mid) <= d) {
                hi = mid;        
            } else {
                lo = mid + 1;    
            }
        }

        return lo;
    }
}