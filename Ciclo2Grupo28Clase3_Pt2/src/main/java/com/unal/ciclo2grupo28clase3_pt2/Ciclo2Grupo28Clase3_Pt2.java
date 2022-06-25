/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.unal.ciclo2grupo28clase3_pt2;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase3_Pt2 {

    public static final int GALLINA = 6;
    public static final int GALLO = 7;
    public static final int POLLITO = 1;

    public static void main(String[] args) {

        //System.out.println("Cantidad total de carne de aves=" + carneAves(40, 5, 230));
        //System.out.println("Vueltas:"+calcularVueltas(10,1,12,10000));
        //System.out.println("Total con intereses: $" + pagarIntereses(1000000));
        System.out.println("Contagiados despues de X dias:"+contagiados(10,2));
    }

    public static int carneAves(int N, int M, int K) {
        int totalCarne;
        int carneGallinas = N * GALLINA;
        int carneGallos = M * GALLO;
        int carnePollitos = K * POLLITO;
        totalCarne = carneGallinas + carneGallos + carnePollitos;
        return totalCarne;
    }

    public static double calcularVueltas(int P, int M, int H, double B) {
        double totalCuenta;
        double vueltas;
        int panes = P * 300;
        int bolsasLeche = M * 3300;
        int huevos = H * 350;
        totalCuenta = panes + bolsasLeche + huevos;
        vueltas = B - totalCuenta;
        return vueltas;
    }

    public static double pagarIntereses(double P) {
        double deuda = ((P * (3.0 / 100) + P) * 0.03) + P;
        return deuda;
    }

    public static int contagiados(int D, int C) {
        C = C * 2;
        if (D > 0) {
            D = D - 1;
            contagiados(D, C);
        }
        return C;
        //return (int) Math.pow(C,D);
    }

}
