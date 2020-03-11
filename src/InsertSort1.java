public class InsertSort1 implements ISortStrategy {

    @Override
    public void sort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int temp = arr[i];
            for (int j = i; j > 0; j--) {
                if (arr[j-1] > temp) {
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                    temp = arr[j-1];
                }
            }
        }
    }

    @Override
    public String getAlgorithmName() {
        return "插入排序优化版";
    }

}