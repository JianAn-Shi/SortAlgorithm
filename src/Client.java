public class Client {

    private ISortStrategy sortStrategy;

    public Client(ISortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void setSortStrategy(ISortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(int[] arr) {
        if (sortStrategy != null) {
            System.out.print("排序前：");
            Util.print(arr);
            long preStamp = System.currentTimeMillis();
            sortStrategy.sort(arr);
            long afterStamp = System.currentTimeMillis();
            System.out.print(sortStrategy.getAlgorithmName() + "：");
            Util.print(arr);
            System.out.println(sortStrategy.getAlgorithmName() + "花费" + (afterStamp - preStamp) + "ms");
        }
    }

}
