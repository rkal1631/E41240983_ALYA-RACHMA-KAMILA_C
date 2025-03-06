/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisan;

/**
 *
 * @author alya
 */
public class Demo {
    public static void main(String[] args) {
        A SuperOb = new A();
        B SubOb = new B();
        
        System.out.println("SuperClass");
        SuperOb.x=10;
        SuperOb.y=20;
        SuperOb.TampilkanNilaiXY();
        
        System.out.println("SubClass");
        SubOb.x = 5;
        SubOb.y = 4;
        SubOb.TampilkanNilaiXY();
        
        SubOb.z=50;
        SubOb.TampilkanJumlah();
    }
}
