package nested.anonymous;


import nested.nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void  process(int paramVar) {
        int localVar = 1;


        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.getClass() = " + printer.getClass());


    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);

    }
}
