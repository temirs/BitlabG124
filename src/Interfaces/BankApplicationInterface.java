package Interfaces;

interface BankApplicationInterface {
    void addAccount(Account a); // Добавляет новый объект Account
    void printAccounts(); // Выводит данные, которые есть в массиве accounts
    Account getMaxBalance(); // Возвращает аккаунт, у которого больше всех денег
}
