package lab_2.individual_lab;
/**
   @Author:
      Date:
   Teacher: Appel
       Lab: Problem Set 3
      Misc: Karel plants a garden in a cross-shape
  */
import kareltherobot.*;
import java.awt.Color;

public class Problem3Driver implements Directions
{
    public static void main(String args[])  {
        Problem3 HBOT = new Problem3(3, 2, North, 100);
        Problem3 EBOT = new Problem3(3, 7, North, 100);
        Problem3 LBOT = new Problem3(13, 3, North, 100);
        Problem3 LBOT2 = new Problem3(17, 3, North, 100);
        Problem3 OBOT = new Problem3(2, 3, North, 100);
        HBOT.constructH();
        HBOT.turnOff();
        EBOT.constructE();
        EBOT.turnOff();
        LBOT.constructL();
        LBOT.turnOff();
        LBOT2.constructL();
        LBOT2.turnOff();
        OBOT.constructO();
        OBOT.turnOff();

    } 

    static {
        World.reset(); 
        World.readWorld("worlds/hello.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}