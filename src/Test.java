public class Test {

    public static void main(String[] args) {
        ISortStrategy sortStrategy = new InsertSort();
        int [] arr = Util.create(10,10);
        int [] a = Util.copy(arr);
        int [] a1 = Util.copy(arr);
        int [] a2 = Util.copy(arr);
        Client client = new Client(sortStrategy);
        client.sort(arr);
        sortStrategy = new InsertSort1();
        client.setSortStrategy(sortStrategy);
        client.sort(a);
        sortStrategy = new ShellSort();
        client.setSortStrategy(sortStrategy);
        client.sort(a1);
        sortStrategy = new QuickSort();
        client.setSortStrategy(sortStrategy);
        client.sort(a2);
    }
}
