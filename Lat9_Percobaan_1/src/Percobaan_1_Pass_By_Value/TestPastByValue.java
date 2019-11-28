/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan_1_Pass_By_Value;

/**
 *
 * @author  NIM               : A2.1900185
 *          NAMA              : Vildan Vinanda
 *          KELAS             : TI-1A
 *          Deskripsi Program : Percobaan_1_Pass_By_Value
 */
public class TestPastByValue {
   
    public static void main(String[] args) {
int i = 10;
System.out.println(i);
test(i);
System.out.println(i);
}
public static void test(int j){
j = 33;
}
}
