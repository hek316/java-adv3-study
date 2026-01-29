package nested.nested.ex2;


public class Network {

    private static class NetworkMesssage {

        private String content;

        public NetworkMesssage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }

    public void sendMessage(String text) {
        NetworkMesssage networkMesssage = new NetworkMesssage(text);
        networkMesssage.print();
    }
}