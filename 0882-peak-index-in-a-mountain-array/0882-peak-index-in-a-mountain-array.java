class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // 증가 → 오른쪽
                left = mid + 1;
            } else {
                // 감소 → 왼쪽
                right = mid;
            }
        }

        return left; // 또는 right
    }
}