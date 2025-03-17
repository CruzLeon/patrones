package com.javastudy.javacore.service.solid;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class I {

    /**
     * Segregacion de interfaces
     *
     * No hay que obligar a las clases a implementar metodos que no van a usar,
     *
     * esto sucede cuando hay interfaces muy grandes que definen multiples comportamientos
     * Para alguna circunstancia una clase no debera implementar todos estos metodos,
     *
     * Por lo que el principio establece que es mejor dividir en interfaces mas pequeñas y especificas
     */

    interface MultipleBehaviours{

        void behaviourOne();
        void behaviourTwo();
    }
    class Some implements MultipleBehaviours{

        @Override
        public void behaviourOne() {

        }

        @Override
        public void behaviourTwo() {
            /**
             * Esta clase no tiene por que hacer nada con este comportamientos por lo que rompe el principio de segregacion de interfaces
             */
        }
    }

    interface BehaviourOne{ void someLogic();}
    interface BehaviourTwo{}

    class SomeTwo implements BehaviourOne{

        @Override
        public void someLogic() {
            /**
             * Correcto ersta clase solo debe implementar o hacer algo en este comportamiento y no con optros
             */
        }
    }
}
