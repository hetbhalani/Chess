package Main;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import pieces.Knight;
import pieces.Piece;

public class Board extends JPanel {


    public int tileSize = 85; 
    int cols = 8;
    int rows = 8;

    ArrayList<Piece> pieceList = new ArrayList<>();

    public Board() {
        this.setPreferredSize(new Dimension(cols * tileSize, rows * tileSize));
        addPieces();
    }

    public void addPieces(){
        pieceList.add(new Knight(this, 1, 0, false ));
    }

    protected void paintComponent(Graphics g) {
       
        Graphics2D g2d = (Graphics2D) g;

     

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                g2d.setColor((i + j) % 2 == 0 ? new Color(238,238,210) : new Color(118,150,86));
                g2d.fillRect(j * tileSize, i * tileSize, tileSize, tileSize);
            }

            for(Piece piece : pieceList){
                piece.paint(g2d);
            }
        }
    }
}
