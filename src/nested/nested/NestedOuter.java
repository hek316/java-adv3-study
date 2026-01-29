package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested{
        private int nestedInstanceValue = 1;

        // print()는 Nested의 인스턴스 메서드 이기 때문에, 같은 인스턴스에 속한 인스턴스 변수(nestedInstanceValue)에 접근할 수 있다.
        public void print() {

            //자신에 멤버에 접근
            System.out.println(nestedInstanceValue);


            // 바깥 클래스의 인스턴스 멤버에는 접근 할 수 없다
            //System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private 도 가능
            System.out.println(NestedOuter.outClassValue);
        }

    }
}
