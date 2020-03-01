/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201900122;

/**
 *
 * @author USUARIO
 */
public class lista_palabras {
    String palabra;
    lista_palabras siguiente;
    
    public lista_palabras(){
        this.palabra = null;
        this.siguiente = null;
    }
    
    public lista_palabras(String palabra){
        this.palabra = palabra;
        this.siguiente = null;
    }
    
    public void insertar_palabra(String palabra){
        if (this.palabra==null){
            this.palabra = palabra;
            return;
        }
        if (this.siguiente==null){
            this.siguiente = new lista_palabras(palabra);
        }else{
            this.siguiente.insertar_palabra(palabra);
        }
    }
    
    public void ver_lista(){
        System.out.print(this.palabra+ "$");
        if(this.siguiente!=null)
            this.siguiente.ver_lista();
    }
}
