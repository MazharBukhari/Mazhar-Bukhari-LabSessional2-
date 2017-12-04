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
public class Clock extends AnalogClock {

   public Clock(DrawAPI drawAPI) {
      super(drawAPI);
   
   }

   public void draw() {
      drawAPI.drawClock();
   }
}