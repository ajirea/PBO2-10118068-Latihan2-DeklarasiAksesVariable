/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10118068.latihan2.deklarasiaksesvariable;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Pada latihan ini, yaitu membuat program untuk
 * mendeklarasikan, mengisi, dan menampilkan variable
 */
public class PBO210118068Latihan1DeklarasiAksesVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi variable        
        int nilaiInt;
        final double PHI = 3.14; // penulisan konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        // memberi nilai ke variable
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        // menampilkan hasil
        System.out.println();
        System.out.println("Isi Variable Nilai = " + nilaiInt);
        System.out.println("Isi Variable PHI = " + PHI);
        System.out.println("Isi Variable Logika = " + nilaiLogika);
        System.out.println("Isi Variable Karakter = " + nilaiKarakter);
    }
    
}
