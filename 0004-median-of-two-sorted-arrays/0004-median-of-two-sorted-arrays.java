class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int low = 0, high = m;
        int left = (m+n+1)/2;
        int  l = m + n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int mid1 = left - mid;
            int l1 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r2 = Integer.MAX_VALUE;
            if(mid<m) r1 = nums1[mid];
            if(mid1<n) r2 = nums2[mid1];
            if(mid - 1>=0) l1 = nums1[mid - 1];
            if(mid1 - 1>=0) l2 = nums2[mid1 - 1];
            if(l1<=r2 && l2<=r1){
                if(l%2 == 1) return Math.max(l1,l2);
                else return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
            }
            else if(l1>r2) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
}