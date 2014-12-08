/**
 * A robot moves along a row, collecting piles of beepers and placing them one square to
 * the right.
 * 
 * @author Jack Navin-Weinstein
 * @version <...>
 *
 */

import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class Lab09 {
	 
	 public static void main(String[] args) {
		 String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+map+".map");
		 Display.setSize(10, 10);
		 
       Athlete athena = new Athlete(1, 1, Display.EAST, 0);
		 //TODO write a combination of definite and indefinite loops that will cause athena
		 // to pick up each pile of beepers and deposit them one square to the right.\\
       int pile1 = 0;
       int pile2 = 0;
       int pile3 = 0;
       int pile4 = 0;
       int pile5 = 0;
       int pile6 = 0;
      
         while(athena.nextToABeeper()){
            athena.pickBeeper();
            pile1++;
         } 
         athena.move();
         
         while(athena.nextToABeeper()){
               athena.pickBeeper();
               pile2++;
         } 
         for(int n=pile1; n>0; pile1--){
                  athena.putBeeper();
         }
         athena.move();

         while(athena.nextToABeeper()){
         athena.pickBeeper();
         pile3++;
         }
         for(int n=pile2; n>0; pile2--){
               athena.putBeeper();
         }
         athena.move();
         
         while(athena.nextToABeeper()){
                  athena.pickBeeper();
                  pile4++;
         }
         for(int n=pile3; n>0; pile3--){
             athena.putBeeper();
           
         }    
         athena.move();
         
         while(athena.nextToABeeper()){
                  athena.pickBeeper();
                  pile5++;
         }
         for(int n=pile4; n>0; pile4--){
             athena.putBeeper();
         }
         athena.move();
          
         while(athena.nextToABeeper()){
                  athena.pickBeeper();
                  pile6++;
         }
         for(int n=pile5; n>0; pile5--){
             athena.putBeeper();
         }
         athena.move();
         
         for(int n=pile6; n>0; pile6--){
             athena.putBeeper();
         }
         athena.turnAround();
         for(int n=0; n<7; n++){
         athena.move();
         }
         athena.turnAround
    }
}
         
         
         
         
       
    
