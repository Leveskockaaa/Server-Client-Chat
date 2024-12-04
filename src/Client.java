import java.util.ArrayList;
import java.util.List;

public class Client {
    private final String userName;
    private final List<String> messageLog;

    public Client(String name) {
        userName = name;
        messageLog = new ArrayList<>();
    }

    public void addMessage(String message) {
        messageLog.add(message);
    }

    public void printMessages() {
        for (String message : messageLog) {
            System.out.println(userName + ": " + message);
        }
    }
}
