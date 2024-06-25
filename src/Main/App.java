package Main;

import java.awt.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(1000, 1000));

        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(new GridBagLayout());

        Board board = new Board();
        frame.add(board);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
