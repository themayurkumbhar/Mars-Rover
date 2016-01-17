package com.mayurkumbhar;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mayuresh on 17-Jan-16.
 */
public class Direction {
    private char headDirection;
    Map<Character, Character> leftDirections;
    Map<Character, Character> rightDirectios;

    public Direction() {
        leftDirections = new HashMap<>();
        rightDirectios = new HashMap<>();
        setLeftDirections();
        setRightDirections();
    }

    private void setRightDirections() {
        leftDirections.put('N','W');
        leftDirections.put('W','S');
        leftDirections.put('S','E');
        leftDirections.put('E','N');
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

    public char getRightDirectios(char ch) {
        return rightDirectios.get(ch);
    }

    public char getHeadDirection() {
        return headDirection;
    }

    public void setHeadDirection(char headDirection) {
        this.headDirection = headDirection;
    }
}
