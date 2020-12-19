/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konvensi;

import static Konvensi.detikKeHari.detikKeHari;
import static Konvensi.jamKeMenit.jamKeMenit;
import java.util.Scanner;

/**
 *
 * @author X240
 */
public class Konvensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Masukkan konvensi :\n"
                    + "1. jam -> menit\n"
                    + "2. detik -> hari, jam, menit, detik");
        
        System.out.println("\nMasukkan Pilihan");
        try (Scanner options = new Scanner (System.in)){
            if(!options.hasNextInt()){
                System.out.println("itu alfabet, anda salah!!!");                
            }else {
                if(options.nextInt()== 1){
                    System.out.println("masukkan jam : ");
                    Scanner hours = new Scanner (System.in);
                    jamKeMenit(hours.nextInt());                    
        }else{
                    System.out.println("masukkan detik : ");
                    try (Scanner second = new Scanner(System.in));
                    detikKeHari(second.nextLong());
                }
        }
    }
    
}
}
}

    
