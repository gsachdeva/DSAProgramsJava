public int PeakIndexMountainArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] < arr[mid + 1]) {
            // You are in the ascending part
            start = mid + 1;
        } else {
            // You are in the descending part
            end = mid;
        }
    }

    return start; // or return end, both are same
}

void main() {
    int[] arr={1,3,5,7,6,3,2};
    int peakIndex = PeakIndexMountainArray(arr);
    System.out.print("Peak Index "+peakIndex);
}



