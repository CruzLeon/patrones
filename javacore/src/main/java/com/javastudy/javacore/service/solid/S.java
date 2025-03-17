package com.javastudy.javacore.service.solid;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class S {

    /**
     * Son principios clave para diseñar clases escalables mantenibles y codigo limpio en la POO
     */

    /**
     * principio de responsabilidad Unica, establece que una clase solo debe tener un motivo para cambiar
     * ejemplo
     * una clase que genera un proceso y luego lo guarda, son dos conceptos o motivos diferentes de cambio
     * <p>
     * la clase que genera deberia componerse de una clase que se encargue de guardar y asi modular el comportamiento
     */

    private int dobuleValor = 123;

    public static class AumentarImpuesto {

        /**
         * Solo hay una razon para cambio si se modifica la forma de los impuestos
         *
         * @param s
         */
        public void calcular(S s) {
            System.out.println("Logica de negocio u otros calculos");
            int calculo = 345;
            s.setDobuleValor(calculo + s.getDobuleValor());
        }
    }


}
