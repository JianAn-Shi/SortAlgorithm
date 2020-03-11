public class QuickSort implements ISortStrategy {

    @Override
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int start, int end) {
        if (end <= start) {
            return;
        }
        int partition = partition(arr, start, end);
        sort(arr, start, partition - 1);
        sort(arr, partition + 1, end);
    }

    private int getCenterNumber(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;
        if (arr[start] <= arr[end]) {
            if (arr[mid] > arr[start]) {
                if (arr[mid] <= arr[end]) {
                    return arr[mid];
                } else {
                    return arr[end];
                }
            } else {
                return arr[start];
            }
        } else {
            if (arr[mid] > arr[end]) {
                if (arr[mid] < arr[start]) {
                    return arr[mid];
                } else {
                    return arr[start];
                }
            } else {
                return arr[end];
            }
        }
    }

    private int getCenterIndex(int[] arr, int start, int end) {
        int centerNumber = getCenterNumber(arr, start, end);
        if (centerNumber == arr[start]) {
            return start;
        } else if (centerNumber == arr[end]) {
            return end;
        } else {
            return start + (end - start) / 2;
        }
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = getCenterNumber(arr, start, end);
        int pivotIndex = getCenterIndex(arr, start, end);
        int tempStart = start;
        int tempEnd = end;
        while (tempStart < tempEnd) {
            while (arr[tempEnd] >= pivot && tempStart < tempEnd) {
                tempEnd--;
            }
            while (arr[tempStart] <= pivot && tempStart < tempEnd) {
                tempStart++;
            }
            if (tempStart < tempEnd) {
                Util.swap(arr, tempEnd, tempStart);
            }
        }
        Util.swap(arr, pivotIndex, tempStart);
        return tempStart;
    }

    @Override
    public String getAlgorithmName() {
        return "快速排序";
    }
}
