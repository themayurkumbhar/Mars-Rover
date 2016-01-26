package com.mayurkumbhar;

/**
 * Created by Mayuresh on 17-Jan-16.
 */
public class Rover {
    Direction direction;
    Position position;
    String instructions;

    public Rover(int x, int y, char headDirection, String instructions, int maxX, int maxY) {
        this.instructions = instructions;
        direction = new Direction(headDirection);
        position = new Position(x, y, maxX, maxY);
    }

    public void move() {
        for (int i = 0; i < instructions.length(); i++) {
            char currentInstruction = instructions.charAt(i);
            if (currentInstruction == 'L') {
                direction.setHeadDirection(direction.getLeftDirections(direction.getHeadDirection()));
            } else if (currentInstruction == 'R') {
                direction.setHeadDirection(direction.getRightDirections(direction.getHeadDirection()));
            } else if (currentInstruction == 'M') {
                position.moveForward(direction.getHeadDirection());
            }
        }
    }

    public Position getFinalPosition() {
        return position;
    }

    public Direction getFinalDirection() {
        return direction;
    }

}


