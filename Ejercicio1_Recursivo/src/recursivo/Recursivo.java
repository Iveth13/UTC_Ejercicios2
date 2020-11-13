/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivo;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Iveth Mariana Serna
 */
public class Recursivo {

    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<Integer>(Arrays.asList(new Integer[]{10,3,4,7,6,3,5}));
        int n = 15;
        combinacionesSuma(numeros, n, new ArrayList<Integer>());
    }
    public static void combinacionesSuma(ArrayList<Integer> numeros, int n, ArrayList<Integer> Suma){
        int combinacion = 0;
        for (int x: Suma) combinacion+= x;
        if (combinacion == n)
            System.out.println("La suma de combinaciones es ("+Arrays.toString(Suma.toArray())+"="+ n);
        if (combinacion >= n)
            return;
        for (int i= 0; i<numeros.size(); i++){
            ArrayList<Integer> restante = new ArrayList<Integer>();
            int numero = numeros.get(i);
        for (int c=i+1; c<numeros.size(); c++)
            restante.add(numeros.get(c));
        ArrayList<Integer> Suma_a = new ArrayList<Integer> (Suma);
        Suma_a.add(numero);
        combinacionesSuma(restante, n, Suma_a);
        } 
    }
    
}
