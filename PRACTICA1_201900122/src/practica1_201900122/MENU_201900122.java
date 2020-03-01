/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201900122;
import java.util.Scanner;


/**
 *
 * @author USUARIO
 */
public class MENU_201900122 {
    Operador_de_palabras Mi_Operador = new Operador_de_palabras();
    
    public boolean MENU_PRINCIPAL(){
        String palabra;
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        while (!salir){      
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("############## MENU PRINCIPAL ##############");
            System.out.println("## 1) MENU NUEVA PARTIDA ##");
            System.out.println("## 2) HISTORIAL DE PARTIDAS ##");
            System.out.println("## 3) MOSTRAR PUNTUACIONES MAS ALTAS ##");
            System.out.println("## 4) MOSTRAR MOSTRAR JUGADORES QUE NO ENCONTRARON TODAS LAS PALABRAS ##");
            System.out.println("## 5) MOSTRAR MOSTRAR JUGADORES QUE  ENCONTRARON TODAS LAS PALABRAS ##");
            System.out.println("## 6) MOSTRAR INFORMACION DE ESTUDIANTE  ##");
            System.out.println("## 7) SALIR  ##");       
            System.out.print("escriba el n[umero de opcion a la que desea ingresar: \n");
            palabra = teclado.nextLine();
            switch (palabra){
                case "1":
                    NUEVA_PARTIDA();
                    break;
                case "2":
                    HISTORIAL_DE_PARTIDAS();
                    break;
                case "3":
                    MOSTRAR_PUNTUACIONES_MAS_ALTAS();
                    break;
                case "4":
                    MOSTRAR_JUGADRES_QUE_NO_ENCONTRARON_TODAS_LAS_PALABRAS();
                    break;
                case "5":
                    MOSTRAR_JUGADRES_QUE_ENCONTRARON_TODAS_LAS_PALABRAS();
                    break;
                case "6":
                    MOSTRAR_INFORMACION_DE_ESTUDIANTWE();
                    break;
                case "7":
                    System.exit(0);
                    break; // recursividad, se llama al metodo para que se ejecute otra vez, lo regresa al menu anterior               
                default : System.out.println("ERROR, porfavor ingrese un numero entero del 1 al 7");

            }
        }
         return true;
     }
    
   public boolean HISTORIAL_DE_PARTIDAS(){
       return true;
   }
   public boolean MOSTRAR_PUNTUACIONES_MAS_ALTAS(){
       return true;
   }
    public boolean MOSTRAR_JUGADRES_QUE_NO_ENCONTRARON_TODAS_LAS_PALABRAS(){
        return true;
    }
    public boolean MOSTRAR_JUGADRES_QUE_ENCONTRARON_TODAS_LAS_PALABRAS(){
        return true;
    }
    public boolean MOSTRAR_INFORMACION_DE_ESTUDIANTWE(){
        return true;
    }
    public boolean NUEVA_PARTIDA(){
        String palabra;
        boolean regresar =true;
        Scanner teclado = new Scanner (System.in);
        while (regresar=true){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("############## NUEVA PARTIDA ##############");
        System.out.println("## 1) MENU PALABRAS ##");
        System.out.println("## 2) JUGAR ##");
        System.out.println("## 3) TERMINAR PARTIDA ##");
        System.out.print("escriba el numero de opcion a la que desea ingresar: \n");
        palabra = teclado.nextLine();
     switch(palabra){
            case "1":
                MENU_PALABRAS();
                break;
            case "2":
                JUGAR();
                break;
            case "3":
                regresar =true;
                break;
         default : System.out.println("ERROR, porfavor ingrese un numero entero del 1 al 3");       
        } 
        }
        return true; 
      }
     public boolean JUGAR(){
         return true;
     }
      public boolean TERMINAR_PARTIDA(){
         return true;
     }
     public boolean MENU_PALABRAS(){
        String palabra;
        boolean salir =true;
        Scanner teclado = new Scanner (System.in);
        while (salir){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("############## MENU PALABRAS ##############");
        System.out.println("## 1) insertar ##");
        System.out.println("## 2) insertar todas ##");
        System.out.println("## 3) modificar ##");
        System.out.println("## 4) salir ##");
        System.out.print("escriba el n[umero de opcion a la que desea ingresar: \n");
        palabra = teclado.nextLine();
        switch (palabra){
            case "1":
                Mi_Operador.insertar();
                break;
            case "2":
                INSERTAR_TODAS();
                break;
            case "3":
                MODIFICAR();
                break;
            case "4":
                salir=false;
                break;
            default: System.out.println("porfavor ingrese un numero del 1 al 4");
        }
        }
        return true; 
    }
   public boolean INSERTAR(){
       return true;
   }
   public boolean INSERTAR_TODAS(){
       return true;
   }
   public boolean MODIFICAR(){
       return true;
   }
    public MENU_201900122(){
        
    }
    // este es el metodo constructor
    public void inicio(){               
        
    }

     public boolean insertar(){
        return true;
    }
    
    public boolean insertar_todas(){
       return true;
    }
    
    public boolean modificar(){
        return true;
    }
    
    public boolean salir(){
        return true;
    }
  
    
    public boolean jugar(){
        return true;      
    }
    
    public boolean terminar_partida(){
        return true;
    }
    
    
     
}
