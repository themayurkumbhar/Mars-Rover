package com.mayurkumbhar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int maxx=scanner.nextInt();
        int maxy=scanner.nextInt();
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        char head=scanner.next().trim().charAt(0);
        String instructions=scanner.next();
        Rover rover=new Rover(x,y,head,instructions,maxx,maxy);
        rover.move();
        Position position=rover.getFinalPosition();
        Direction direction=rover.getFinalDirection();
        System.out.print(position.getX()+" "+position.getY()+" "+direction.getHeadDirection());
    }
}
