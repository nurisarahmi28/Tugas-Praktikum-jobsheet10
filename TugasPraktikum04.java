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
public class TugasPraktikum04 {
    
    public static void main(String[] nuris) {
        Scanner risa = new Scanner(System.in);
        String search;
        System.out.print("Masukkan sebuah kata/kalimat: ");
        search = risa.nextLine();
        
        int L = 0;
        for (int e = 0; e < search.length(); e++) {
            if (search.charAt(e) == 'e') {
               L++; 
            }
        }
        int d = 0;
        for (int r = 0; r < search.length(); r++) {
            if (search.charAt(r) == 'r') {
                d++;
            }
        } 
        int y = 0;
        for (int n = 0; n < search.length(); n++) {
            if (search.charAt(n) == 'n') {
                y++;
            }
        }
        int a = 0;
        for (int o = 0; o < search.length(); o++) {
            if (search.charAt(o) == 'o') {
                a++;
            }
        }
        System.out.println("Jumlah huruf a pada kalimat di atas adalah " + a);
        System.out.println("Jumlah huruf y pada kalimat di atas adalah " + y);
        System.out.println("Jumlah huruf d pada kalimat di atas adalah " + d);
        System.out.println("Jumlah huruf L pada kalimat di atas adalah " + L);
    }
}
        
        
        
    

