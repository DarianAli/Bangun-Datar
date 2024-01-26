
package com.mycompany.inharitance;


    
    public class Persegi extends Inharitance{
        
        double sisi;
        
        
        double luas(){
            double luas = sisi * sisi;
            System.out.println("Luas Persegi = "+ luas);
            return luas;
        }
        
        double keliling(){
            double keliling = 4 * sisi;
            System.out.println("Keliling persegi = "+ keliling);
            return keliling;
        }
    }

