/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan_6_Labeled_statement_continue;

/**
 *
 * @author  NIM               : A2.1900185
 *          NAMA              : Vildan Vinanda
 *          KELAS             : TI-1A
 *          Deskripsi Program : Percobaan_6_Labeled_statement_continue
 */
public class Grade6 {
    
    public static void main( String[] args )
{
outerLoop:
for( int i=0; i<5; i++ ){
for( int j=0; j<5; j++ ){
System.out.println("Inside for(j) loop"); //message1
if( j == 2 ) continue outerLoop;
}
System.out.println("Inside for(i) loop"); //message2
}
}
}
