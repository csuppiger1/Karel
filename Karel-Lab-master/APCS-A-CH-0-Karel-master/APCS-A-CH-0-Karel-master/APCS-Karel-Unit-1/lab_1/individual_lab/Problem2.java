package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        goAroundFirstBeeper();
        goAroundSecondBeeper();
        comeBackAroundSecondBeeper();
        comeBackAroundFirstBeeper();
    } public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    } public void goAroundFirstBeeper() {
        turnRight();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
    } public void goAroundSecondBeeper() {
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
    } public void comeBackAroundSecondBeeper() {
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
    } public void comeBackAroundFirstBeeper() {
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        turnLeft();
    }
    
        
   
}