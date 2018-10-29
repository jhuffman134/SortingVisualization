public class SelectionSort {

    public void runSort(SortArray arr) {
        int len = arr.arraySize();
        for (int i = 0; i < len - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < len; j++) {
                if (arr.getValue(smallest) > (arr.getValue(j))) {
                    smallest = j;
                }
            }
            if (smallest != i) {
                long delay = 13000000;
                arr.swap(i, smallest, delay);
            }
        }
        arr.sleepFor(855500000);
    }
}