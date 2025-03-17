package com.javastudy.javacore.service.fundamentals;

public class MetodosInterfacesJava8 {

    /**
     *  Desde java 8 una interfaz puede tener metodos estaticos y metodos por default "con una implementacion"
     *
     *  Estos metodos se crearon cuando se necesita por alguna razon definir o agregar nuevas funcionalidades a una interfax
     *  pero sin romper las clases existentes
     *
     *  Tambien cuando se quiere agregar un comportamiento opcional pero sujeto a que pueda sobre escribirse
     */

    /**
     * Si una clase implementa varias interfaces con la misma firma del metodo default esta clase debera sobre escribir el metodo
     * ya que presentara ambiguedad
     */

    /**
     * Una interfaz con demasiada logica empieza a parecer mas una clase abstracta mal diseñada
     */

    public interface MyBehaviour{

        default String someLopgic(){
            System.out.println("alGUNA LOgica inherente a la interfaz");
            System.out.println("metodo opcional que puede sobnree escribirse sin ningun problema");
            return "";
        }

        class MyClass implements MyBehaviour{
            @Override
            public String someLopgic() {
                String result = MyBehaviour.super.someLopgic();
                System.out.println("m,as lofgica" + result);
                return "14";
            }
        }

    }

    public static void main(String[] args) {
        MyBehaviour a = new MyBehaviour.MyClass();
        a.someLopgic();
    }
}

