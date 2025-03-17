package com.javastudy.javacore.service.fundamentals;

public class Encapsulation {

    /**
     * La encapsulacion es un principio o concepto
     *
     * permite ocultar detalles internos de una clase, y evita que se hagan cambios no controlados en la clase
     * esto se hace a traves de los metodos getter y setter respectivos
     */

    public static class MyClass{
        private  int miValue;

        public void setMiValue(int miValue) {
            if(miValue== 0){
                throw new IllegalArgumentException(""); //Permite controlar los cambios en la clase a traves de setters
            }
            this.miValue = miValue;
        }
    }




}
