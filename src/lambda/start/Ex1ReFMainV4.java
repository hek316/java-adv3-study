package lambda.start;

import java.util.Random;

// 람다 사용
public class Ex1ReFMainV4 {

    public static void hello(Procedure play) {
        long startNs = System.nanoTime();
        //코드 조각 시작
        play.run();
        //코드 조각 종료
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }


    public static void main(String[] args) {

        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });
        hello(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        });

    }
}
