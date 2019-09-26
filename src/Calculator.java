import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(190,150);

        GridLayout mainGrid = new GridLayout(2, 1);
        frame.setLayout(mainGrid);

        JPanel topPanel = new JPanel();
        frame.add(topPanel);

        JPanel southPanel = new JPanel();
        frame.add(southPanel);

        GridLayout southGrid = new GridLayout(1, 2);
        southPanel.setLayout(southGrid);

        JTextArea textArea = new JTextArea("0");
        topPanel.add(textArea);

        JPanel leftPanel = new JPanel();
        southPanel.add(leftPanel);

        JPanel rightPanel = new JPanel();
        southPanel.add(rightPanel);

        GridLayout leftGrid = new GridLayout(4, 3);
        leftPanel.setLayout(leftGrid);

        GridLayout rightGrid = new GridLayout(4, 1);
        rightPanel.setLayout(rightGrid);

        leftPanel.add(new JButton("1"));
        leftPanel.add(new JButton("2"));
        leftPanel.add(new JButton("3"));
        leftPanel.add(new JButton("4"));
        leftPanel.add(new JButton("5"));
        leftPanel.add(new JButton("6"));
        leftPanel.add(new JButton("7"));
        leftPanel.add(new JButton("8"));
        leftPanel.add(new JButton("9"));
        leftPanel.add(new JButton("C"));
        leftPanel.add(new JButton("0"));
        leftPanel.add(new JButton("="));

        rightPanel.add(new JButton("+"));
        rightPanel.add(new JButton("-"));
        rightPanel.add(new JButton("*"));
        rightPanel.add(new JButton("/"));
        frame.show();
    }
}
