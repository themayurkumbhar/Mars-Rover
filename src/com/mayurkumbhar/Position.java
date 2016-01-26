package com.mayurkumbhar;

/**
 * Created by Mayuresh on 17-Jan-16.
 */
public class Position {
    private int x;
    private int y;
    private int maxX;
    private int maxY;

    public Position(int x, int y, int maxX, int maxY) {
        this.x = x;
        this.y = y;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public void moveForward(char headDirection) {
        switch (headDirection) {
            case 'N':
                if (y + 1 <= maxY) {
                    y = y + 1;
                } else {
                    System.out.print("Out of range!");
                }
                break;
            case 'W':
                if (x - 1 <= maxX) {
                    x = x - 1;
                } else {
                    System.out.print("Out of range!");
                }
                break;
            case 'S':
                if (y - 1 <= maxY) {
                    y = y - 1;
                } else {
                    System.out.print("Out of range!");
                }
                break;
            case 'E':
                if (x + 1 <= maxX) {
                    x = x + 1;
                } else {
                    System.out.print("Out of range!");
                }
        }
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
