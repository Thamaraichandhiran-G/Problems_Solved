class Solution {

    public boolean search(int[] arr, int t) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (arr[mid] == t) {
                return true;
            } else if (arr[mid] < t) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return false;
    }

    public int issearch(int[] arr, int t) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] < t) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return l;
    }

    public boolean searchMatrix(int[][] arr, int t) {
        int n = arr.length;

        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = arr[i][0];
        }

        int s = issearch(f, t);
        
        if (s == n || f[s] > t) {
            s = s - 1;
        }

        if (s < 0) return false;

        return search(arr[s], t);
    }
}