package nested.nested.ex1;


// Network 객체 안에서만 사용
public class NetworkMesssage {

    private String content;

    public NetworkMesssage(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }
}
