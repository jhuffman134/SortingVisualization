import javax.swing.JFrame;

public class ArrayVisualization {
    public static final int WIN_WIDTH = 1280;
    public static final int WIN_HEIGHT = 740;

    private JFrame window;
    private SortArray array;

    public ArrayVisualization() {
        window = new JFrame("Sorting algorithm visualization");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        array = new SortArray();
        window.add(array);
        window.setSize(WIN_WIDTH, WIN_HEIGHT);

        window.setVisible(true);

        new InsertionSort().runSort(array);
        new ShuffleArray().runShuffle(array);
        new BubbleSort().runSort(array);
        new ShuffleArray().runShuffle(array);
    }

    public static void main(String[] args) {
        ArrayVisualization arr = new ArrayVisualization();
    }
}