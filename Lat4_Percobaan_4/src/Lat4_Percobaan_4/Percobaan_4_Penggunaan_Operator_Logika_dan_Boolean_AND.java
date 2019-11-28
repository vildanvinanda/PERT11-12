/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat4_Percobaan_4;

/**
 *
 * @author  NIM               : A2.1900185
 *          NAMA              : Vildan Vinanda
 *          KELAS             : TI-1A
 *          Deskripsi Program : Percobaan_4_Penggunaan_Operator_Logika_dan_Boolean_AND
 */
public class Percobaan_4_Penggunaan_Operator_Logika_dan_Boolean_AND {
    
    public static void main( String[] args ){
int i = 0;
int j = 10;
boolean test= false;
//demonstrasi &&
test = (i > 10) && (j++ > 9);
System.out.println(i);
System.out.println(j);
System.out.println(test);
//demonstrasi &
test = (i > 10) & (j++ > 9);
System.out.println(i);
System.out.println(j);
System.out.println(test);
}
}
