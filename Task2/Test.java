import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 6, 1, 3, 9, 4, 7};

        Sort sorter = new Sort();

        // Sử dụng thuật toán sắp xếp nổi bọt
        sorter.setSortingStrategy(new BubbleSort());
        sorter.sortArray(arr);
        System.out.println("Sắp xếp bằng thuật toán sắp xếp nổi bọt: " + Arrays.toString(arr));

        // Sử dụng thuật toán sắp xếp chọn
        sorter.setSortingStrategy(new SelectionSort());
        sorter.sortArray(arr);
        System.out.println("Sắp xếp bằng thuật toán sắp xếp chọn: " + Arrays.toString(arr));

        // Thêm các thuật toán sắp xếp khác và áp dụng tại đây
        // sorter.setSortingStrategy(new OtherSortingStrategy());
        // sorter.sortArray(arr);
        // System.out.println("Sắp xếp bằng thuật toán sắp xếp khác: " + Arrays.toString(arr));
    }
}
