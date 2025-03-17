package com.javastudy.javacore.service.fundamentals;

public abstract class Herencia {

    abstract void doSomething();

    /**
     * La herencia es un paradigma o mecanisco
     *
     * permite la reutilizacion de codigo sin duplicarlo para clases relacionadas
     * facilita la organizacion del codigo
     *
     *
     */

    /**
     * El poliformismo en un principio o concepto de la POO
     *
     * va relacionado con la herencia
     * permite que un metodo tenga diferentes implementaciones o comportamientos segun el contexto dado
     *
     * esto parmite manejar diferentes comportamientos de manera limpia
     */

    public static class MyOneClass extends Herencia{

        @Override
        void doSomething() {
            System.out.println("something one class implementation");
        }
    }

    public static class MyTwoClass extends Herencia{

        @Override
        void doSomething() {
            System.out.println("Some diferent implementation in two class");
        }
    }

    public static void main(String[] args) {
        Herencia a = new MyOneClass(); //Contextos diferentes
        Herencia b = new MyTwoClass(); //Contextos diferentes

        a.doSomething();
        b.doSomething();
    }



}
