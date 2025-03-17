package com.javastudy.javacore.service.trycatch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.Closeable;
import java.io.IOException;

@Slf4j
@Component
public class TryCatchWithResources {

    /**
     * Desde java 7+ permite el cierre de recursos en la sentencia try evitando codigo repetitivo o problemas de fuga de memoria
     * los recursos indicados en la sentencia deben implementar la interfaz close o autocloseable
     */

    public static class MyResource implements Closeable {

        void init(){
            System.out.println(">>> MOCK INIT process");
        }
        @Override
        public void close()  {
            System.out.println(">> Ending process");
        }
    }

    public static void main(String[] args) {
        try(MyResource resource = new MyResource()){
            resource.init();
        }
        System.out.println("Finish");
    }

}
