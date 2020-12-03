package Lab;
/**
*This class implements my first application in Java
* @author Roman
* @version 001
* @since 2020.10.15
* */
public class MRS {
   public static void main(String[] args) {
     /**
        *This method will output my name to the console
      *@param args Unused.
      *@return Nothing.
      * */
       System.out.println("Grop: 535st1");
       System.out.println("Srudent Morgunov Roman Sergeevich");       
       System.out.println("Variant 14");
       
       String[] rar1= {
       "***             ***   ##########     %%%%%%%%\n",           
       "****           ****   ##       ##   %%\n",
       "** **         ** **   ##        ##  %%\n",
       "**  **       **  **   ##        ##  %%\n",
       "**   **     **   **   ##       ##    %%%%%%%%%\n",
       "**    **   **    **   #########               %%\n",
       "**     ** **     **   ##       ##             %%\n",
       "**      ***      **   ##        ##            %%\n",
       "**       *       **   ##         ##   %%%%%%%%\n "            
       };
    
       for(int i= 0; i<rar1.length; i++) {
         System.out.print(rar1[i]);
       };
   }
}


