package lab_2.individual_lab;


/**
 * Write a description of class Problem3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    } 
    
     public void move5() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    } public void movePut() {
        move();
        putBeeper();
        
    }public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }public void constructH() {
        move5();
        turnRight();
        move();
        move();
        move();
        turnRight();
        move5();
        turnRight();
        move();
        turnRight();
        move();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        
    } public void constructE() {
        move5();
        turnRight();
        movePut();
        movePut();
        putBeeper();
        turnRight();
        move();
        move();
        turnRight();
        movePut();
        movePut();
        turnLeft();
        move();
        move();
        turnLeft();
        movePut();
        movePut();
        
        
    } public void constructL() {
        movePut();
        movePut();
        turnRight();
        move5();
        
    } public void constructO() {
        
    }
}
    
    

    

