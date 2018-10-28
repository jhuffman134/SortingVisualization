import javax.swing.JFrame;

public class ArrayVisualization {
    public static final int WIN_WIDTH = 1280;
    public static final int WIN_HEIGHT = 720;

    private JFrame window;
    private SortArray sortArray;

    public ArrayVisualization() {
        window = new JFrame("Sorting algorithm visualization");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        sortArray = new SortArray();
        window.add(sortArray);
        window.setSize(WIN_WIDTH, WIN_HEIGHT);

        window.setVisible(true);

        new InsertionSort().runSort(sortArray);
        new ShuffleArray().runShuffle(sortArray);



        // window.setVisible(true);






    }

    public static void main(String[] args) {
        ArrayVisualization arr = new ArrayVisualization();
    }
}