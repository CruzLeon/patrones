package com.javastudy.javacore.service.solid;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class L {

    /**
     * El principio de sustitucion de liskov indica la forma correcta en que se debe establecer la herencia
     *
     * Indica que las subclases deben poder reemplzar a su superclase sin romper el codigo esto es:
     *
     *  Que la logica que se define en la subclase no debe alterar la logica esperada de la superclase;
     *
     *
     *  Esto se ve facilmente cuando una implementacion de un metodo en una subclase no es soportado y lanza una excepcion
     *  Esto es un mal diseño cuando se sustituye por la subclase genera una excepcion.
     */

    /**
     * Lo correcto es usar interfaces y composicion en vez de herencia forzada que rompa comportamientos en la clase padre
     */
    interface Ave{

        default void volar(){
            System.out.println("vuelo");
        };
    }

    static class Pinguino implements Ave{
        @Override
        public void volar() {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        Ave ave = new Pinguino();
        //Un pinguino no puede ser trato como un ave por lo que genera excepcion
        ave.volar();
    }


}
