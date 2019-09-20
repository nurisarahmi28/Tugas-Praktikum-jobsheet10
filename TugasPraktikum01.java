/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum;

import java.util.Scanner;

/**
 *
 * @author nuris
 */
public class TugasPraktikum01 {
    
    public static void main(String[] args) {
        int N = 0;
        int cari;
        Scanner ris = new Scanner(System.in);
        int[] data = new int[]{74, 98, 72, 74, 72, 90, 81, 72};
        System.out.println("Data pada array");
        for (int j = 0; j < data.length; j++) {
            System.out.print(data[j] + "\t");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Masukkan nilai yang akan dicari");
        cari = ris.nextInt();
    
for (int n =0; n < data.length; n++) {
    if (cari == data[n]) {
        N++;
    }
   
}
    System.out.println("Nilai " + cari + " ditemukan sebanyak " + N + " kali ");
    if (N == 0) {
        System.out.println("Data yang anda cari tidak ditemukan!");
    }
    }
}


    

    

      
            
       
        
 

            
       
                
        
    
