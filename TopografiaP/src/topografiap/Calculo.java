/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topografiap;

/**
 *
 * @author fam. moreno
 */
public class Calculo {
     public Calculo(Double[][] matris) {
        this.matris = matris;
    }

    
    public Double[][] getMatris() {
        return matris;
    }

    static Double matris [][];
     // calculo para tener en un vector las lecturas por vertices
    public static Double conversion(Double grados, Double minutos,Double segundos){
    
        minutos = minutos + (segundos/60);
        grados= grados + (minutos/60);
        
        return grados;
    
    }
    public static void CrearMatris(int vertices ){
        matris = new Double[vertices][4];
    
    }
    
    public static void llenarMatris (Double lectura1, Double lectura2, Double lectura3, Double lectura4,int estacion){
        int Estacion = estacion -1;
       
       matris[Estacion][0] = lectura1;
       matris[Estacion][1] = lectura2;
       matris[Estacion][2] = lectura3;
       matris[Estacion][3] = lectura4;
       
        System.out.println(matris[1][3]);
    }
}
