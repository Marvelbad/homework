//package NewPractice;
//
//public class BankClient {
//
//    private int id;
//    private String name;
//    private String lastname;
//    private double balance;
//
//    public BankClient(String name, String lastname, double balance) {
//        this.name = name;
//        this.lastname = lastname;
//        this.balance = balance;
//        this.id = counter++;
//    }
//
//    private static int counter = 1;
//
//    public String getInfo() {
//        return "ID: " + id + ", Клиент: " + name + " " + lastname + " " + " Баланс: " + +balance + " RUB.";
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    /**
//     * Возвращает строку с текущим балансом клиента.
//     */
//    public String checkBalance() {
//        return "Клиент: " + name + " " + lastname + " , остаток на счете: " + balance + " RUB.";
//    }
//
//    /**
//     * Пополняет счёт клиента на указанную сумму.
//     *
//     * @param amount сумма пополнения
//     * @return обновлённый баланс
//     */
//    public double deposit(double amount) {
//        System.out.println("Пополнение, счет RUB: " + amount);
//        balance = balance + amount;
//        return balance;
//    }
//
//    /**
//     * Снимает указанную сумму со счёта, если хватает средств.
//     *
//     * @param amount сумма снятия
//     * @return текущий баланс после операции
//     */
//    public double withDraw(double amount) {
//        if (balance >= amount) {
//            System.out.println("Снятие наличных: " + amount + "RUB.");
//            balance -= amount;
//        } else {
//            System.out.println("Недостаточно средств.");
//        }
//        return balance;
//    }
//
//}
