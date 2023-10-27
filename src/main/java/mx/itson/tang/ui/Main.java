/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tang.ui;

import java.util.Scanner;

/**
 * Inicia el programa y determina el punto de partida de su ejecucion.
 * @author Luis Carlos.
 */
public class Main {
    //En esta primera parte funciona para que permita leer la cadena de texto que se ingresara 
   
    public static void main (String[] args){
     System.out.println("Ingrese los numeros telefonicos a ordenar");
        Scanner entrada = new Scanner(System.in);
  String numero = entrada.nextLine();
  
  //En esta parte es para que separe los numeros encontrados por coma    
  String [] telefonos = numero.split(",");
  
   //Esta parte permite contar los numeros y separarlos para su respectiva área
  int tijuana = 0;
  int hermosillo = 0;
  int guaymas = 0;
  int desconocidos = 0;
  //permite saber cuantos telefonos hay en cada área o si son desconocidos 
  for (String telefono : telefonos){
  if (telefono.startsWith("644")){
      tijuana++;
  }else if (telefono.startsWith("662")){
      hermosillo++;
      
  }else if (telefono.startsWith("622")){
     guaymas++;
    
  }else{
      desconocidos++;
  }
  }
   //En esta parte es para que imprima los resultados en pantalla 
System.out.println("Los numeros que son de Tijuana:"+tijuana);
System.out.println("Los numeros que son de Hermosillo:"+hermosillo);
        System.out.println("Los numeros que son de Guaymas:"+guaymas);
        System.out.println("Los numeros que son Desconocidos:"+desconocidos);
    }
    
    }
