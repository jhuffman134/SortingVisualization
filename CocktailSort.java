public class CocktailSort {

    public void runSort(SortArray array) {
        boolean swapped = true;
        int front = 0;
        int back = array.arraySize();
        int frontTrack = 0;
        int backTrack = array.arraySize();
        while (swapped) {
            swapped = false;
            for (int i = front; i < back - 1; i++) {
                if (array.getValue(i) > array.getValue(i + 1)) {
                    long delay = 50000;
                    array.swap(i, i + 1, delay);
                    swapped = true;
                    backTrack = i + 1;
                }
            }
            back = backTrack;
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = back - 2; i >= front; i--) {
                if (array.getValue(i) > array.getValue(i + 1)) {
                    long delay = 50000;
                    array.swap(i, i + 1, delay);
                    swapped = true;
                    frontTrack = i + 1;
                }
            }
            front = frontTrack;
            if (!swapped) {
                break;
            }
        }
        array.sleepFor(855500000);
    }
}