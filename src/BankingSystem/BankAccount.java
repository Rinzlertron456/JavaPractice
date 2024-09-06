//Problem 10: Banking System
//Description: Create a banking system where you can create accounts and perform transactions. The
//BankAccount class should handle deposit and withdrawal operations. Implement custom exceptions
//InsufficientFundsException and InvalidAmountException to handle error cases.
//Requirements:
//• Create instances of BankAccount.
//• Handle exceptions when performing invalid transactions (e.g., withdrawing more than the
//balance or depositing/withdrawing a negative amount).
//• Print appropriate error messages for each exception.
//// Custom exceptions
//class InsufficientFundsException extends Exception {
// public InsufficientFundsException(String message) {
// super(message);
//} }
//class InvalidAmountException extends Exception {
// public InvalidAmountException(String message) {
// super(message);
//} }
//Sample Input 1:
//BankAccount account = new BankAccount("123456", 1000);
//account.deposit(500);
//account.withdraw(200);
//account.withdraw(1500);
//Sample Output 1:
//Deposited: $500.0, New Balance: $1500.0
//Withdrew: $200.0, New Balance: $1300.0
//Transaction Error: Insufficient funds for this withdrawal.
//Sample Input 2:
//BankAccount account = new BankAccount("123456", 1000);
//account.deposit(-100);
//Sample Output 2:
//Transaction Error: Deposit amount must be positive.
package BankingSystem;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    } }
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    } }


public class BankAccount{
    private static int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public BankAccount(String number, int balance) {
        setBalance(balance);
    }

    private String deposit(int amount) throws InvalidAmountException{
        if( amount < 0) {
            throw new InvalidAmountException(" Transaction Error: Deposit amount must be positive\n ");
        }
        balance += amount;
        return "Deposited: $" + (double) amount + " , New Balance: $" + (double) balance;
    }
    public static void main(String[] args) {
        try{
            BankAccount account = new BankAccount("123456", 1000);
            System.out.println(account.deposit(500));
            System.out.println(account.withdraw(200));
            System.out.println(account.withdraw(1500));
            System.out.println(account.deposit(-100));
        } catch(InsufficientFundsException infe ){
            System.out.println(infe.getMessage());
        } catch (InvalidAmountException infe ){
            System.out.println(infe.getMessage());
        }
        System.out.println(balance);
    }

    private String withdraw(int amount) throws InsufficientFundsException, InvalidAmountException{
        if( amount < 0 ) throw new InvalidAmountException("Transaction Error: Deposit amount must be positive\n");
        if(amount <= balance ) {
            balance -= amount;
            return "Withdrew: $"+ (double) amount +" , New Balance: $"+ (double) balance;
        }
        throw new InsufficientFundsException("Transaction Error: Insufficient funds for this withdrawal.\n");
    }
}
