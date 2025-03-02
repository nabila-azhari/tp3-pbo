/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpmod3;

/**
 *
 * @author USER
 */
public class TPMOD3 {

    public static void main(String[] args) {
        PRODI pr1 = new PRODI("Informatika");
        PRODI pr2 = new PRODI("Data Science");
        Mahasiswa mhs1 = new Mahasiswa("Bruce Wayne", pr1);
        Mahasiswa mhs2 = new Mahasiswa("Tony Stark", pr2);
    
        mhs1.displayMahasiswa();
        mhs2.displayMahasiswa();
    }
}
