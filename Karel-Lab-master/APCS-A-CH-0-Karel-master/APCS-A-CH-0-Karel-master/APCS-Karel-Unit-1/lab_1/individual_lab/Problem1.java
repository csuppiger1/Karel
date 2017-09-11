package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        goToBeepers();
        pickUpBeepers();
        goToNewLocation();
        putDownBeepers();
        goToStart();
    } public void goToBeepers() {
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
    } public void pickUpBeepers() {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    } public void goToNewLocation() {
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    } public void putDownBeepers() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    } public void goToStart() {
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
    }
   
} 