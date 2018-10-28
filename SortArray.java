import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import java.awt.Dimension;
import java.awt.Color;

public class SortArray extends JPanel {
    public static final int WINDOW_WIDTH = 1280;
    public static final int WINDOW_HEIGHT = 720;
    private static final int BAR_WIDTH = 5;
    private static final int NUM_BARS = WINDOW_WIDTH / BAR_WIDTH;
    private final int[] array;

    public SortArray() {
        array = new int[NUM_BARS];
        for (int i = 0; i < NUM_BARS; i++) {
            array[i] = i + 1;
        }
        setBackground(Color.darkGray);

        shuffleArray();

        // new InsertionSort().runSort(array);
    }

    public int getNumBars() {
        return NUM_BARS;
    }

    public int getValue(int index) {
        return array[index];
    }

    public int arraySize() {
        return array.length;
    }

    public void swap(int index1, int index2, long nanoSecondDelay) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        repaint();
        sleepFor(nanoSecondDelay);
    }

    public static void sleepFor(long nanoseconds) {
        long timeElapsed;
        final long startTime = System.nanoTime();
        do {
            timeElapsed = System.nanoTime() - startTime;
        } while (timeElapsed < nanoseconds);
    }

    private void shuffleArray() {
        Random random = new Random();
        for (int i = 0; i < NUM_BARS; i++) {
            int swap = random.nextInt(NUM_BARS - 1);
            int temp = array[i];
            array[i] = array[swap];
            array[swap] = temp;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D) g;
        super.paintComponent(graphics);
        graphics.setColor(Color.white);
        for (int i = 0; i < NUM_BARS; i++) {
            int height = getValue(i) * 2;
            int xStart = i + (BAR_WIDTH - 1) * i;
            int yStart = WINDOW_HEIGHT - height;

            graphics.fillRect(xStart, yStart, BAR_WIDTH, height);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension();
    }
}