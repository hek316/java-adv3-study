package lambda.start;

import java.util.Random;

// 익명 클래스 사용
public class Ex1ReFMainV2 {

    public static void hello(Procedure play) {
        long startNs = System.nanoTime();
        //코드 조각 시작
        play.run();
        //코드 조각 종료
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }


    public static void main(String[] args) {

        Procedure dice =  new Procedure() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };

        Procedure sum = new Procedure(){
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };
        hello(dice);
        hello(sum);

    }
}
