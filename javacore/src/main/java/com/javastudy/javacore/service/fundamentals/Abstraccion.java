package com.javastudy.javacore.service.fundamentals;

public abstract class Abstraccion {

    /**
     * La abstraccion es un principio o concepto de la POO
     *
     * permite definir comportamientos sin especificar su implementacion
     *
     * Para esto se utilizan contratos, es decir interfaces o clases abstractas
     *
     *
     */

    public interface MyInter{
        public String callString(); //Define comportamientos sin entrar en detalles,
        //Los metodos por defecto son public static, "publicos y estaticos"
    }
}
