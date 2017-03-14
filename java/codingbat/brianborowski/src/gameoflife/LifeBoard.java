package gameoflife;
/**
 * File: LifeBoard.java
 * Author: Brian Borowski
 * Date created: May 1999
 * Date last modified: December 27, 2010
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.StringTokenizer;

import javax.swing.JPanel;

public class LifeBoard extends JPanel implements MouseListener, MouseMotionListener {
    public static final int FINITE = 0, TORUS = 1;
    public static final String[] BOARDTYPES = {"Finite", "Torus"};

    private static final long serialVersionUID = 1L;

    private final Color backgroundColor = new Color(22, 107, 29),
                        mouseCellColor = new Color(20, 60, 20);
    private final int panelWidth, panelHeight, imageHeight, imageWidth, numRows, numCols;
    private final Image image;

    private final boolean[][] grid, tempGrid;
    private boolean editable = true;
    private int boardType, mouseX, mouseY;

    public LifeBoard(final int boardType, final String imagePath, final int numRows,
                     final int numCols) {
        this.boardType = boardType;
        this.image = ImagePanel.getImage(imagePath);
        this.imageHeight = image.getHeight(this) + 1;
        this.imageWidth = image.getWidth(this) + 1;
        this.numRows = numRows;
        this.numCols = numCols;

        grid = new boolean[numRows][numCols];
        tempGrid = new boolean[numRows][numCols];
        setSize(getPreferredSize());
        for (int row = numRows - 1; row >= 0; --row) {
            for (int col = numCols - 1; col >= 0; --col) {
                grid[row][col] = tempGrid[row][col] = false;
            }
        }
        addMouseListener(this);
        addMouseMotionListener(this);
        panelWidth = this.getSize().width;
        panelHeight = this.getSize().height;
        mouseX = mouseY = -1;
        setDoubleBuffered(true);
    }

    public Dimension getPreferredSize() {
        return new Dimension(numCols * imageWidth + 1, numRows * imageHeight + 1);
    }

    public void setPresetConfig(final String pattern) {
        final StringTokenizer st = new StringTokenizer(pattern, " ");
        while (st.hasMoreTokens()) {
            try {
                final int row = Integer.parseInt((st.nextToken()).trim()),
                    col = Integer.parseInt((st.nextToken()).trim());
                if (row >= 0 && row < numRows &&
                    col >= 0 && col < numCols) {
                    grid[row][col] = true;
                }
            } catch (final NumberFormatException nfe) { }
        }
        repaint();
    }

    public void setRandomConfig() {
        for (int row = numRows - 1; row >= 0; --row) {
            for (int col = numCols - 1; col >= 0; --col) {
                final int number = (int)(Math.random() * 100);
                grid[row][col] = number < 20 ? true : false;
            }
        }
        repaint();
    }

    public void setBoardType(final int boardType) {
        this.boardType = boardType;
    }

    public boolean isAnyCellAlive() {
        for (int row = numRows - 1; row >= 0; --row) {
            for (int col = numCols - 1; col >= 0; --col) {
                if (grid[row][col]) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setEditable(final boolean editable) {
        this.editable = editable;
    }

    public void clear() {
        for (int row = numRows - 1; row >= 0; --row) {
            for (int col = numCols - 1; col >= 0; --col) {
                grid[row][col] = tempGrid[row][col] = false;
            }
        }
        repaint();
    }

    public void makeNextGeneration() {
        for (int row = numRows - 1; row >= 0; --row) {
            for (int col = numCols - 1; col >= 0; --col) {
                final int numOfNeighbors = neighborCount(row, col);
                switch (numOfNeighbors) {
                    case 2:
                        tempGrid[row][col] = grid[row][col];
                        break;
                    case 3:
                        tempGrid[row][col] = true;
                        break;
                    default:
                        tempGrid[row][col] = false;
                }
            }
        }
        for (int row = numRows - 1; row >= 0; --row) {
            for (int col = numCols - 1; col >= 0; --col) {
                grid[row][col] = tempGrid[row][col];
            }
        }
        repaint();
    }

    public void mousePressed(final MouseEvent me) {
        if (editable) {
            final int row = me.getY() / imageHeight,
                col = me.getX() / imageWidth;
            if (row >= 0 && row < numRows &&
                col >= 0 && col < numCols) {

                grid[row][col] = !grid[row][col];
                repaint();
            }
        }
    }

    public void mouseDragged(final MouseEvent me) {
        if (editable) {
            final int row = me.getY() / imageHeight,
                col = me.getX() / imageWidth;
            if (row >= 0 && row < numRows &&
                col >= 0 && col < numCols) {

                mouseY = row;
                mouseX = col;
                grid[row][col] = true;
                repaint();
            }
        }
    }

    public void mouseEntered(final MouseEvent me) { }

    public void mouseExited(final MouseEvent me) {
        mouseX = mouseY = -1;
        repaint();
    }

    public void mouseClicked(final MouseEvent me) { }

    public void mouseReleased(final MouseEvent me) { }

    public void mouseMoved(final MouseEvent me) {
        if (editable) {
            final int row = me.getY() / imageHeight,
                col = me.getX() / imageWidth;
            if (row >= 0 && row < numRows &&
                col >= 0 && col < numCols) {

                mouseY = row;
                mouseX = col;
                repaint();
            }
        }
    }

    public void paint(final Graphics g) {
        g.setColor(backgroundColor);
        g.fillRect(0, 0, panelWidth, panelHeight);
        if (mouseX != -1 && mouseY != -1) {
            g.setColor(mouseCellColor);
            g.fillRect(mouseX * imageWidth, mouseY * imageHeight, imageWidth, imageHeight);
        }
        g.setColor(SystemColor.activeCaptionBorder);
        for (int row = numRows; row >= 0; --row) {
            g.drawLine(0, row * imageHeight, numCols * imageWidth, row * imageHeight);
        }
        for (int col = numCols; col >= 0; --col) {
            g.drawLine(col * imageWidth, 0, col * imageWidth, numRows * imageWidth);
        }

        for (int row = numRows - 1; row >= 0; --row) {
            for (int col = numCols - 1; col >= 0; --col) {
                if (grid[row][col]) {
                    g.drawImage(image, col * imageWidth + 1, row * imageHeight + 1, this);
                }
            }
        }
    }

    private int neighborCount(final int row, final int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; ++i) {
            for (int j = col - 1; j <= col + 1; ++j) {
                if (boardType == FINITE) {
                    if (i >= 0 && i < numRows && j >= 0 && j < numCols) {
                        count += grid[i][j] ? 1 : 0;
                    }
                } else {
                    int tempI = i, tempJ = j;
                    if (i == -1) {
                        tempI = numRows - 1;
                    } else if (i == numRows) {
                        tempI = 0;
                    }
                    if (j == -1) {
                        tempJ = numCols - 1;
                    } else if (j == numCols) {
                        tempJ = 0;
                    }
                    count += grid[tempI][tempJ] ? 1 : 0;
                }
            }
        }
        count -= grid[row][col] ? 1 : 0;
        return count;
    }
}