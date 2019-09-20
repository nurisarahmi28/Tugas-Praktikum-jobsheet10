/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum;


public class Tugaspraktikum02 {
    
    public static void main(String[] args) {
        int[] data = new int[]{83, 76, 45, 90, 85, 80, 78,74};
        System.out.println("Data pada Array :");
        for (int n = 0; n < data.length; n++) {
            System.out.print(data[n] + "\t");
            
            
        }
        double rtrt = 0;
        for(int r=0; r <data.length; r++)
            rtrt+=data[r]; rtrt/=data.length;
            System.out.print("\nskor Rata-Rata pada Array : " + rtrt);
            System.out.println("\n");
            System.out.print("skor yang ada diatas rata rata : ");
        for(int h=0;  h<data.length; h++) {
            if(data[h]>rtrt){
                System.out.print(data[h]+"\t");
            }
        }    
           
            
     
        
    }
}
