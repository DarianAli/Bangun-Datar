
package com.mycompany.inharitance;


public class Lingkaran extends Inharitance{
    double r;
    
    double luas(){
    double luas = (double) (Math.PI * r * r);
    System.out.println("");
    return luas;
    }
    
    double keliling(){
        double keliling = (double) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran = "+ keliling);
        return keliling;
    }
    
}    


