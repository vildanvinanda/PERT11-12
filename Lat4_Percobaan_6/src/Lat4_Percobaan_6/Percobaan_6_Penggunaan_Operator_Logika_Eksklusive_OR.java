/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat4_Percobaan_6;

/**
 *
 * @author  NIM               : A2.1900185
 *          NAMA              : Vildan Vinanda
 *          KELAS             : TI-1A
 *          Deskripsi Program : Percobaan_6_Penggunaan_Operator_Logika_Eksklusive_OR 
 */
public class Percobaan_6_Penggunaan_Operator_Logika_Eksklusive_OR {
    
    public static void main( String[] args ){
boolean val1 = true;
boolean val2 = true;
System.out.println(val1 ^ val2);
val1 = false;
val2 = true;
System.out.println(val1 ^ val2);
val1 = false;
val2 = false;
System.out.println(val1 ^ val2);
val1 = true;
val2 = false;
System.out.println(val1 ^ val2);
}
}

