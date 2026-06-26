class Solution {
    public int search(int[] arr, int target) {
        int pivot = pivot(arr);
        if (pivot == -1) {
            return binarySearch(arr,target,0, arr.length-1);
        }
        if (target == arr[pivot]) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr,target,0, pivot-1);
        }
        return binarySearch(arr,target,pivot+1, arr.length-1);
    }
    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[start] >= arr[mid]) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = (start + (end-start)/2);
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}