package com.javastudy.javacore.service.trycatch;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Slf4j
public class CheckedVsUnchecked {
    /**
     * Se suelen manejar excepciones checked es decir aquellas que extienden de la clase Exception y que obliga
     * a manejarlas o indicarlas, para errores ne negocio o del usuario.
     */

    /**
     * Las excepciones unchecked cuando son problemas de programacion o logico.
     */

    public static class MyChecked extends Exception {
        public MyChecked(String message) {
            super(message);
        }

        public MyChecked(String message, Throwable cause) {
            super(message, cause);
        }
    }

    /**
     * Unchecked extienden de runtime
     */

    public static class MyUnchecked extends RuntimeException {
        public MyUnchecked(String message) {
            super(message);
        }

        public MyUnchecked(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void main(String[] args) {
        try{
            throw new MyUnchecked("my message");
        }catch (Exception e){}

        try { //Obliga a manejarla
            throw new MyChecked("my message");
        } catch (MyChecked e) {
            throw new RuntimeException(e);
        }
    }
}
