/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.quickstart.log4j.ujian_123040019;

/**
 *
 * @author SB 604-01
 */
public class Soal {

    public int pangkat(int bil1, int pangkat) {
        int hasil = 0;
        int n = 1;
        while (n <= pangkat) {
            n++;
            hasil *= bil1;
        }
        return hasil;
    }
     public int faktorial(int bil1) {
        int hasil = 1;
         for (int i = 0; i < bil1; i++) {
             hasil *= bil1;
         }
        return hasil;
    }
    public int perkalian(int bilA, int bilB){
        return bilA * bilB;
    }
}
