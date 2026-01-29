package nested.nested.ex1;

public class Network {

    public void sendMessage(String text) {
        NetworkMesssage networkMesssage = new NetworkMesssage(text);
        networkMesssage.print();
    }
}
