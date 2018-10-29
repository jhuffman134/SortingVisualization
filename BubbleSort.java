public class BubbleSort {

    public void runSort(SortArray arr) {
        int len = arr.arraySize();
        boolean swapped;
        for (int i = 0; i < len; i++) {
            swapped = false;
            for (int j = 1; j < len - i; j++) {
                if (arr.getValue(j-1) > arr.getValue(j)) {
                    long delay = 70000;
                    arr.swap(j-1, j, delay);
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        arr.sleepFor(855500000);
    }
}
