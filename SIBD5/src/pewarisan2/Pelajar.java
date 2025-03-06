/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisan2;

/**
 *
 * @author alya
 */
public class Pelajar extends Orang{
    private String nim;
    private String asalSekolah;
    private double nilai;
    
    public Pelajar(String nama, double tinggi, double berat, String nim, String Sekolah, double nilai){
    super(nama,tinggi,berat);
    this.nim = nim;
    asalSekolah = Sekolah;
    this.nilai= nilai;
    }
    public String toString(){
    return (super.toString()+ "\nNIM: "+ nim + "\nSekolah: "+asalSekolah+"\nNilai: "+nilai);
    }
    
}
