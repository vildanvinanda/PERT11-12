/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan_3_Array_Multidimensi;

/**
 *
 * @author  NIM               : A2.1900185
 *          NAMA              : Vildan Vinanda
 *          KELAS             : TI-1A
 *          Deskripsi Program : Percobaan_3_Array_Multidimensi
 */
public class ArraySample3 {
    
    public static void main( String[] args ){
// Elemen 512 x 128 dari integer array
int[][] twoD = new int[512][128];
// karakter array 8 x 16 x 24
char[][][] threeD = new char[8][16][24];
// String array 4 baris x 2 kolom
String[][] dogs = {{ "terry", "brown" },
{"Kristin", "white" },
{"toby", "gray"},
{"fido", "black"}
};
System.out.print( dogs[0][0] );
}
}
