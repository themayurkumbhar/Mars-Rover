package com.mayurkumbhar;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mayuresh on 17-Jan-16.
 */
public class Direction {
    private char headDirection;
    Map<Character, Character> leftDirections;
    Map<Character, Character> rightDirections;

    public Direction(char headDirection) {
        this.headDirection=headDirection;
        leftDirections = new HashMap<>();
        rightDirections = new HashMap<>();
        setLeftDirections();
        setRightDirections();
    }

    private void setRightDirections() {
        rightDirections.put('N','E');
        rightDirections.put('W','N');
        rightDirections.put('S','W');
        rightDirections.put('E','S');
    }

    public void setLeftDirections() {
        leftDirections.put('N','W');
        leftDirections.put('W','S');
        leftDirections.put('S','E');
        leftDirections.put('E','N');
    }

    public char getLeftDirections(char ch) {
        return leftDirections.get(ch);
    }

    public char getRightDirections(char ch) {
        return rightDirections.get(ch);
    }

    public char getHeadDirection() {
        return headDirection;
    }

    public void setHeadDirection(char headDirection) {
        this.headDirection = headDirection;
    }
}
