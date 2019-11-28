/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan_3_Perbandingan_Object;

/**
 *
 * @author  NIM               : A2.1900185
 *          NAMA              : Vildan Vinanda
 *          KELAS             : TI-1A
 *          Deskripsi Program : Percobaan_3_Perbandingan_Object
 */
public class EqualsTest {
    
    public static void main(String[] arguments) {
String str1, str2;
str1 = "Free the bound periodicals.";
str2 = str1;
System.out.println("String1: " + str1);
System.out.println("String2: " + str2);
System.out.println("Same object? " + (str1 == str2));
str2 = new String(str1);
System.out.println("String1: " + str1);
System.out.println("String2: " + str2);
System.out.println("Same object? " + (str1 == str2));
System.out.println("Same value? " + str1.equals(str2));
}
}
