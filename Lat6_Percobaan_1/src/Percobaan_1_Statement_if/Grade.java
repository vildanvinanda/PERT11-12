/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan_1_Statement_if;

/**
 *
 * @author  NIM               : A2.1900185
 *          NAMA              : Vildan Vinanda
 *          KELAS             : TI-1A
 *          Deskripsi Program : Percobaan_1_Statement_if
 */
public class Grade {
    
    public static void main( String[] args )
{
double grade = 92.0;
if( grade >= 90 ){
System.out.println( "Excellent!" );
}
else if( (grade < 90) && (grade >= 80)){
System.out.println("Good job!" );
}
else if( (grade < 80) && (grade >= 60)){
System.out.println("Study harder!" );
}
else{
System.out.println("Sorry, you failed.");
}
}
}
