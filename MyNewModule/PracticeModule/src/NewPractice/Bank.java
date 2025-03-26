package NewPractice;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankClient> clients = new ArrayList<>();

    public void addClient(BankClient client) {
        clients.add(client);
    }

    public void printAllClients() {
        for (BankClient client : clients) {
            System.out.println(client.getInfo());
        }
    }
}
