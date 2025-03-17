package com.javastudy.javacore.service.trycatch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TryCatch implements CommandLineRunner {

    /**
     * Las buenas practicas indican que esta mal capturar exception de forma generica, siempre se debera especificar
     * el tipo de Excepcion que se espera manejar, asi el codigo tendra mas legibilidad
     */
    static void badPractice(){
        try{
            int a = 1/0;
        }catch (Exception e){
            log.error(">>> bad practice catch general exception");
        }
    }

    static void goodPractice(){
        try{
            int a = 1/0;
        }catch (ArithmeticException e){
            log.error(">>> good practice trying catch specific exception");
        }

    }
    @Override
    public void run(String... args) throws Exception {
        badPractice();
        goodPractice();
    }
}
