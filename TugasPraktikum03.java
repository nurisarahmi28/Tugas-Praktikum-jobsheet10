/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum;

/**
 *
 * @author nuris
 */

public class TugasPraktikum03 {
   
     public static void main(String[] args) {
        int[] data = new int[]{92, 98, 76, 72, 84, 101, 39};
        System.out.print("data pada array ");
        for(int i=0;i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        
        System.out.println("\n");
        System.out.print("Nilai yang merupakan kelipatan 3 adalah ");
        System.out.println("\n");
        for (int r = 0; r < data.length; r++) {
                if (data[r]%3 == 0) {
                        System.out.println(data[r]);
     }
}
     }
}

        
        
        

            
            
        
        
         


           
        
        
    
