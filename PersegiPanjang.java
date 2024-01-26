
package com.mycompany.inharitance;

public class PersegiPanjang extends Inharitance {
    double panjang;
    double lebar;
    
    double luas(){
    double luas = panjang * lebar;
    System.out.println("Luas Persegi Panjang = "+ luas);
    return luas;
}
    double keliling(){
        double kLL = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang = "+ kLL);
        return kLL;
    }
}

