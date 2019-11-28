/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan_2_Statement_switch;

/**
 *
 * @author  NIM               : A2.1900185
 *          NAMA              : Vildan Vinanda
 *          KELAS             : TI-1A
 *          Deskripsi Program : Percobaan_2_Statement_switch
 */
public class Grade2 {
    
    public static void main( String[] args )
{
int grade = 92;
switch(grade){
case 100:
System.out.println( "Excellent!" );
break;
case 90:
System.out.println("Good job!" );
break;
case 80:
System.out.println("Study harder!" );
break;
default:
System.out.println("Sorry, you failed.");
}
}
}
