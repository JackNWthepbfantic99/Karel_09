import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Pusher extends Athlete {
   public Pusher(){
      super(1,1,Display.EAST,0);
   }
   public Pusher(int x,int y,int dir,int beep){
      super(x,y,dir,beep);
   }
   
      public void pickAllBeeper(Pusher arg){
         while(arg.nextToABeeper()){
            arg.pickBeeper();
         }
      }
      
      public void putAllBeeper(Pusher arg){
         while(arg.hasBeepers()){
            arg.putBeeper();
         }
      }
}
      