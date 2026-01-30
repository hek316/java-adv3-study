package nested.anonymous.ex;


import java.util.Random;

public class Ex1RedMain {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    static class Dice implements Process {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6);
            System.out.println("주사위  = " + randomValue);
        }
    }

    static class Sum implements Process {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6);
            System.out.println("주사위  = " + randomValue);
        }
    }



    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }
}
