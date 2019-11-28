/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan_1_Menangani_Exception_handling;

/**
 *
 * @author  NIM               : A2.1900185
 *          NAMA              : Vildan Vinanda
 *          KELAS             : TI-1A
 *          Deskripsi Program : Percobaan_1_Menangani_Exception_handling
 */
public class ExceptionExample {
    
    public static void main( String[] args ){
try{
System.out.println( args[1] );
}catch( ArrayIndexOutOfBoundsException exp ){
System.out.println("Exception caught!");
}}}
