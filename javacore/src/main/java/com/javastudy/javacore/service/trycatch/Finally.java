package com.javastudy.javacore.service.trycatch;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Slf4j
public class Finally {

    /**
     * Se ejecuta siempre haya o no excepciones
     * idel para liberar recursos o manejar limpieza de codigo
     * <p>
     * mejora con java+7 try catch with resources
     */

    static void cleanResources() {
        Lock lock = new ReentrantLock();
        try {
            lock.lock();
        } finally {
            lock.unlock();
        }
    }

    /**
     * Malas practicas, utilizar return en un finally ya que puede cambiar el valor de retorno de manera inesperada
     */

    static void badPractice1() {
        int a;
        try {
            a = 3;
        } finally {
            a = 5;
        }
        System.out.println(a); //Expected 3 but it's 5
    }

    /**
     * Mala practica una excepcion en finally sobre escribe las excepciones originales del bloque, para que se guarde
     * el registro se debera atrapar esta excepcion en un bloque try catch
     *
     * @param args
     */

    static void badPracticeSuppressedExc() {
        try {
            throw new IllegalArgumentException("arg 1|");
        } catch (IllegalStateException e) {
            throw new RuntimeException("interrump catch");
        } finally {
            throw new ArithmeticException("My aritmetic"); //Oculta toda la llamada de excepciones
        }
    }

    static void handlePracticeSuppressedExc() {
        try {
            throw new IllegalArgumentException("arg 1|");
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("interrump catch");
        } finally {
            /**
             * Lo mas recomendable es que un bloque finally nunca lance una excepcion-
             */
            try {
                throw new ArithmeticException("My aritmetic"); //Oculta toda la llamada de excepciones
            } catch (Exception e) {
                log.error(">>> error en finaly", e);
            }
        }
    }

    static void goodPracticeSuppressedExc() {
        Exception err = null;
        try {
            throw new IllegalArgumentException("arg 1|");
        } catch (IllegalArgumentException e) {
            err = new RuntimeException("interrump catch", e); //Encadenar la excepcion si se relanza otra
        } finally {
            //Si es totalmente necesario lanzar una exepcion en try se encadena
            throw new RuntimeException("My aritmetic", err); //Oculta toda la llamada de excepciones
        }
    }

    public static void main(String[] args) {
        cleanResources();
        badPractice1();
        try {
            badPracticeSuppressedExc();
        } catch (Exception e) {
            log.error(">>> bad practice", e);
        }

        try {
            handlePracticeSuppressedExc();
        } catch (Exception e) {
            log.error(">>> good practice", e);
        }
        System.out.println("---------------");
        goodPracticeSuppressedExc();
    }
}
