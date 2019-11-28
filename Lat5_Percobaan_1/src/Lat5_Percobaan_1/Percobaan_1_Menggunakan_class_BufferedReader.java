/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat5_Percobaan_1;

/**
 *
 * @author  NIM               : A2.1900185
 *          NAMA              : Vildan Vinanda
 *          KELAS             : TI-1A
 *          Deskripsi Program : Percobaan_1_Menggunakan_class_BufferedReader
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Percobaan_1_Menggunakan_class_BufferedReader {
    public static void main( String[] args ){
BufferedReader dataIn = new BufferedReader(new InputStreamReader(
System.in) );
    
        
String name = "";
System.out.print("Please Enter Your Name:");
try{
name = dataIn.readLine();
}catch( IOException e ){
System.out.println("Error!");
}
System.out.println("Hello " + name +"!");
    }
}

