package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple3 {
    public static void main(String[] args) {
        // 타입 생략 전
        MyFunction myFunction1 = (int a, int b) -> a + b;

        System.out.println("myFunction1 = " + myFunction1.apply(3, 4));

        //MyFunction 타입을 통해 타입 추론 가능, 람다는 타입 생략 가능
        MyFunction myFunction2 = ( a, b) ->  a + b;

        System.out.println("myFunction2 = " + myFunction2.apply(3, 4));
    }
}
