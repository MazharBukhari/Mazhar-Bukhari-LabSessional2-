/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsessional2;

/**
 *
 * @author fa14-bse-084
 */
public class LabSessional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      AnalogClock Hours = new Clock(new Hour());
      AnalogClock Minutes = new Clock(new Minute());
      AnalogClock Seconds = new Clock(new Second());

      Hours.draw();
      Minutes.draw();
      Seconds.draw();
   }
}