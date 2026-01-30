package nested.anonymous.ex;


import java.util.Random;

// 람다 활용
public class Ex5RedMain {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(() ->{
                int randomValue = new Random().nextInt(6);
                System.out.println("주사위  = " + randomValue);
        });
        hello(() -> {
                int randomValue = new Random().nextInt(6);
                System.out.println("주사위  = " + randomValue);
        });
    }
}
