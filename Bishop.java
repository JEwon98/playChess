 public class Bishop{
   int[][] board = new int[8][8];
   public Bishop(){
     
   }
   public void Bishop_move(int x, int y){
     int p = 0, q = 0;
     p = x; q = y;
     for(;p<=0;p--,q++){
       if(q<8)
         System.out.printf("%d %d ", p, q);
     }
     p = x; q = y;
     for(;p>=0;p--,q--){
       if(q>=0)
         System.out.printf("%d %d ",p,q);
     }
     p = x; q = y;
     for(;q>=0;p++,q--){
       if(p<8)
         System.out.printf("%d %d ",p,q);
     }
     p = x; q = y;
     for(;q<8;p++,q++){
       if(p<8)
         System.out,printf("%d %d ",p,q);
     }
   }
 }
       