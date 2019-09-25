import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(190,150);
        JTextArea textArea = new JTextArea("0");
        frame.getContentPane().add(textArea, BorderLayout.NORTH);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        frame.getContentPane().add(panel1, BorderLayout.WEST);
        frame.getContentPane().add(panel2, BorderLayout.EAST);
        GridLayout grid1 = new GridLayout(4, 3);
        GridLayout grid2 = new GridLayout(4, 1);
        panel1.setLayout(grid1);
        panel2.setLayout(grid2);
        panel1.add(new JButton("1"));
        panel1.add(new JButton("2"));
        panel1.add(new JButton("3"));
        panel1.add(new JButton("4"));
        panel1.add(new JButton("5"));
        panel1.add(new JButton("6"));
        panel1.add(new JButton("7"));
        panel1.add(new JButton("8"));
        panel1.add(new JButton("9"));
        panel1.add(new JButton("C"));
        panel1.add(new JButton("0"));
        panel1.add(new JButton("="));
        panel2.add(new JButton("+"));
        panel2.add(new JButton("-"));
        panel2.add(new JButton("*"));
        panel2.add(new JButton("/"));
        frame.show();
    }
}
