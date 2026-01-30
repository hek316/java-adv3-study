package nested.inner.ex2;


public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println( model + " 시작  -car");
    }

    private class Engine {

        public void start() {

            //  내부 클래스는 바깥 클래스의 인스턴스 변수에 접근 할 수 있음
            System.out.println("충전 레벨 확인 : " + chargeLevel + " -car");
            System.out.println(model + " 의 엔진을 구동합니다. -car");
        }
    }

}