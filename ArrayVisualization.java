import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class ArrayVisualization {
    public static final int WIN_WIDTH = 1280;
    public static final int WIN_HEIGHT = 740;

    private JFrame window;
    private JPanel texts;
    private SortArray array;
    private JButton shuffleButton;
    private JButton bubbleSortButton;
    private JLabel text;

    public ArrayVisualization() {
        window = new JFrame("Sorting algorithm visualization");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(WIN_WIDTH, WIN_HEIGHT);

        // buttons = new JPanel();

        // shuffleButton = new JButton("Shuffle");
        // shuffleButton.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         new ShuffleArray().runShuffle(array);
        //     }
        // });
        // shuffleButton.setBounds(20,0,40,20);
        // window.add(shuffleButton, BorderLayout.NORTH);

        // bubbleSortButton = new JButton("Bubble Sort");
        // bubbleSortButton.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         bubble();
        //     }
        // });
        // bubbleSortButton.setBounds(40,0,60,20);
        // window.add(bubbleSortButton, BorderLayout.NORTH);

        array = new SortArray();
        window.add(array);

        // text = new JLabel();
        // text.setText("InsertionSort");

        // texts = new JPanel();
        // texts.add(text);
        // window.add(texts);

        window.setVisible(true);

        //new InsertionSort().runSort(array);
        //new ShuffleArray().runShuffle(array);
        // text.setText("BubbleSort");
        //new BubbleSort().runSort(array);
        //new ShuffleArray().runShuffle(array);
        // text.setText("SelectionSort");
        new SelectionSort().runSort(array);
        new ShuffleArray().runShuffle(array);
        new CocktailSort().runSort(array);
        new ShuffleArray().runShuffle(array);
    }

    public static void main(String[] args) {
        ArrayVisualization arr = new ArrayVisualization();
    }

    // public void bubble() {
    //     new BubbleSort().runSort(array);
    // }
}