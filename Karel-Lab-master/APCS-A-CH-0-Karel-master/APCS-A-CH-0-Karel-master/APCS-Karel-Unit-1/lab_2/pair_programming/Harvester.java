package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Planter extends HarvesterSoltution
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Planter(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        //Complete this method, using the methods you create below so that all rows are harvested
        move();
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
    } /** 
       * Precondition: Robot facing east, one block away from a row of beepers
       * Postcondition: Robot facing east, two streets above where is started, one block away from a beeper
       */
    public void harvestTwoRows() {
        harvestOneRow();
        repositionRight();
        harvestOneRow();
        repositionLeft();
    } /**
       * Percondition: facing east or facing west with a row of beepers in front
       * Postcondiontion: facing the same direction as it started, 5 avenues from where it started
       */
    public void harvestOneRow() {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    } /**
       * Percondition: facing east or facing west with a row of beepers in front
       * 
       */
      public void repositionLeft() {
        turnRight();
        move();
        turnRight();
    } public void repositionRight() {
        turnLeft();
        move();
        turnLeft();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    //your methods go below
    
    
}

