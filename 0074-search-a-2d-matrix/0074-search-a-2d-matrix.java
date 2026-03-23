class Solution {
    public boolean searchMatrix(int[][] arr, int t) {
        int n = arr.length;
        int m = arr[0].length;

        int l = 0, h = n * m - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            int val = arr[mid / m][mid % m];

            if (val == t)
                return true;
            else if (val < t)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return false;
    }
}