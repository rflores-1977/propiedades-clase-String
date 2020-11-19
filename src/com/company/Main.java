package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

    /*    System.out.println("Escribe una Oracion");
        String oracion = rd.nextLine();
        int pos = oracion.indexOf('a'); // esta opcion es para encontrar la posicion de una letra,si no encuentra ninguna 'a' devuelve un -1
        System.out.println(pos);
        int tamaño = oracion.length();// esta opcion es para determinar el tamaño de la oracion incluyendo espacios
        System.out.println(tamaño);
        String parte = oracion.substring(0,4);// esta opcion es para extraer una parte de la oracion, escogemos el rango que deseamos extraer de la oracion
        System.out.println(parte);
        boolean igual = oracion.equals("hola"); // esta opcion es para comparar si la cadena de texto es igual
        System.out.println(igual);
        String concatenar = oracion.concat(" Mundo");// esta opcion es para concatenar la cadena ingresada con la de los parentesis
        System.out.println(concatenar);
        String reemplazar = oracion.replace("hola","Hola"); //esta opcion es para cambiar una cadena de texto por otra
        System.out.println(reemplazar);

        */
        System.out.println("Ingrese una cadena de texto");
        String cadena = rd.nextLine();
        System.out.println("Ingrese la letra a buscar en la cadena de texto");
        char c = rd.next().charAt(0);

        int cantidad = Buscar(cadena,c);
        System.out.println("Hay "+cantidad+" "+c+" en "+cadena);

    }

    //LA FUNCION RECIBIRA UNA CADENA DE TEXTO Y UN CHAR, BUSCARA LA CANTIDAD DE CARACTERES EXISTENTES EN ESA CADENA

    public static int Buscar (String val, char c){
        int cont = 0;
        char arreglo [] = val.toCharArray();// pasamos la cadena a un areglo de char

        for(int x = 0;x < arreglo.length;x++){ //con este ciclo se cuenta cuantas veces se repite el char
            if (arreglo[x]==c){ //si la posicion del arreglo es igual al char lo cuenta, si no sigue con la otra posicion
                cont++;
            }
        }
        return cont;
    }


}

