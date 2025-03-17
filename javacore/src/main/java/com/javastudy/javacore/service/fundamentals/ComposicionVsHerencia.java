package com.javastudy.javacore.service.fundamentals;

public abstract class ComposicionVsHerencia {
    /**
     * La composicion es una tecnica de diseño que permite la reutilizacion de codigo y la modularidad
     *
     * se prefiere sobre la herencia cuando no hay una relacion "es un", ya que permite mayor flexibilidad y reduce el acoplamiento
     * entre clases ya que es mas facil modificar partes de la aplicacion sin que se vean muchas clases afectadas
     */

    /**
     * La composicion permite la returilizacion de codigo y especificar comportamientos,
     * y las interfaces permiten abstraer comportamientos sin acomplar a una implementacion especifica.
     */

    public interface MyAction{
        void doSomethig();
    }

    static class BehaviourOne implements MyAction{

        @Override
        public void doSomethig() {
            System.out.println(">>> codigo centralizado para un comportamiento uno");
        }
    }


    static class BehaviourTwo implements MyAction{

        @Override
        public void doSomethig() {
            System.out.println(">>> codigo centralizado para un comportamiento diferente tow");
        }
    }

    static class MyObject{

        private MyAction myAction;
        void doit(MyAction myAction){
            System.out.println("compórtamiento priopio de la clase");
            myAction = new BehaviourOne();
            myAction.doSomethig(); //Reutilizacion de un comportamiento,
            // si en algun futuro se debe cambiar este comportamiento solo se debe crear una nueva implementacion
        }
    }

    public static void main(String[] args) {
        new MyObject().doit(new BehaviourOne());
        new MyObject().doit(new BehaviourTwo());
    }

}
