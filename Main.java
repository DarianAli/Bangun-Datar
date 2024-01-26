
package com.mycompany.inharitance;

public class Main {
    public static void main (String[] args){
        
//        membuat objek bangun datar
    Inharitance bangundatar = new Inharitance();
    
//    membuat objek persegi dan mengisi nilai properti
    Persegi persegi = new Persegi();
    persegi.sisi = 2;
    
//    Lingkaran
    Lingkaran lingkaran = new Lingkaran();
    lingkaran.r = 22;
    
//    PersegiPanjang
    PersegiPanjang persegipanjang = new PersegiPanjang();
    persegipanjang.lebar = 4;
    persegipanjang.panjang = 8;
    
//    segitiga
    SegiTiga segitiga = new SegiTiga();
    segitiga.alas = 12;
    segitiga.tinggi = 8;
    
//    Luas dan Keliling
    bangundatar.luas();
    bangundatar.keliling();
    
    persegi.luas();
    persegi.keliling();
    
    lingkaran.luas();
    lingkaran.keliling();
    
    persegipanjang.luas();
    persegipanjang.keliling();
    
    segitiga.luas();
    segitiga.keliling();
    }
    
}
