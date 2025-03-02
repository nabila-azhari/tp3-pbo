/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmod3;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    String nama;
    PRODI prodi;
    
    public Mahasiswa(String nama, PRODI prodi){
        this.nama = nama;
        this.prodi = prodi;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getProdi(){
        return prodi.getNama();
    }
    
    public void setProdi(PRODI prodi){
        this.prodi = prodi;
    }
    
    public void displayMahasiswa(){
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Prodi: " + prodi.getNama());
    }
}
