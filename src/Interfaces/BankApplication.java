package Interfaces;

public class BankApplication implements BankApplicationInterface {
    private String name;
    private Account[] accounts = new Account[1000];
    private int sizeOfAccounts = 0;

    public BankApplication() {
    }

    public BankApplication(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addAccount(Account a) {
        accounts[sizeOfAccounts] = a;
        sizeOfAccounts++;
    }

    @Override
    public void printAccounts() {
        for (int i = 0; i < sizeOfAccounts; i++) {
            System.out.println(accounts[i]);
        }
    }

    @Override
    public Account getMaxBalance() {
        double max = Integer.MIN_VALUE;
        int max_index = 0;
        for (int i = 0; i < sizeOfAccounts; i++) {
            if (accounts[i].getBalance() > max) {
                max = accounts[i].getBalance();
                max_index = i;
            }
        }
        return accounts[max_index];
    }
}
