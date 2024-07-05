package Generics;

import java.util.*;

public class Bank <T extends BankAccount> {
    private List<T> accounts = new ArrayList<>();

    public Bank() {
    }

    public Bank(List<T> accounts) {
        this.accounts = accounts;
    }

    public List<T> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<T> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(T account) {
        accounts.add(account);
    }

    public void removeAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber().equalsIgnoreCase(accountNumber)) {
                accounts.remove(accounts.get(i));
                break;
            }
        }
    }

    public T getAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber().equalsIgnoreCase(accountNumber)) {
                return accounts.get(i);
            }
        }
        return null;
    }
}
