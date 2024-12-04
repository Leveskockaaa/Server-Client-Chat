public class Main {
    public static void main(String[] args) {
        Client client = new Client("Nemecsek");
        client.addMessage("Egy-két-há");
        client.addMessage("dínom-dánom");
        client.addMessage("Igyon kend!");

        client.printMessages();
    }
}
