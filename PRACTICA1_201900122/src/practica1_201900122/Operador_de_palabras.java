/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201900122;

import java.util.Scanner;

public class Operador_de_palabras {
    lista_palabras mi_lista = new lista_palabras();
    
    boolean insertar (){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");        
        Scanner teclado = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese la cantidad de palabras que desea ingresar en la sopa de letras");
        cantidad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("ingrese las palabras que desea ingresar en la sopa de letras, deacuerdo a la cantidad ingresada");
        String palabra;
        for(int contador = 0; contador<cantidad;contador++){
            System.out.println("Ingrese la palabra "+(contador+1)+": ");
            palabra = teclado.nextLine();
            if (palabra.length()>10){
                System.out.println("La palabra debe contener como maximo 10 caracteres");contador--;
            }else if (palabra.length()<5){
                System.out.println("la palabra debe contener como minimo 5 caracteres"); contador--;
            }else if (palabra.contains(" ")){
                System.out.println("debe de ingresar palabras completas, NO FRASES (sin espacios)"); contador--;
            }else
            {
                 mi_lista.insertar_palabra(palabra);
            }
        }
        mi_lista.ver_lista();
        teclado.nextLine();
        
        return true;
    }
    boolean insertar_todas(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cadena para todas las palabras");
        String cadena;
        cadena = teclado.nextLine();
        String[] palabras=cadena.split(cadena);
         for(int contador = 0; contador<palabras.length;contador++){
             String palabra = palabras[contador];
             if (palabra.length()>10){
                System.out.println("La palabra debe contener como maximo 10 caracteres");contador--;
            }else if (palabra.length()<5){
                System.out.println("la palabra debe contener como minimo 5 caracteres"); contador--;
            }else if (palabra.contains(" ")){
                System.out.println("debe de ingresar palabras completas, NO FRASES (sin espacios)"); contador--;
            }else
            {
                 mi_lista.insertar_palabra(palabra);
            }
         }                
        mi_lista.ver_lista();
        return true;
    }
}
  
