package day21;

public class Step2 {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("account"+ account);

        account.withdraw(30000);
    }
}
