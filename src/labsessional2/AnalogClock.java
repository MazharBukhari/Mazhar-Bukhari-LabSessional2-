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
public abstract class AnalogClock {
   protected DrawAPI drawAPI;
   
   protected AnalogClock(DrawAPI drawAPI){
      this.drawAPI = drawAPI;
   }
   public abstract void draw();	
}