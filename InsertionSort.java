public class InsertionSort {

    public void runSort(SortArray arr) {
        int len = arr.arraySize();
        for (int i = 1; i < len; i++) {
            int j = i;
            while ((j > 0) && (arr.getValue(j - 1)) > arr.getValue(j)) {
                long delay = 70000;
                arr.swap(j, j-1, delay);
                j--;
            }
        }
        arr.sleepFor(855500000);
    }
}