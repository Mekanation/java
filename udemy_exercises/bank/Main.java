package udemy_exercises.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Chase Bank");

        bank.addBranch("Arlington");
        bank.addCustomer("Arlington", "Bob", 10000.00);
        bank.addCustomer("Arlington", "Rick", .001);

        bank.addBranch("Dallas");

        bank.addCustomer("Dallas", "Richy Rich", 1000000.00);

        bank.addCustomerTransaction("Arlington","Bob", 30);
        bank.listCustomers("Arlington", true);
    }
}
