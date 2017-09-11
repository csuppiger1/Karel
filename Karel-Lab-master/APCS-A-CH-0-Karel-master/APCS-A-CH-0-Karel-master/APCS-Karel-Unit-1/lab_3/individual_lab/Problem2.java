package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Problem1
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        reposition();
        checkForRoom();
        checkForRoom();
        checkForRoom();
        checkForRoom();
        checkForRoom();
        checkForRoom();
        checkForRoom();
        checkForRoom();
    } public void reposition() {
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnLeft();
    } public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    } public void checkForRoom() {
            if(!frontIsClear()) {
                turnRight();
                if (!frontIsClear()) {
                    turnRight();
                    if (!frontIsClear()) {
                        putBeeper();
                        reposition();
                    } else { 
                        faceEast();
                        reposition();
                    }
                } else {
                    faceEast();
                    reposition();
                }
            } else {
                faceEast();
                reposition();
            }
                
        }
    }

