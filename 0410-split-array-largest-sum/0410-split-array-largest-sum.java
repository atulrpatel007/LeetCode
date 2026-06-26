class Solution {
    public int splitArray(int[] arr, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        return binarySearch(arr, m, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start < end){

            int mid = start + (end - start) / 2;

            int sum = 0;
            int count = 1;

            for(int i = 0; i < arr.length; i++){

                if(sum + arr[i] > mid){
                    sum = arr[i];
                    count += 1;
                } else {
                    sum += arr[i];
                }
            }

            if(count <= target){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }
}