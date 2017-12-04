/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsessional2;


import java.util.Calendar;

/**
 *
 * @author fa14-bse-084
 */
public class Minute implements DrawAPI {
      
   @Override
   public void drawClock() {
       System.out.print(cal.get(Calendar.MINUTE)+":");
   }
}