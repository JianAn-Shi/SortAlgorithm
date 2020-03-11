public class ShellSort implements ISortStrategy {

    @Override
    public void sort(int[] arr) {
        int length = arr.length;
        int h = 1;
        while (h < length / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = 0; i < h; i++) {
                for (int j = i; j < length; j += h) {
                    int temp = arr[j];
                    for (int k = j; k > i; k -= h) {
                        if (arr[k] < arr[k - h]) {
                            arr[k] = arr[k-h];
                            arr[k-h] = temp;
                            temp = arr[k-h];
                        }
                    }
                }
            }
            h = h / 3;
        }
    }

    @Override
    public String getAlgorithmName() {
        return "希尔排序";
    }
}
