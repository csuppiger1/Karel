package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Problem2
{
   
    /**
     * Constructor for objects of class Problem3
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    } public void carpetRooms(){
        reposition();
        checkForRoom();
    } public void checkForRoom() {
        faceEast();
        if (!frontIsClear()) {
            turnLeft();
            turnLeft();
            if (!frontIsClear()) {
                turnRight();
                if (!frontIsClear()) {
                    putBeeper();
                    faceSouth();
                    move();
                    turnRight();
                    if (frontIsClear()) {
                        faceEast();
                        if (frontIsClear()) {
                            move();
                            turnLeft();
                            move();
                            checkForRoom();
                        }
                    }
                    if (!frontIsClear()) {
                        putBeeper();
                        faceSouth();
                        move();
                        turnRight();
                        if (frontIsClear()) {
                            faceEast();
                            if (frontIsClear()) {
                                move();
                                turnLeft();
                                move();
                                checkForRoom();
                            }
                        }
                    if (!frontIsClear()) {
                        putBeeper();
                        faceSouth();
                        move();
                        turnRight();
                        if (frontIsClear()) {
                        faceEast();
                        if (frontIsClear()) {
                            move();
                            turnLeft();
                            move();
                            checkForRoom();
                        }
                    }
                    if (!frontIsClear()) {
                        putBeeper();
                        faceSouth();
                        move();
                        turnRight();
                        
                    }
                    }
                    }
                } else{
                    move();
                    checkForRoom();
                }
            } else {
            faceSouth();
            move();
                if (!frontIsClear()) {
                faceSouth();
                move();
            }
            if (frontIsClear()) {
                faceEast();
                move();
                turnLeft();
                checkForRoom();
            }
            }
        } else {
            faceSouth();
            move();
            turnLeft();
            if (!frontIsClear()) {
                faceSouth();
                move();
                turnLeft();
                if (!frontIsClear()) {
                    faceSouth();
                    move();
                    turnLeft();
                    if (!frontIsClear()) {
                        faceSouth();
                        move();
                        turnLeft();
                        if (!frontIsClear()) {
                            faceSouth();
                            move();
                            turnLeft();
                        } else {
                            faceEast();
                            move();
                            turnLeft();
                            
                        }   
                    } else {
                        faceEast();
                        move();
                        turnLeft();
                        
                    }
                } else {
                    faceEast();
                    move();
                    turnLeft();
                    
                }
            } else { 
                faceEast();
                move();
                turnLeft();
                
            }
            if (frontIsClear()) {
                faceEast();
                move();
                turnLeft();
                
            }
        }
    } public void faceSouth() {
        if(facingWest()) {
            turnLeft();
        }
        else
        {
            if(facingNorth()) {
                turnLeft();
                turnLeft();}
            else {
                turnRight();
            }
        }
    }
}

