class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = peakIndexInMountainArray(mountainArr);

        int firstTry = orderAgnosticBinarySearch(mountainArr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }

        return orderAgnosticBinarySearch(
            mountainArr,
            target,
            peak + 1,
            mountainArr.length() - 1
        );
    }

    static int peakIndexInMountainArray(MountainArray arr) {

        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int orderAgnosticBinarySearch(
        MountainArray mountainArr,
        int target,
        int start,
        int end
    ) {

        boolean isAscending =
            mountainArr.get(start) < mountainArr.get(end);

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int midVal = mountainArr.get(mid);

            if (midVal == target) {
                return mid;
            }

            if (isAscending) {

                if (midVal > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if (midVal < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}