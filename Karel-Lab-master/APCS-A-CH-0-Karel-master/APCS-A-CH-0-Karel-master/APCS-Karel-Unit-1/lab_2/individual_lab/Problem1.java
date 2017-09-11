package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        positionLeftSide();
        firstRow();
        repositionRight();
        secondRow();
        repositionLeft();
        thirdRow();
        repositionRight();
        fourthRow();
    } public void turnRight(){
       turnLeft();
       turnLeft();
       turnLeft();
    } public void move2() {
        move();
        move();
    }
    /**
       * moves the robot to the left bottom corner
       */
    public void positionLeftSide() {
        turnLeft();
        move();
        move();
        move();
        move();
        turnRight();
        turnRight();
    } public void firstRow() {
        move2();
        move2();
        putBeeper();
        move2();
        move2();
    } public void repositionRight() {
        turnLeft();
        move();
        turnLeft();
    } public void secondRow() {
        move2();
        move();
        putBeeper();
        move2();
        putBeeper();
        move();
        move2();
    } public void repositionLeft() {
        turnRight();
        move();
        turnRight();
    } public void thirdRow() {
        move2();
        putBeeper();
        move2();
        putBeeper();
        move2();
        putBeeper();
        move2();
    } public void fourthRow() {
        move();
        putBeeper();
        move2();
        putBeeper();
        move2();
        putBeeper();
        move2();
        putBeeper();
        move();      
    }
}
