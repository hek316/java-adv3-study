package lambda.lambda1;

import lambda.start.Procedure;

public class LambdaSimple2 {
    public static void main(String[] args) {

        // 매개변수, 반환 값이 없는 경우
        Procedure procedure1 = () -> {
            System.out.println("Hello lambda");
        };
        procedure1.run();

        // 단일 표현식은 중괄호 생략 가능
        Procedure procedure2 = () -> System.out.println("Hello Lambda");
        procedure2.run();
    }
}
