package com.javastudy.javacore.service.generics;

import java.util.List;

public class Generic {

    /**
     * Los genericos permiten escribir codigo reutilizable en tiempo de compilacion
     * evitando errores de tipo se aplican en clases metodos e interfaces
     */

    /**
     * El uso mas frecuente es el que ya viene implementado en java en las colecciones cuandose define
     * el tipo de dato parametrizado
     *
     * y tambien utiles en clases utilitarias
     */

    /**
     * El problema original es utilizar el tipo de dato Object para cuando se necesita un comportamiento general,
     * asi cada vez que se recupere el objeto se necesita un casteo explicito lo cual es suceptible a errores de class cast exception
     */

    /**
     * El tipo de dato generico evita el casteo ya que este tipo de dato se elimina en tiempo de ejecuicion y se setea por Object
     * Evita el casteo en tiempo de compilacion
     */

    public static <T> void imprimirLista(List<T> lista) {
        for (T obj : lista) {
            System.out.println(obj);
        }
    }

    public static <T> void agregarElemento(List<T> lista, T elemento) {
        lista.add(elemento);
    }

    public static <T> void add(List<T> lista, T t) {
        lista.add(t);
        for (T t2 : lista) {
            System.out.println(t2);
        }
    }


    public static void main(String[] args) {
        List<Integer> enteros = List.of(1, 2, 3);
        List<String> palabras = List.of("Hola", "Mundo");
        add(enteros, 1);

    }
}
