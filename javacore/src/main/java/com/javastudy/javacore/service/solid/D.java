package com.javastudy.javacore.service.solid;

import com.javastudy.javacore.service.fundamentals.MetodosInterfacesJava8;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class D {

    /**
     * Dependency injection
     *
     * Depender de interfaces y no de implementaciones especificas
     * los detalles deben depender de las abstracciones
     *
     * Esto evita el acomplamiento a especificaciones,
     *
     * cuando se depende de interfaces, este comportamiento puede ser cambiado ("en main ejecucion..-") entre diferentes implementaciones
     * Sin afectar el codigo original de la clase base
     *
     */

    @Setter
    @AllArgsConstructor
    static class One{
        MetodosInterfacesJava8.MyBehaviour behaviour;

        void doit(){ //Los detalles dependen de las abstracciones
            behaviour.someLopgic();
        }

    }

    public static void main(String[] args) {
        One one = new One(new MetodosInterfacesJava8.MyBehaviour.MyClass());
        one.doit();

        one.setBehaviour(new MetodosInterfacesJava8.MyBehaviour() {
            @Override
            public String someLopgic() {
                System.out.println("Otro detalle de otro comportamiento sin afectar la clase base");
                return "";
            }
        });
        one.doit();
    }
}
