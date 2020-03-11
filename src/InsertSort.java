public class InsertSort implements ISortStrategy {

    @Override
    public void sort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    Util.swap(arr, j, j - 1);
                }
            }
        }
    }

    @Override
    public String getAlgorithmName() {
        return "插入排序原版";
    }

}
