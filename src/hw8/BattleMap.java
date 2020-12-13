package hw8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;

    static final int MODE_H_VS_AI = 0;
    static final int MODE_H_VS_H = 1;

    static final double SCALE = 0.8;

    private int mode;
    private int fieldSize;
    private int winningLength;

    private boolean isInit;

    private int cellWidth;
    private int cellHeight;
    private int deltaWidth;
    private int deltaHeight;


    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;

        setBackground(Color.ORANGE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int cellX = e.getX() / cellWidth;
                int cellY = e.getY() / cellHeight;

                if (Logic.gameFinished == 0) {
                    Logic.humanTurn(cellX, cellY);
                }
                repaint();
                String msg = "";
                if (Logic.gameFinished != 0) {
                    switch (Logic.gameFinished) {
                        case 1:
                            msg = "Вы выиграли!!!";
                            break;
                        case 2:
                            msg = "Ничья";
                            break;
                        case 3:
                            msg = "Комьютер победил";
                            break;
                    }
                    JOptionPane.showMessageDialog(null, msg);
                }
            }
        });
    }

    public void startNewGame(int mode, int fieldSize, int winningLength) {
        this.mode = mode;
        this.fieldSize = fieldSize;
        this.winningLength = winningLength;

        isInit = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!isInit) {
            return;
        }

        cellHeight = getHeight() / fieldSize;
        cellWidth = getWidth() / fieldSize;
        deltaWidth = (int) (cellWidth * (1 - SCALE));
        deltaHeight = (int) (cellHeight * (1 - SCALE));

        for (int i = 1; i < fieldSize; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, getWidth(), y);
        }

        for (int i = 1; i < fieldSize; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, getHeight());
        }

        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                if (Logic.map[i][j] == Logic.DOT_X) {
                    drawX(g, j, i);
                }
                if (Logic.map[i][j] == Logic.DOT_O) {
                    drawO(g, j, i);
                }


            }
        }

//        ((Graphics2D)g).setStroke(new BasicStroke(5));
//        g.setColor(Color.RED);
//        g.drawString("qweqweqwe", 200, 200);

//        g.drawLine(100, 100, 400, 400);
//        g.drawOval(100, 100, 300, 300);
    }

    private void drawX(Graphics g, int cellX, int cellY) {
        ((Graphics2D) g).setStroke(new BasicStroke(5));
        g.setColor(Color.RED);
        g.drawLine(cellX * cellWidth + deltaWidth, cellY * cellHeight + deltaHeight,
                (cellX + 1) * cellWidth - deltaWidth, (cellY + 1) * cellHeight - deltaHeight);
        g.drawLine(cellX * cellWidth + deltaWidth, (cellY + 1) * cellHeight - deltaHeight,
                (cellX + 1) * cellWidth - deltaWidth, cellY * cellHeight + deltaHeight);
    }

    private void drawO(Graphics g, int cellX, int cellY) {
        ((Graphics2D) g).setStroke(new BasicStroke(5));
        g.setColor(Color.BLUE);
        g.drawOval(cellX * cellWidth + deltaWidth, cellY * cellHeight + deltaHeight,
                cellWidth - deltaWidth * 2, cellHeight - deltaHeight * 2);
    }

}
