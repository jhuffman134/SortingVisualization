import java.util.Random;

public class ShuffleArray {

    public void runShuffle(SortArray arr) {
        Random random = new Random();
        for (int i = 0; i < arr.getNumBars(); i++) {
            int swap = random.nextInt(arr.getNumBars() - 1);
            long delay = 3000000;
            arr.swap(i, swap, delay);
        }
    }
}