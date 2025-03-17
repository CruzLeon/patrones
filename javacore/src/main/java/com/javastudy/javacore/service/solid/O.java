package com.javastudy.javacore.service.solid;

import org.springframework.boot.autoconfigure.ssl.SslProperties;

public class O {

    /**
     * El principio abierto cerrado indica que las clases deben estar abiertas para su extension cerrado para su modifiacion
     *
     * Este principio se aplica utilizando poliformismo para evitar modificar codigo existente, y que cada comportamiento tenga su
     * propia clase,
     *
     * asi, en vez de tener if en el codigo condicionandolo estaticamente a comportamientos, el comportamiento ya no es establecido
     * en la clase sino que es un parametro del proceso
     */

    static void badPractice(String forma){
        if("circulo".equalsIgnoreCase(forma)){
            System.out.println("hACE ALFO con la lofica de forma");
        }
        if("tri".equalsIgnoreCase(forma)){
            System.out.println("Hace algo con otra lofica de forma");
        }
    }

    interface Forma{
        void doSomething();
    }

    class Circulo implements Forma{

        @Override
        public void doSomething() {
            System.out.println("hago algo siendo ciruclo");
        }
    }

    class Try implements Forma{

        @Override
        public void doSomething() {
            System.out.println("hago algo siendo try");
        }
    }

    static void goodPractice(Forma forma){ //Puedo añador mas comportamientos sin afectar este metodo
        forma.doSomething();
    }
    public static void main(String[] args) {
        O.badPractice("tri");
        O.badPractice("another"); //Si agrego otra funcionalidad debo modificar la lofica de la clase base para otra funcionalidad

        O.goodPractice(new O().new Circulo()); //El comportamiento lo especifico como parametro
        O.goodPractice(new O().new Try());
    }
}
