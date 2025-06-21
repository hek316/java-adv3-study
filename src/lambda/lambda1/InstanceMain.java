package lambda.lambda1;

import lambda.start.Ex0Main;
import lambda.start.Ex1Main;
import lambda.start.Procedure;

public class InstanceMain {
    public static void main(String[] args) {
        Ex0Main main = new Ex0Main();
        System.out.println("class.class= " + main.getClass());
        System.out.println("class.instancec= " + main);

        Ex1Main main2 = new Ex1Main();
        System.out.println("class.class= " + main2.getClass());
        System.out.println("class.instancec= " + main2);

        Procedure procedure1 = new Procedure(){
            @Override
            public void run() {
                System.out.println("Hello lambda");
            }
        };

        System.out.println("class.class= " + procedure1.getClass());
        System.out.println("class.instance" + procedure1);

        Procedure procedure2 = () -> {
            System.out.println("Hello lambda");
        };

        System.out.println("class.class= " + procedure2.getClass());
        System.out.println("class.instance" + procedure2);

        /*
         * 실행 결과를 통해 확인할 수 있는 점:
         * - 람다식도 런타임에 클래스가 생성되고 인스턴스가 만들어진다.
         * - 익명 클래스는 명확한 이름 없는 클래스가 생성되며,
         *   람다는 JVM이 내부적으로 생성한 특별한 클래스(보통 invoke dynamic 방식)를 사용한다.
         */

    }
}
