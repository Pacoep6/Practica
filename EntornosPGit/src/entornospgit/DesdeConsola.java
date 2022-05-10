/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornospgit;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class DesdeConsola {

    private ArrayList lista = new ArrayList();
    DesdeConsola() {
        int numIn = 0;
         try {
            
           Scanner sc = new Scanner(System.in);
            System.out.println("Introduce números enteros. Negativo para parar");
            
           
            while (((numIn = sc.nextInt()) >= 0)) {
                lista.add(numIn);
            }
            lista.sort(null);

        } catch (Exception e) {
            System.out.println(e);
        }
     }

    public void maximo() {
        //variables
        System.out.println("El mayor es " + lista.get(lista.size() - 1));

        //selecciono la ruta


    }

    public void minimo() {
        //insertar codigo
        System.out.println("El menor es " + lista.get(0));
    }
}



